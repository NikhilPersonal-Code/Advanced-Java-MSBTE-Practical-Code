import java.awt.*;
public class BorderLayoutProgram {
    public static void main(String[] args) {
        Frame frame = new Frame("Demo");
        frame.setLayout(new BorderLayout(3,3));
        frame.setVisible(true);
        frame.setSize(400,400);

        Button northButton = new Button("North");
        frame.add(northButton,BorderLayout.NORTH);
        
        Button westButton = new Button("West");
        frame.add(westButton,BorderLayout.WEST);
        
        Button centerButton = new Button("Center");
        frame.add(centerButton,BorderLayout.CENTER);
        
        Button eastButton = new Button("East");
        frame.add(eastButton,BorderLayout.EAST);
        
        Button southButton = new Button("North");
        frame.add(southButton,BorderLayout.SOUTH);
    }
}
