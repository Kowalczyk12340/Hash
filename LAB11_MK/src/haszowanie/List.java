package haszowanie;

public interface List
{
    int size();
    void clear();
    boolean isEmpty();
    void add(Object object);
    void insert(Object object, int index) throws IndexOutOfBoundsException;
    void set(Object object, int index) throws IndexOutOfBoundsException;
    Object get(int index) throws IndexOutOfBoundsException;
    Object remove(int index) throws IndexOutOfBoundsException;
    boolean contains(Object object);
}
