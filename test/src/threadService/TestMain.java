package threadService;

public class TestMain {
    static int i = 0 ;
    public static void main(String[] args) {
        TestMain t =new TestMain();
        Worker run=new Worker(t);
        Thread t1=new Thread(run);
        Thread t2=new Thread(run);
        Thread t3=new Thread(run);
        Thread t4=new Thread(run);
        Thread t5=new Thread(run);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
