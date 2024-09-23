

public class Deadline extends Event implements Completable {
    boolean completed = false;

    @Override
    public void complete() {
        completed = true;
    }

    @Override
    public boolean isCompleted() {
        return completed;
    }
}
