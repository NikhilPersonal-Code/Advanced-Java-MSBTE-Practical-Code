import java.awt.*;
public class exercise2 extends Frame{
    exercise2(String title){
        super(title);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(500,500);
        List cities = new List(5,false);
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Ahmedabad");
        cities.add("Chennai");
        cities.add("Kolkata");
        cities.add("Pune");
        cities.add("Jaipur");
        cities.add("Surat");
        cities.add("Lucknow");
        cities.setSize(100,100);
        add(cities);
    }
    public static void main(String[] args) {
        new exercise2("List Of Cities");
    }
}
