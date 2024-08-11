import java.awt.*;
public class q1 extends  Frame {
    q1(String title){
        super(title);
        setVisible(true);
        setSize(500,500);
        Label message = new Label("Welcome To Java");
        message.setAlignment(Label.CENTER);
        add(message);
    }
    public static void main(String[] args) {
        new q1("First Program");
    }
} 