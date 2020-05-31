package haszowanie;

public class Test1
{
    public static void main(String[] args)
    {
        Deanery deanery = new Deanery();
        System.out.println("Dodanie 6 studentów i wyświetlenie ich w kolejności rosnącej: ");
        deanery.addStudent(new Student("Marcin","Kowalczyk",765));
        deanery.addStudent(new Student("Jacek","Magiera",234));
        deanery.addStudent(new Student("Mariusz","Jop",412));
        deanery.addStudent(new Student("Dawid","Pop",819));
        deanery.addStudent(new Student("Tomasz","Górny",453));
        deanery.addStudent(new Student("Jan","Górny",403));
        IteratorTable iteratorTable = new IteratorTable(deanery.tab);
        IteratorHash iteratorHash = new IteratorHash();
        IteratorFilter iteratorFilter = new IteratorFilter(iteratorTable,iteratorHash);
        for (iteratorFilter.first(); !iteratorFilter.isDone(); iteratorFilter.next())
        {
            Student student = (Student) iteratorFilter.current();
            System.out.println(student);
        }
        System.out.println();
        System.out.println("szukanie studenta o numerze indeksu 13:");
        System.out.println(deanery.searchStudent(new Student("Jacek","Magiera",234)));
        System.out.println();
        System.out.println("usuniecie studenta o numerze indeksu 819 i wyświetlenie  w kolejności rosnącej:");
        deanery.deleteStudent(819);
        iteratorTable = new IteratorTable(deanery.tab);
        iteratorHash=new IteratorHash();
        iteratorFilter = new IteratorFilter(iteratorTable,iteratorHash);
        for (iteratorFilter.first(); !iteratorFilter.isDone(); iteratorFilter.next())
        {
            Student student = (Student) iteratorFilter.current();
            System.out.println(student);
        }
        System.out.println();
        System.out.println("szukanie studenta o numerze indeksu 13:");
        System.out.println(deanery.searchStudent(new Student("Marcin","Kowalczyk",765)));
        System.out.println();
        System.out.println("Dodanie studenta o indeksie 111:");
        deanery.addStudent(new Student("Jacek","Głupi",111));
    }
}
