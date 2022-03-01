import java.util.Scanner;

public class App1{
public static void main(String[] args)throws Exception {
    Scanner sc =new Scanner(System.in);
    int a,b,c;
    do{System.out.print(" so nguyen a: ");
    a = sc.nextInt();}
    while(a<=0);
    do{System.out.print(" so nguyen b: ");
    b = sc.nextInt();}
    while(b<0);
    int i;
    for(i=a-1;i>=1;i--){
        if(a%i==0&&b%i==0){
            System.out.print("uoc chung lon nhat la " + i);
            break;
        }
        
    }
}
}
