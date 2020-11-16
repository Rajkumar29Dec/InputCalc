package altimetrik.raj;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int c = 0;
        while (true) {
            boolean isInt = s.hasNextInt();
            if (isInt) {
                int i = s.nextInt();
                sum = sum + i;
                c++;
            } else {
                break;
            }
            average = Math.round((double) sum / c);
            s.nextLine();


        }
        System.out.println("SUM =" + sum + " AVG =" + average);
        s.close();
    }
}