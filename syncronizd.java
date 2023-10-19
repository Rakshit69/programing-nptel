import mypackage.thread;

class account {
    int balance;
    int id;

    void display() {
        System.out.println("acconunt no" + id + " has balance " + balance);
    }

    synchronized void deposit(int a) {
        balance += a;
        System.out.println(a + " is deposited ");
        display();
    }

    synchronized void withdraw(int a) {
        balance -= a;
        System.out.println(a + " is withdraw ");
        display();
    }
}

class transactiondeposit implements Runnable {
    int amount;
    account x;

    transactiondeposit(int amount, account x) {
        this.amount = amount;
        this.x = x;
         new Thread(this).start();
    }

    public void run() {
        x.deposit(amount);
     }
}
public class syncronizd {
    public static void main(String[] args) {
        
    }
}
