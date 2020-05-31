package haszowanie;

public class IteratorLinkedList implements Iterator
{
    private MyLinkedList myLinkedList;
    private MyLinkedList.Node current;
    public IteratorLinkedList(MyLinkedList myLinkedList)
    {
        this.myLinkedList = myLinkedList;
        current = null;
    }

    public void previous()
    {
        MyLinkedList.Node temp = current;
        if(temp == myLinkedList.getFirst())
        {
            current = null;
        }
        else
        {
            first();
            while(current.next != temp)
            {
                next();
            }
        }
    }
    public void next()
    {
        current = current.next;
    }
    public void first()
    {
        current = myLinkedList.getFirst();
    }
    public void last()
    {
        current = myLinkedList.getLast();
    }
    public boolean isDone()
    {
        return current == null;
    }
    public Object current()
    {
        return current.object;
    }
}
