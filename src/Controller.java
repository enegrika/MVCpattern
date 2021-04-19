import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        int data;

        try {
            data = view.putData();
            model.addData(data);
            view.viewData(data);
        } catch (NumberFormatException err){
            view.popUpError(err.getMessage());
        }

    }
}
