import java.util.ArrayList;
import java.util.ListIterator;
public class app19 {
    public static void main(String[] args){
        ArrayList<Character> arrListchar = new ArrayList<>();
        arrListChar.add('a');
        arrListChar.add('b');
        arrListChar.add('c');
        arrListChar.add('d');
        ListIterator<Character> listIterator = arrListChar.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next() + "\t");
           
        }
    }
    
    
}
