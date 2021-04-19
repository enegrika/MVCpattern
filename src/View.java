import java.awt.event.ActionListener;
import javax.swing.*;


public class View extends JFrame {
    private JTextField num1 = new JTextField(10);
    private JLabel label = new JLabel("put number to DATA");
    private JButton button = new JButton("add Data");
    private JTextField dataView = new JTextField(10);


    public View() {
        JPanel panel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600, 200);
        panel.add(num1);
        panel.add(label);
        panel.add(button);
        panel.add(dataView);

        this.add(panel);

    }

    public int putData() {
        return Integer.parseInt(num1.getText());
    }

    public void viewData(int data) {
        dataView.setText(Integer.toString(data));
    }

    public void addPutDataListener(ActionListener buttonListener) {
        button.addActionListener(buttonListener);

    }

    public void popUpError(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
