import java.util.Scanner;

public class app8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        
        do{
            System.out.print("nhap n = ");
            n = sc.nextInt();
        }while(n<=0);
        double a[] = new double[n];
        for(int i =0;i<n;i++){
            System.out.printf("a[%d] = ",i);
            a[i] = sc.nextDouble();
        }
        double tbc =0;
        for(int i =0;i<n;i++){
            tbc = tbc + a[i]/2;
        }System.out.println("trung binh cong = "  + tbc);
    }
    
}
