package haszowanie;

public class Student implements Comparable
{
    public String name;
    public String surname;
    public int nrIndex;

    public Student(String name, String surname,int nrIndex)
    {
        this.name = name;
        this.surname = surname;
        this.nrIndex = nrIndex;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setNrIndex(int nrIndex)
    {
        this.nrIndex = nrIndex;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getNrIndex()
    {
        return nrIndex;
    }

    @Override
    public int compareTo(Object drugi)
    {
        if(this.nrIndex == ((Student) drugi).getNrIndex())
        {
            return 1;
        }
        else if(this.nrIndex < ((Student) drugi).getNrIndex())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    @Override
    public boolean equals(Object drugi)
    {
            return this.getNrIndex() == ((Student)drugi).getNrIndex();
    }

    @Override
    public String toString()
    {
            String bufor ="";
            return bufor += name+" "+surname+" "+nrIndex +"\n";
    }
}
