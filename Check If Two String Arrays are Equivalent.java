import java.util.*;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res1 = "";
        String res2 = "";

        for (int i = 0; i < word1.length; i++) {
            res1 += word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            res2 += word2[i];
        }

        return res1.equals(res2);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution obj = new Solution();

        System.out.print("Enter size of word1: ");
        int n = sc.nextInt();

        String[] word1 = new String[n];

        System.out.println("Enter word1 strings:");
        for (int i = 0; i < n; i++) {
            word1[i] = sc.next();
        }

        System.out.print("Enter size of word2: ");
        int m = sc.nextInt();

        String[] word2 = new String[m];

        System.out.println("Enter word2 strings:");
        for (int i = 0; i < m; i++) {
            word2[i] = sc.next();
        }

        boolean result = obj.arrayStringsAreEqual(word1, word2);

        System.out.println("Output: " + result);

        sc.close();
    }
}