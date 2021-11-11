package home_work_6.threads;

public class ResultContainer {
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void removeCount(){
        this.result = 0;
    }
}
