import java.time.LocalDateTime;

public class Deadline extends Event implements Completable {
    String Deadline;
    boolean complete = false;

    public Deadline(String Deadline, LocalDateTime localDateTime) {
        super();

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String n) {
        super.setName(n);
    }

    @Override
    public void setDateTime(LocalDateTime d) {
        super.setDateTime(d);
    }

    @Override
    public LocalDateTime getDateTime() {
        return super.getDateTime();
    }

    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }
    @Override
    public void complete() {
        complete = true;
    }

    @Override
    public boolean isComplete() {
        return complete;
    }
}
