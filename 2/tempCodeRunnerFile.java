import java.awt.*;
public class choiceExample extends Frame{
    choiceExample(String title){
        super(title);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        Choice subject = new Choice();
        subject.add("C++");
        subject.add("Java");
        subject.add("Python");
        subject.add("Javascript");
        subject.add("Ruby");
        subject.add("Dart");
        subject.add("Typescript");
        subject.setSize(100,100);
        add(subject);
    }
    public static void main(String[] args) {
        new choiceExample("Choice Example");
    }
}
