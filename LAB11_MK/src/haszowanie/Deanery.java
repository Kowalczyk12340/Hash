package haszowanie;

import java.util.Arrays;

public class Deanery
{
    private int size = 1000;
    public Student[] tab;

    public Deanery()
    {
        tab = new Student[size];
    }

    public Deanery(int size)
    {
        this.size=size;
        tab = new Student[size];
    }

    public void addStudent(Student student)
    {
        try
        {
            if(student.getNrIndex() < 1 || student.getNrIndex()>1000)
            {
                throw new OutOfRangeException("niewłaściwy indeks");
            }
            tab[student.getNrIndex()-1] = student;
        }
        catch(OutOfRangeException e)
        {
            System.err.println("podano niewłaściwy indeks");
        }
    }

    public Student deleteStudent(int nrIndex)
    {
        try
        {
            if(nrIndex < 1|| nrIndex > 1000) throw new RuntimeException("niewłaściwy indeks");
            if(tab[nrIndex-1]!=null)
            {
                Student tmp=tab[nrIndex-1];
                tab[nrIndex-1]=null;
                return tmp;
            }
        }
        catch(RuntimeException e)
        {
            System.out.println("podano niewłaściwy indeks");
        }
        return null;
    }

    public boolean searchStudent(Student student)
    {
        try{
            if(student.getNrIndex() < 1 || student.getNrIndex() > 1000)
            {
                throw new OutOfRangeException("niewłaściwy indeks");
            }
            if(tab[student.getNrIndex()-1] != null)
            {
                if(tab[student.getNrIndex()-1].equals(student))
                {
                    return true;
                }
            }
        }
        catch(OutOfRangeException e)
        {
            System.err.println("podano niewłaściwy indeks");
        }
        return false;
    }
}
