package MVC;

import java.awt.event.ActionListener;
import javax.swing.*;


public class View extends JFrame {
    private JTextField inputField = new JTextField(10);
    private JLabel textField = new JLabel("put number to add to DATA");
    private JButton button = new JButton("add Data");
    private JTextField resultViewField = new JTextField(10);


    public View() {
        JPanel panel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600, 200);

        panel.add(inputField);
        panel.add(textField);
        panel.add(button);
        panel.add(resultViewField);

        this.add(panel);
    }

    public int takeInputData() {
        return Integer.parseInt(inputField.getText());
    }

    public void viewResult(int resultData) {
        resultViewField.setText(Integer.toString(resultData));
    }

    public void addInputDataListener(ActionListener buttonListener) {
        button.addActionListener(buttonListener);
    }

    public void popUpError(String err) {
        JOptionPane.showMessageDialog(this, err);
    }

}
