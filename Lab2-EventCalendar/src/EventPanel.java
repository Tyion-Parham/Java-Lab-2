import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class EventPanel extends JPanel {
    private Event event;
    private JButton completeButton;

    public EventPanel(Event event) {
        this.event = event;
        this.setLayout(new GridLayout(2, 1));
        this.setBackground(Color.WHITE);
        completeButton = new JButton("Complete");
        completeButton.setOnClickListener
    }
}
