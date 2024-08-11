import java.awt.*;
import java.awt.event.*;

class Addition extends Frame implements ActionListener {
  Label l1, l2, l3, l4;
  TextField t1, t2;
  Button b1;

  Addition() {
    setSize(400, 400);
    setVisible(true);
    setLayout(new FlowLayout());

    l1 = new Label("Enter num 1:- ");
    l2 = new Label("Enter num 2:- ");
    l3 = new Label("Result");
    l4 = new Label("         ");

    t1 = new TextField(20);
    t2 = new TextField(20);

    b1 = new Button("Add");

    add(l1);
    add(t1);

    add(l2);
    add(t2);

    add(l3);
    add(l4);

    add(b1);

    b1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == b1) {
      int m1 = Integer.parseInt(t1.getText());
      int m2 = Integer.parseInt(t2.getText());
      float add = (m1 + m2);
    }
  }

  public static void main(String args[]) {
    Addition ad = new Addition();
  }
}