import java.awt.*;
public class GridLayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Calculator");
        frame.setLayout(new GridLayout(4,4,5,5));
        frame.setVisible(true);
        frame.setSize(400,400);
        final String[][] BUTTON_TEXTS = {
            {"7", "8", "9", "+"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "*"},
            {"0", ".", "/", "="}
        };
        for (int i = 0; i < BUTTON_TEXTS.length; i++) {
            for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
                Button button = new Button(BUTTON_TEXTS[i][j]);
                frame.add(button);
            }
        }
    }   
}