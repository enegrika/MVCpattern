package MVC;

public class Model {
    private int oldData;

    public int getOldData() {
        return oldData;
    }

    public void setOldData(int oldData) {
        this.oldData = oldData;
    }

    public int calculateResult(int oldData, int inputData){
        int result = oldData + inputData;
        setOldData(result);
        return result;
    }


}
