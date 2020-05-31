package haszowanie;

public class IteratorHash implements Predicate
{
    public boolean accept(Object s)
    {
        return ((Student)s)!=null;
    }

}
