import java.util.Scanner;

public class app1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.printf("nhap a = ");
        a = sc.nextFloat();
        System.out.printf("nhap b = ");
        b = sc.nextFloat();
        float tong = a+b;
        float  hieu = a-b;
        float tich = a*b;
        float thuong = a/b;
        float sodu = a%b;
        if(b!=0){
            System.out.println("thuong = "+ thuong);
        System.out.println("Sodu = " +sodu);

           
        }
        System.out.println("tong = " + tong);
        System.out.println("hieu = " + hieu);
        System.out.println("tich = " + tich);
        

    }
    
}
