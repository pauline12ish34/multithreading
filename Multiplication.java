package synchronization;

public class Multiplication<Synchronised> {
    private long number;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    synchronized public void multiply(long number) throws InterruptedException {
        for (int i = 1; i < number; i++) {
            System.out.println(i+"*"+number+"="+i*number);
            Thread.sleep(2);
        }
    }

}
