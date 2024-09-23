import java.time.LocalDateTime;

public abstract class Event implements Comparable<Event> {
    private String name;
    private LocalDateTime DateTime;
    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setDateTime(LocalDateTime d) { DateTime = d; }
    public LocalDateTime getDateTime() { return DateTime; }

    public int compareTo(Event e) {
        if (this.DateTime.isAfter(e.DateTime))
            return 1;
        else if (this.DateTime.isBefore(e.DateTime))
            return -1;
        else if (this.DateTime.isEqual(e.DateTime))
            return 0;

        return 0;
    }
}

