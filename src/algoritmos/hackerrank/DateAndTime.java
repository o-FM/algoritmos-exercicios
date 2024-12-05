package algoritmos.hackerrank;

import java.io.*;

public class DateAndTime {

    /**
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String findDay(int month, int day, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int firstTwoDigitYear = year % 100;
        int lastTwoDigitYear = year / 100;

        // Formula de Zeller
        int h = (day + (13 * (month + 1)) / 5 + firstTwoDigitYear + (firstTwoDigitYear / 4) + (lastTwoDigitYear / 4) - (2 * lastTwoDigitYear)) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        return days[(h + 7) % 7].toUpperCase();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = findDay(month, day, year);
        System.out.println(res);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
