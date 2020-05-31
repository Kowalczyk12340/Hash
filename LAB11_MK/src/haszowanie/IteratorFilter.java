package haszowanie;

public class IteratorFilter implements Iterator
{
    private final Iterator iteratorFilter;
    private final Predicate predicate;  // dla określenia efektu filtracji

    public IteratorFilter(Iterator iteratorFilter, Predicate predicate)
    {
        this.iteratorFilter=iteratorFilter;
        this.predicate=predicate;
        iteratorFilter.first();
    }

    private void filterForward()
    {
        while (!iteratorFilter.isDone() && !predicate.accept(iteratorFilter.current()))
            iteratorFilter.next();
    }

    private void filterBackwards()
    {
        while( !iteratorFilter.isDone() && !predicate.accept(iteratorFilter.current()))
            iteratorFilter.previous();
    }

    @Override
    public void first()
    {
        iteratorFilter.first();
        filterForward();
    }

    @Override
    public void last()
    {
        iteratorFilter.last();
        filterBackwards();
    }

    @Override
    public void next() {
        iteratorFilter.next();
        filterForward();
    }

    @Override
    public void previous()
    {
        iteratorFilter.previous();
        filterBackwards();
    }

    @Override
    public boolean isDone()
    {
        return iteratorFilter.isDone();
    }

    @Override
    public Object current()
    {
        return iteratorFilter.current();
    }
}
