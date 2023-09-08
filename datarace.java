
   

public class datarace extends Thread {
     static int x=0;

     public void run() {
         for (int i = 0; i < 1000; i++) {
             x = x - 1;
             x = x + 1;
         }
     }

    public static void main(String[] args) {
         x = 0;
         for (int i = 0; i < 1000; i++) {
             new datarace().start();
             System.out.println(x);//not always 0;
}
    }

}
