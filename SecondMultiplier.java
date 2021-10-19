package synchronization;

public class SecondMultiplier extends Thread{
    public Multiplication mult;

    public SecondMultiplier(Multiplication mult) {
        this.mult = mult;
    }

    public void run(){
        try {
            mult.multiply(9);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
