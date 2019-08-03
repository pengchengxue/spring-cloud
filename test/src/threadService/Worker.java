package threadService;

public class Worker implements  Runnable {
    TestMain c;
    public Worker(TestMain c) {
        this.c=c;
    }
    @Override
    public void run() {
        synchronized(this){
            c.i++;
            System.out.println(c.i);
        }
    }

}
