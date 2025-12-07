import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int expectedWeek = 1;
        String output = "";

        while (true) {
            String token = sc.next();
            if (token.equals("42"))
                    break ;
            if (!token.equals("Week")) {
                System.err.println("IllegalArgument " + token);
                System.exit(-1);
            }
            
            if (!sc.hasNextInt()) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            int weekNum = sc.nextInt();
            if (weekNum != expectedWeek) {
                System.err.println("IllegalArgument " + weekNum);
                System.exit(-1);
            }

            int min = 10;
            for (int i = 0; i < 5 ; i++) {
                if (!sc.hasNextInt()) {
                    System.err.println("IllegalArgument");
                    System.exit(-1);
                }
                int grade = sc.nextInt();
                if (grade < min)
                    min = grade;
            }

            output += "Week " + weekNum + " ";
            for (int i = 0; i < min; i++) {
                output += "=";
            }
            output += ">\n";
            expectedWeek++;
        }
        System.out.println(output);
        sc.close();
    }
}