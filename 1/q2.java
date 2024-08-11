import java.awt.*;
public class q2 extends Frame {
    q2(String title) {
        super(title);
        setVisible(true);
        setLayout(new FlowLayout());
        Button OK = new Button("OK");
        OK.setBackground(Color.GREEN);
        Button RESET = new Button("RESET");
        RESET.setBackground(Color.CYAN);
        Button CLEAR = new Button("CLEAR");
        CLEAR.setBackground(Color.RED);
        OK.setSize(50, 50);
        RESET.setSize(50, 50);
        CLEAR.setSize(50, 50);
        setSize(500, 500);
        add(CLEAR);
        add(OK);
        add(RESET);
    }

    public static void main(String[] args) {
        new q2("Third Program");
    }
}