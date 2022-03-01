import java.util.Scanner;

public class App34{
public static void main(String[] args)throws Exception {
    Scanner sc =new Scanner(System.in);
    int a;
    do{System.out.print(" so nguyen a: ");
    a = sc.nextInt();}
    while(a<0);
    int dem = 0;
    int i;
    for ( i = 1; i <=a; i++) {
        if(a % i == 0){
          dem=dem+1;
        }
    }
    if(dem==2){
   System.out.println("a la so nguyen to");}
   else{
       System.out.println("a ko la so nguyen to");
   }
    }
}


   