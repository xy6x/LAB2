import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        math.check();
        math.chec();
        math.ent();
        math.arr();
        math.cer();
        math.ran();
        System.out.println("please enter password");
        System.out.println("Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters\n" +
                "(3 points)");
        System.out.println("Special characters: Absence (0 points), Presence (2 points).");
        System.out.println("Uppercase and lowercase letters: Absence of both (0 points), presence of both (3\n" +
                "points)");
       int number = math.pass(s.next());
        if (number >=8) {
            System.out.println("good");
        } else if (number>5) {
            System.out.println("md");
        }else System.out.println("no good ");
//        math.num();

    }
    }