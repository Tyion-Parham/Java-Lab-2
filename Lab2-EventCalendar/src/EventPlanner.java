import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class EventPlanner {
    public static void main(String[] args) {
        // Register frame
        JFrame frame = new JFrame("Event Planner");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setBackground(Color.magenta);
    }


    public static void addDefaultEvents(Event EventPanel){
        LocalDateTime deadline = LocalDateTime.of(2024, 12, 7, 17, 0);
        Deadline firstDeadline = new Deadline("First Deadline", deadline.minusDays(20) );
    }
}
