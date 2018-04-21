
import java.util.ArrayList;

public class Content {
    public static void main(String[] args) {


        ArrayList<String> answer= new ArrayList<String>();
        answer.add("1");
        answer.add("2");
        answer.add("3");
        answer.add("4");
        System.out.println("Elements of ArrayList of String Type: "+answer);

        //ArrayList<Integer> Declaration 
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        //add method for integer ArrayList
        al2.add(1);
        al2.add(34);
        al2.add(99);
        al2.add(99);
        al2.add(78);
        System.out.println("Elements of ArrayList of Integer Type: "+al2);
    }
}