import java.util.Scanner;

public class Program {
    public static void main(String args[])
    {
        int[] freq = new int[26];

        Scanner sc = new Scanner(System.in);
        String token = sc.nextLine();
        if (token.endsWith("42")) {
            token = token.substring(0, token.length() - 2);
        }
        else {
            System.err.println("String must end with '42'");
            System.exit(-1);
        }

        for (int i = 0; i < token.length(); i++) {
            char c = token.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                freq[c - 'A']++;
            }
        }



        int[] top10Freq = new int[10];
        char[] top10Char = new char[10];
        int count = 0;
        int[] freqCopy  = new int[26];
        for (int i = 0; i < 26; i++) {
            freqCopy[i] = freq[i];
        }
        for (int k = 0; k < 10; k++) {
            int maxFreq = 0;
            int maxIndex = -1;

            for (int i = 0; i < 26; i++) {
                if (freqCopy[i] > maxFreq) {
                    maxFreq = freqCopy[i];
                    maxIndex = i;
                }
            }
            if (maxFreq > 0) {
                top10Freq[count] = maxFreq;
                top10Char[count] = (char)('A' + maxIndex);
                count++;
                freqCopy[maxIndex] = 0;
            }
            else break;
        }
        if (count == 0) {
            System.exit(0);
        }

        int maxFreq = 0;
        for (int i = 0; i < count; i++) {
            if (top10Freq[i] > maxFreq) {
                maxFreq = top10Freq[i];
            }
        }

        for (int level = maxFreq; level >= 1; level--) {
            // for (int i = 0; i < count; i++) {
            //     if (top10Freq[i] >= level) {
            //         System.out.print("#");
            //     }
            //     else System.out.print(" ");
                // if (i < count - 1) System.out.print(" ");
            // }
            // for (int i = 0; i < count; i++) {
            //     if (top10Freq[i] == level) {
            //         System.out.print(" " + level);
            //     }
            // }
            System.out.print('\n');
        }

    }
}