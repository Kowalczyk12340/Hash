package haszowanie;

public class HashMap
{
    MyLinkedList tab[];

    public HashMap()
    {
        tab = new MyLinkedList[2021];
    }

    public void addEvent(Event event)
    {
        try
        {
            if(event.getYear() < 0 || event.getYear() > 2020)
            {
                throw new OutOfRangeException("Niewłaściwy rok");
            }
            if(tab[event.getYear()] == null)
            {
                tab[event.getYear()] = new MyLinkedList();
            }
            tab[event.getYear()].add(event);
        }
        catch(OutOfRangeException e)
        {
            System.err.println("Podano niewłaściwy rok");
        }
    }

    public void deleteEvent(Event event)
    {
        try
        {
            if(event.getYear() < 0 || event.getYear() > 2020)
            {
                throw new OutOfRangeException("Niewłaściwy rok");
            }
            IteratorLinkedList iteratorLinkedList = new IteratorLinkedList(tab[event.getYear()]);
            int i = 0;
            for(iteratorLinkedList.first();!iteratorLinkedList.isDone();iteratorLinkedList.next())
            {
                i++;
                if(iteratorLinkedList.current().equals(event))
                {
                    break;
                }
            }
            tab[event.getYear()].remove(i);
        }
        catch(OutOfRangeException e)
        {
            System.err.println("Podano niewłaściwy rok");
        }
    }

    public boolean searchEvent(Event event)
    {
        try
        {
            if(event.getYear() < 0 || event.getYear() > 2020)
            {
                throw new OutOfRangeException("Niewłaściwy rok");
            }
            IteratorLinkedList iteratorLinkedList = new IteratorLinkedList(tab[event.getYear()]);
            for(iteratorLinkedList.first();!iteratorLinkedList.isDone();iteratorLinkedList.next())
            {
                if(iteratorLinkedList.current().equals(event))
                {
                    return true;
                }
            }
        }
        catch(OutOfRangeException e)
        {
            System.err.println("Podano niewłaściwy rok");
        }
        return false;
    }
}
