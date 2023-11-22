import java.awt.*;
import java.awt.event.WindowAdapter;

public class calculator extends WindowAdapter {

    Frame frame;

    calculator() {

        frame = new Frame();

        frame.setTitle("Title X");
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(this);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new calculator();
    }

}
