import java.util.Scanner;

public class Main {

    public static boolean hasSpecialCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!((65 <= s.charAt(i) && s.charAt(i) <= 90) || (97 <= s.charAt(i) && s.charAt(i) <= 122))) {
                return true;
            }
        }
        return false;
    }


    public static int numberOfWords(String x) {
        String[] z = x.split(" ");

        return z.length;
    }

    public static void main(String[] args) {
        String s = " ";
        Scanner scnr = new Scanner(System.in);
        boolean a = true;


        System.out.println("Enter a sentence: ");
        s = scnr.nextLine();

        if (s.equalsIgnoreCase("")) {
            System.out.println("You entered 0 words.");
        } else {
        /*if (hasSpecialCharacter(s))
        {
            System.out.println("Found error");
        }*/
            {
                System.out.println("You entered " + numberOfWords(s) + " words.");
            }

        }


    }
}
