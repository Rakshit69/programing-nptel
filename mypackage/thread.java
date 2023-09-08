package mypackage;
class ta extends Thread {
    static int a;

    public void run() {
        System.out.println("thread by extend");
    }
}

class id extends Thread {
    static int a;

    public void run() {
        System.out.println(currentThread().getId());
    }
}
class st extends Thread {
    static int a;

    public void run() {
       for (int i = 0; i < 4; i++) {
           if (i == 2)
               stop();
               System.out.println(i);
       }
    }
}class yeild extends Thread {
    static int a;

    public void run() {
        for (int i = 0; i < 4; i++) {
            if (i == 2)
                yield();
            System.out.println("thread by extend");
            if (i == 3) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println("error");
                }
            }

        }
    }
}class ta extends Thread {
    static int a;

    public void run() {
        System.out.println("thread by extend");
    }
}
class tb implements Runnable {
    public void run() {
        System.out.println("it is done by implementation");
    }
}
public class thread {
    public static void main(String[] args) {
        ta t = new ta();
        Thread tr = new Thread(new tb());
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        tr.start();
    }
}
