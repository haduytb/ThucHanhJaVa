import java.util.Scanner;

public class app90 {
    public static void main(String[] args) throws Exception {
      
        Scanner sc = new Scanner(System.in);
        int n;
        String chuoi;
        char kitu;
        System.out.print("nhap chuoi: " );
        chuoi = sc.nextLine();
        for(int i = 0;i<chuoi.length();i++){
            kitu = chuoi.charAt(i);
            System.out.println("ki tu thu " + i + " la " + kitu);
           
        } n = chuoi.length();
        System.out.print("chiue dai " + n);

    }
    
}
