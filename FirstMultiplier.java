package synchronization;

public class FirstMultiplier extends Thread{
    private Multiplication mult;

    public FirstMultiplier(Multiplication mult) {
        this.mult = mult;
    }

    public void run(){
        try {
            mult.multiply(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
