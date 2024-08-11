import java.awt.*;
public class q3  extends Frame{
    q3(String title){
        super(title);
        setVisible(true);
        setSize(500,500);
        Checkbox hindi = new Checkbox("Hindi");
        Checkbox marathi = new Checkbox("Marathi");
        Checkbox english = new Checkbox("English");
        Checkbox sanskrit = new Checkbox("Sanskrit");
        hindi.setBounds(250, 250, 50, 50);
        marathi.setBounds(250, 300, 50, 50);
        english.setBounds(250, 350, 50, 50);
        sanskrit.setBounds(250, 400, 50, 50);
        add(hindi);
        add(marathi);
        add(english);
        add(sanskrit);
    }
    public static void main(String[] args) {
        new q3("Second Program");
    }
}
