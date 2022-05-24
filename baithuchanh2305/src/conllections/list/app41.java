package conllections.list;
import java.util.LinkedList;
import java.util.Scanner;
public class app41 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> link = new LinkedList<String>();
        link.add("thang 1 ");
        link.add("thang 2 ");
        link.add("thang 3 ");
        link.add("thang 4 ");
        link.add("thang 5 ");
        link.add("thang 6 ");
        link.add("thang 7 ");
        link.add("thang 8 ");
        link.add("thang 9 ");
        link.add("thang 10 ");
        link.add("thang 11 ");
        link.add("thang 12 ");
        System.out.println("Nhap dia chi :");
        int index = sc.nextInt();
        if(index < 0 || index> link.size()){
            System.out.println("So can nhap phai lon hn 0 va nho hon " + (link.size()-1));
        }
        else{
            String node = link.get(index);
            System.out.println("Phan tu co chi so : " + index+ " trong list la : " +node);
        }
        String lastnode = link.getLast();
        String firstnode = link.getFirst();
        System.out.println("\nphan tu dau trong list la " + firstnode + " ;phan tu cuoi cung trong list la :" + lastnode);
        


    }
    
}
