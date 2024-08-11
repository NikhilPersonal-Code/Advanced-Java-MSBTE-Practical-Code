import java.awt.*;

public class programCode extends Frame{
    programCode(String title){
        super(title);
        setVisible(true);
        setSize(500,500);
        List seasons = new List(3,false);
        seasons.add("Summer");
        seasons.add("Winter");
        seasons.add("Rainy");
        seasons.setSize(50,50);
        add(seasons);
    }
    public static void main(String[] args) {
        new programCode("Seasons List");
    }
}