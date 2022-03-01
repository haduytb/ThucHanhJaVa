import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class App {
   public static void main(String[] args) {
    
       Scanner scanner = new Scanner(System.in);
       double a;
       double b;
       System.out.print("Nhap a ");
       a = scanner.nextDouble();
       System.out.print("Nhap b ");
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


