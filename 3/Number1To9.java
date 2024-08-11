import java.awt.*;
public class Number1To9 {
    public static void main(String[] args) {
        Frame frame = new Frame("Number 1 to 9");
        frame.setLayout(new GridLayout(4,4,5,5));
        frame.setVisible(true);
        frame.setSize(400,400);
        for (int i = 0; i <=9; i++) {
            Button button = new Button(i+"");
            frame.add(button);
        }
    }    
}