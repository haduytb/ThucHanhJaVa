package conllections.list;
import java.util.ArrayList;
public class app21 {
    public static void main (String[] args){
        ArrayList<String> mau = new ArrayList<String>();
        mau.add("red");
        mau.add("blue");
        mau.add("green");
        mau.add("orange");
        mau.remove("red");
        mau.add("Pink");
        mau.add("yellow");
        System.out.println(mau.get(1));
        System.out.println(mau.contains("orange"));
        System.out.println(mau.size() );
        System.out.println(mau);
    }
    
}
