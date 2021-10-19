package synchronization;

public class SynchronizationDemo {
    public static void main(String[] args)throws Exception {
        Multiplication multiplication=new Multiplication();
        FirstMultiplier thread1= new FirstMultiplier(multiplication);
        thread1.start();
        SecondMultiplier thread2=new SecondMultiplier(multiplication);
        thread2.start();
    }
}
