import java.util.Scanner;

public class findthedifference {

    public static char findTheDifference(String s, String t) {
        int res = 0;

        for (char c : t.toCharArray()) {
            res += c;
        }

        for (char c : s.toCharArray()) {
            res -= c;
        }

        return (char) res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        char result = findTheDifference(s, t);

        System.out.println("The extra character is: " + result);

        sc.close();
    }
}