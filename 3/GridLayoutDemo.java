import java.awt.*;
public class GridLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo");
        frame.setLayout(new GridLayout(3,2,35,35));
        frame.setVisible(true);
        frame.setSize(400,400);
        for (int i = 1; i <=5 ; i++) {
            Button button = new Button("Button "+i);
            button.setSize(100,30);
            frame.add(button);
        }
    }
}
