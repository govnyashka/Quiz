
import java.util.ArrayList;

public class Content {
    public static boolean Choosing(String[] args) {
String AllAns[];
//Ответы к вопросу 1
        String[] ans1;
        ans1 = new String[4];
        ans1[0] = "1";
        ans1[1] = "2";
        ans1[2] = "3";
        ans1[3] = "4";
String [] correct_answers_list;
String correct_ans1 = ans1[2];
//список правильных ответов
correct_answers_list = new String[4];
correct_answers_list[0]=correct_ans1;

String stringToSearch = correct_answers_list[0];
        boolean found = false;
        for (String element:ans1) {
            if ( element.equals( correct_ans1 )) {
                found = true;
            }
        }
        if (found) {
            System.out.println( "Правильный ответ:" + correct_ans1 );
        } else {
            System.out.println( "Провал");
        }

        //ArrayList<Integer> Declaration
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        //add method for integer ArrayList
        al2.add(1);
        al2.add(34);
        al2.add(99);
        al2.add(99);
        al2.add(78);
        System.out.println("Elements of ArrayList of Integer Type: "+al2);
        return found;
    }
}