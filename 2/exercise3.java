import java.awt.*;
public class exercise3 extends Frame{
    exercise3(String title){
        super(title);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        List newspapers = new List(10,true);
        newspapers.add("The Times of India");
        newspapers.add("Hindustan Times");
        newspapers.add("The Hindu");
        newspapers.add("The Indian Express");
        newspapers.add("Deccan Chronicle");
        newspapers.add("The Economic Times");
        newspapers.add("The Telegraph");
        newspapers.add("The Statesman");
        newspapers.add("The Tribune");
        newspapers.add("The Pioneer");
        newspapers.add("The Asian Age");
        newspapers.setSize(100,100);
        add(newspapers);
    }
    public static void main(String[] args) {
        new exercise3("List Of Newspapers");
    }
}
