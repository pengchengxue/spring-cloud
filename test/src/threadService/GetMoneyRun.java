package threadService;

public class GetMoneyRun implements Runnable {

    private Account account;

    public GetMoneyRun(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        synchronized(this){
            if (account.getMoney() > 3000) {
                System.out.println(Thread.currentThread().getName() + "的账户有" + account.getMoney() + "元");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                int lasetMoney = account.getMoney() - 3000;
                account.setMoney(lasetMoney);
                System.out.println(Thread.currentThread().getName() + "取出来了3000元" + Thread.currentThread().getName() + "的账户还有" + account.getMoney() + "元");
            } else {
                System.out.println("余额不足3000" + Thread.currentThread().getName() + "的账户只有" + account.getMoney() + "元");
            }
        }


    }

}
