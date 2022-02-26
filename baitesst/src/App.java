import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
   public static void main(String[] args) {
    
       var scanner = new Scanner(System.in);
       double a;
       double b;
       System.out.println("Nhap a ");
       a = scanner.nextDouble();
       System.out.println("Nhap b ");
       b = scanner.nextDouble();
       if(a<b){
           System.out.println(a + "<" + b);
       }else if(a == b){
           System.out.println(a + "=" + b );

       }else{
           System.out.println(a + ">" + b );
       }
       System.out.println("Ha Van Duy");

   }
       
   } 


