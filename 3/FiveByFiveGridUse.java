import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FiveByFiveGridUse implements ActionListener {
    StringBuilder stringBuilder = new StringBuilder();
    FiveByFiveGridUse fiveByFiveGridUse = this;
    public static void main(String[] args) {
        FiveByFiveGridUse fiveByFiveGridUse=new FiveByFiveGridUse(); 
        fiveByFiveGridUse.createUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Button source = (Button) e.getSource();
        stringBuilder.append(source.getLabel());
        if(stringBuilder.toString().equals("NIKHIL")){
            System.exit(0);
        }
    }
    public void createUI(){
        Frame frame = new Frame("Use Of 5X5 Grid");
        frame.setLayout(new GridLayout(5,5));
        frame.setVisible(true);
        frame.setSize(500,500); final String[][] BUTTON_TEXTS = {
            {"M", "K", "Q", "K","H"},
            {"Q", "R", "A", "A","E"},
            {"S", "H", "I", "A","L"},
            {"K", "N", "E", "D","I"},
            {"G", "R", "E", "A","T"}
        };
        for (int i = 0; i < BUTTON_TEXTS.length; i++) {
            for (int j = 0; j < BUTTON_TEXTS[i].length; j++) {
                Button button = new Button(BUTTON_TEXTS[i][j]);
                button.addActionListener(this);
                frame.add(button);
            }
        }
    }
}
