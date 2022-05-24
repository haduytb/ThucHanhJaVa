import java.util.ArrayList;
public class app21 {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("orange");
        colors.remove("green");
        colors.add("Pink");
        colors.add("yellow");
        System.out.println(colors.get(3));
        System.out.println(colors.contains("murasaki"));
        System.out.println(colors.size());
        System.out.println(colors);

    }
    
}
