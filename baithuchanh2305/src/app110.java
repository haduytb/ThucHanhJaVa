import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class app110 {
    public static void main(String[] args) {
        int n;
        int tam = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n = " );
        n = sc.nextInt();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0;i<n;i++){
            System.out.print(" phan tu thu " +i+ ":");
            int a = sc.nextInt();
            arrList.add(a);
        }
        for(int i =0;i<arrList.size();i++){
            
            if(arrList.get(i)>tam)tam = arrList.get(i);
        }System.out.print("so lon nhat trong arrlist la :\n" + tam );
        int m;
        do{
            System.out.printf("nhap m = ");
            m=sc.nextInt();
        }while(m<=0);
        for(int i=0;i<arrList.size();i++){
            if(arrList.get(i) == m){
                arrList.remove(i);
            }
        }
        Collections.sort(arrList);
        arrList.forEach(e -> System.out.println(e));
    }
    
}
