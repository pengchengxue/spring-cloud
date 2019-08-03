package threadService;

public class GetMoneyTest {
    public static void main(String[] args) {
        Account account = new Account(5000);
        GetMoneyRun runnable = new GetMoneyRun(account);
        new Thread(runnable, "你").start();
        new Thread(runnable, "你老婆").start();

    }
}
