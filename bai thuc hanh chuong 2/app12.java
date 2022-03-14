import java.util.Scanner;

public class app12 {
    public static void main(String[] args){
        
        Scanner sc =  new Scanner(System.in);
        int m,n;
        do{
            System.out.print("nhap n ");
            n = sc.nextInt();
        }while(n<0);
        do{
            System.out.print("nhap m ");
            m = sc.nextInt ();
        }while(m<0);
        int a[][] = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j] = sc.nextInt();
            }
        }int max=0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        System.out.print("phan tu lon nhat trong mang la " + max );

        

    }
    
}