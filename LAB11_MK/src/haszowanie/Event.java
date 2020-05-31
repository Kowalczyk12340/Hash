package haszowanie;

public class Event
{
    private int day;
    private int month;
    private int year;
    private String description;
    private Event next;

    public Event(int day, int month, int year, String description)
    {
        this.day = day;
        this.month = month;
        this.year = year;
        this.description = description;
        this.next = null;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event getNext() {
        return next;
    }

    public void setNext(Event next) {
        this.next = next;
    }

    public boolean equals(Object second)
    {
        if(second == null)
        {
            return false;
        }
        if(second instanceof Event)
        {
            Event event = (Event)second;
            if(this.day == event.getDay() && this.month == event.getMonth() && this.year == event.getYear() && this.description == event.getDescription())
            {
                return true;
            }
        }
        return false;
    }

    public int compareTo(Object second)
    {
        Event event = (Event)second;
        int stuff = Integer.compare(this.year,event.getYear());
        if(stuff == 0)
        {
            stuff = Integer.compare(this.month,event.getMonth());
            if(stuff == 0)
            {
                stuff = Integer.compare(this.day,event.getDay());
            }
        }
        return stuff;
    }

    @Override
    public String toString()
    {
        return "Event{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", next=" + next +
                '}';
    }
}
