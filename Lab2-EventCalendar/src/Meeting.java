import java.time.LocalDateTime;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Meeting extends Event implements Completable{
    private LocalDateTime endDateTime;
    private String location;
    Boolean complete = false;

    public Meeting(String meetingOrintation, LocalDateTime start, LocalDateTime end, String location) {
        setName(meetingOrintation);
        endDateTime = end;
        this.location = location;
        setDateTime(start);
    }

    @Override
    public void complete() {
        complete = true;
    }

    @Override
    public boolean isComplete() {
        return complete;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDuration() {
        int duration;
        duration = (int) ChronoUnit.HOURS.between(getDateTime(), endDateTime);
        return duration;
    }
}
