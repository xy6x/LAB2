import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class math {

    public static void chec() {
        String[] af = {"cat", "dog", "red", "is", "am"};
        String az = "";
        ArrayList<String> azs = new ArrayList<>();
        for (String a : af) {
            if (a.length() > az.length()) {
                az = a;
                azs.clear();
                azs.add(az);
            } else if (a.length() == az.length()) {
                azs.add(a);

            }

        }
        System.out.println(azs);
    }


    public static void check() {
        Scanner s = new Scanner(System.in);

        int[] num = {1, 1, 1, 3, 3, 5};
        System.out.println("pleas enter number");
        int inpu = s.nextInt();
        int new_num = 0;

        for (int n : num) {
            if (n == inpu) {
                new_num += 1;
            }
            ;

        }
        System.out.println(inpu + "occurs" + new_num + "times");

    }

    public static void ent() {
        Scanner s = new Scanner(System.in);
        System.out.println("pleas enter number");
        int[] number = {1, 4, 17, 7, 25, 3, 100};
        int inp = s.nextInt();
        int b = 0;
        Arrays.sort(number);
        for (int i = number.length - 1; i >= number.length - inp; i--) {
            System.out.println(number[i]);

        }


    }

    public static void arr() {
        int[] arr = {5, 4, 3, 2, 1};
        Arrays.sort(arr);
        System.out.print("arr: ");
        for (Object element : arr) {
            System.out.print(element + " ");
        }

    }

    public static void cer() {
        Scanner s = new Scanner(System.in);
        int[] array = new int[100];
        int size = 0;

        while (true) {
            System.out.println("Choose the desired operation ");
            System.out.println("1Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5 To Stop");
            int num = s.nextInt();
            if (num == 1) {
                System.out.println("please enter number ");
                int number = s.nextInt();
                array[size] += number;
                size++;
            } else if (num == 2) {
                System.out.println("Display elements of an array");
                for (int i = 0; i < size; i++) {
                    System.out.println(array[i]);

                }
            } else if (num == 3) {
                System.out.println("Search the element within array ");
                int searchNumber = s.nextInt();
                boolean found = false;
                for (int i = 0; i < size; i++) {
                    if (array[i] == searchNumber) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    System.out.println("Found");
                } else {
                    System.out.println("Not found ");
                }
            } else if (num == 4) {
                Arrays.sort(array, 0, size);
                System.out.println(" to sort ");
            } else if (num == 5) {
                break;
            }
        }
    }

    public static void ran() {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the minimum value of the range");
        int first = s.nextInt();
        System.out.println("Enter the maximum value of the range");
        int second = s.nextInt();
        int third;
        System.out.println("Enter the number of random numbers");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            third = rand.nextInt(first, second);
            System.out.print(third + ",");

        }
    }

    public static int like_length(String password) {

        if (password.length() >= 8) {
            return 3;
        } else if (password.length() > 5) {
            return 2;

        }
        return 0;
//
    }

    public static int cha(String password) {

        boolean hasupp = false;
        boolean haslow = false;
        for (int i = 0; i < password.length(); i++) {
            char chr = password.charAt(i);
            if (Character.isUpperCase(chr)) {
                hasupp = true;
            } else if (Character.isLowerCase(chr)) {
                haslow = true;
            }

        }
        if (hasupp && haslow) {
            return 3;

        }
        return 0;
    }

    public static int ch(String password) {
        String symbols = "!@#$%^&*(){}?><:;_~-+/=";
        for (int i = 0; i < password.length(); i++) {
            if (symbols.contains(Character.toString(password.charAt(i)))) {
                return 3;
            }
        }
        return 0;

    }

    public static int pass(String pass) {

        System.out.println("please enter password");
        System.out.println("Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters\n" +
                "(3 points)");
        System.out.println("Special characters: Absence (0 points), Presence (2 points).");
        System.out.println("Uppercase and lowercase letters: Absence of both (0 points), presence of both (3\n" +
                "points)");
       int fist = ch(pass);
       int second = like_length(pass);
       int third=  cha(pass);

        return fist+second+third;
    }


    public static int calculateFibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return calculateFibonacci(num - 1) + calculateFibonacci(num - 2);
    }
    public static void num(){
        Scanner s =new Scanner(System.in);
        System.out.println("generates the Fibonacci");
        int number = s.nextInt();
        for (int i = 0; i <number ; i++) {
            System.out.println(calculateFibonacci(i));

        }
    }
}
