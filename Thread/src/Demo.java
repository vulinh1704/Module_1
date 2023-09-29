class Account {
    private String name;
    private int amount;

    public Account(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public synchronized void widthDraw(int a) throws InterruptedException {
        if(this.amount >= a) {
            Thread.sleep(1000);
            this.amount = this.amount - a;
            System.out.println(this.amount);
        } else {
            System.out.println("NOT ENOUGH MONEY");
        }
    }
}

class WidthDraw implements Runnable {
    private Account account;
    public WidthDraw(Account account) {
        this.account = account;
    }
    @Override
    public void run() {
        try{
            this.account.widthDraw(10);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Account account = new Account("Linh", 16);
        Runnable task1 = new WidthDraw(account);
        Thread t1 = new Thread(task1);
        Runnable task2 = new WidthDraw(account);
        Thread t2 = new Thread(task2);

        t2.start();
        t1.start();
    }
}
