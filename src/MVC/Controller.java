package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private MVC.Model model;
    private MVC.View view;

    public Controller(MVC.Model model, MVC.View view) {
        this.model = model;
        this.view = view;
        this.view.addInputDataListener(new InputDataListener());
    }


    class InputDataListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int oldData ;
            int inputData;

            try {
                oldData = model.getOldData();
                inputData = view.takeInputData();

                view.viewResult(model.calculateResult(oldData,inputData));

            } catch (NumberFormatException err) {
                view.popUpError(err.getMessage() + "ERROR !!! Please put only Numbers !!!");
            }

        }

    }


}
