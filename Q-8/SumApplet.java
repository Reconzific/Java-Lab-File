import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SumApplet extends Applet implements ActionListener {

    TextField t1, t2, result;
    Button add;

    public void init() {
        Label l1 = new Label("Enter Number 1: ");
        Label l2 = new Label("Enter Number 2: ");

        t1 = new TextField(10);
        t2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false);

        add = new Button("Add");
        add.addActionListener(this);

        add(l1); add(t1);
        add(l2); add(t2);
        add(add);
        add(new Label("Result: "));
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int sum = n1 + n2;
            result.setText("" + sum);
        } catch (Exception ex) {
            result.setText("Error!");
        }
    }
}
