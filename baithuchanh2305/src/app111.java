import java.util.Scanner;
import java.util.LinkedList;
public class app111 {
    public static void main(String[] args){
        LinkedList<Integer> LinkInt = new LinkedList<Integer>();
        int n,m ;
        System.out.println("nhap n = ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("nhap phan tu thu " +i+ ":");
            m= sc.nextInt ();
            LinkInt.add(m);

        }
        int k;
        int tong = 0;
        int dem = 0;
        System.out.println(LinkInt);
        for (int i=0;i<LinkInt.size();i++){
           if(LinkInt.get(i)%2==0){
               tong+=(LinkInt.get(i));
               dem++;
           }
            }
            System.out.println("trung binh so chan " + tong/dem*1.0);
        }
      
        
            
    
        


    }
    

