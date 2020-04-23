import java.util.Scanner;
public class MonthSwitch {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter days in a month ");

        int daysInMonth = in.nextInt();
        String monthName;
        switch (daysInMonth) {
            case 30:  monthName = "September April June November";
                break;
            case 31:  monthName = "January, March, May, July, August, October, December";
                break;
            case 28:  monthName = "February";
                break;
            default: monthName = "no months have exactly " + daysInMonth + " days";
                break;
        }
        System.out.println(monthName);
    }
}
