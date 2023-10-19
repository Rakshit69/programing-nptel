package thepacket;

public class Main {
    public static void main(String[] args) {
        setup s = new setup();
         try {
            // s.createtable();
            // s.createdata(); 
            s.readdata();
          // s.updatedata();
         // s.deletedata();
         } catch (Exception e) {
            System.out.println("ok");
         }
       
    }
   
   
}
