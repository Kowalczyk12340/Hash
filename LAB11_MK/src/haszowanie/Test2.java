package haszowanie;

public class Test2
{
    public static void main(String[] args)
    {
        HashMap hashMap = new HashMap();
        System.out.println("Dodanie 6 wydarzeń i wyświetlenie ich:");
        hashMap.addEvent(new Event(17,5,2002,"Mecz"));
        hashMap.addEvent(new Event(29,11,2004,"Spotkanie"));
        hashMap.addEvent(new Event(31,12,1981,"Challange"));
        hashMap.addEvent(new Event(1,3,1934,"Urodziny"));
        hashMap.addEvent(new Event(14,2,2000,"Wycieczka"));
        hashMap.addEvent(new Event(5,5,2003,"Lekcja"));
        System.out.println(hashMap.tab[2002]);
        System.out.println(hashMap.tab[2004]);
        System.out.println(hashMap.tab[1981]);
        System.out.println(hashMap.tab[1934]);
        System.out.println();
        System.out.println("Szukanie wydarzenia z dnia 31-12-1981:");
        System.out.println(hashMap.searchEvent(new Event(31,12,1981,"Challange")));
        System.out.println();
        System.out.println("Usunięcie wydarzenia z dnia 14-02-2000:");
        hashMap.deleteEvent(new Event(14,2,2000,"Wycieczka"));
        System.out.println();
        System.out.println("Szukanie wydarzenia z dnia 05-05-2003:");
        System.out.println(hashMap.searchEvent(new Event(5,5,2003,"Lekcja")));
        System.out.println();
        System.out.println("Szukanie wydarzenia z dnia 17-05-2002:");
        System.out.println(hashMap.searchEvent(new Event(17,5,2002,"Mecz")));
    }
}
