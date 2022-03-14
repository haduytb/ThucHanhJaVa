import java.util.Scanner;

public class app74 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n;
      do{
          System.out.print("nhap n = ");
          n = sc.nextInt();
      }while(n<0);
      int a[] = new int[n];
         
    System.out.println("nhap cac phan tu cua mang: ");
    for (int i = 0; i < n; i++) {
        System.out.print("phan tu thu  " + i + ":");
        a[i] = sc.nextInt();
    }
    int tong=0;
    for(int i = 0;i<n;i++){
        if(a[i]%2==0){
            tong = tong + a[i];
        }
       
    } System.out.print(+ tong);
      
      
       
        
    }
    
}