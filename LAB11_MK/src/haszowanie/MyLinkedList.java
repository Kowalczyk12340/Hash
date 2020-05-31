package haszowanie;

public class MyLinkedList implements List
{
    public class Node
    {
        public Object object;
        public Node next;
        public Node(Object object)
        {
            this.object = object;
            next = null;
        }
    }
    private int size;
    private Node first;
    private Node last;
    public MyLinkedList()
    {
        clear();
    }
    public Node getFirst()
    {
        return first;
    }
    public Node getLast()
    {
        return last;
    }
    public int size()
    {
        return size;
    }
    public void clear()
    {
        first = last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean czyPusta()
    {
        return size == 0;
    }
    public void add(Object object)
    {
        Node node = new Node(object);
        if(isEmpty())
            first=last=node;
        else{
            last.next=node;
            last=node;
        }
        size++;
    }
    public void insert(Object wartosc, int indeks) throws IndexOutOfBoundsException
    {
        if(indeks < 0 || indeks > size)
            throw new IndexOutOfBoundsException("Niewłaściwy indeks!");
        Node nowy = new Node(wartosc);
        if(indeks==0){
            if(czyPusta()){
                first=nowy;
                last=nowy;
            }
            else{
                nowy.next=first;
                first=nowy;
            }
        }
        else{
            Node tmp = first;
            int ile=1;
            while(tmp != null)
            {
                if(ile==indeks) {
                    if(indeks==size){
                        last.next = nowy;
                        last = nowy;
                    }
                    else{
                        nowy.next=tmp.next;
                        tmp.next=nowy;
                    }
                }
                tmp = tmp.next;
                ile++;
            }
        }
        size++;
    }
    public void set(Object wartosc, int indeks) throws IndexOutOfBoundsException
    {
        if(indeks < 1 || indeks > size)
            throw new IndexOutOfBoundsException("Niewłaściwy indeks!");
        Node tmp = first;
        int ile=1;
        while(tmp != null)
        {
            if(ile==indeks){
                tmp.object=wartosc;
                break;
            }
            tmp = tmp.next;
            ile++;
        }
        tmp.object = wartosc;
    }
    public Object get(int indeks) throws IndexOutOfBoundsException
    {
        if(indeks < 1 || indeks > size)
            throw new IndexOutOfBoundsException("Niewłaściwy indeks!");

        Node tmp = first;
        int ile=1;
        while(tmp != null)
        {
            if(ile==indeks)
                return tmp.object;
            tmp = tmp.next;
            ile++;
        }
        return tmp.object;
    }
    public Object remove(int indeks) throws IndexOutOfBoundsException
    {
        if(indeks < 1 || indeks > size)
        {
            throw new IndexOutOfBoundsException("Niewłaściwy indeks!");
        }
        Node node;
        if(indeks == 1)
        {
            node = first;
            first = first.next;
            if(first == null)
                last = first;
        }
        else
        {
            Node tmp = first;
            int i = 1;
            while(i+1 < indeks)
            {
                tmp = tmp.next;
                i++;
            }
            node = tmp.next;
            tmp.next = tmp.next.next;
            if(tmp.next == null)
                last = tmp;
        }
        size--;
        return node.object;
    }
    public boolean contains (Object wartosc)
    {
        Node tmp = first;
        while(tmp != null)
        {
            if(wartosc.equals(tmp.object))
                return true;
            tmp = tmp.next;
        }
        return false;
    }
    public String toString()
    {
        String bufor = "";
        Node tmp = first;
        int ile=1;
        while(tmp != null)
        {
            bufor+=ile+". "+tmp.object+"\n";
            ile++;
            tmp = tmp.next;
        }
        return bufor;
    }

}

