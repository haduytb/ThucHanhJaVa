import java.util.Scanner;

public class app11 {
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
    }int tam;
    for(int i = 0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                tam=a[j];
                a[j]=a[j+1];
                a[j+1]=tam;
            }

        }   
    } 
    System.out.println("thu tu tang dan  ");
    for (int i = 0; i < n; i++) {
        System.out.print(a[i]);   }
    
}}