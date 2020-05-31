package haszowanie;

public class IteratorTable implements Iterator
{
    private final Object tabStudents[];
    private final int first;
    private final int last;
    private int current = -1;

    public IteratorTable(Object[] tabStudents,int first,int last)
    {
        this.tabStudents = tabStudents;
        this.first = first;
        this.last = first + last - 1;
    }

    public IteratorTable(Object tabStudents[])
    {
        this.tabStudents = tabStudents;
        first = 0;
        last = tabStudents.length - 1;
    }

    @Override
    public void first()
    {
        current = first;
    }

    @Override
    public void last()
    {
        current = last;
    }

    @Override
    public void previous()
    {
        --current;
    }

    @Override
    public void next()
    {
        ++current;
    }

    @Override
    public boolean isDone()
    {
        return current < first || current > last;
    }

    @Override
    public Object current()
    {
        return tabStudents[current];
    }
}
