package sunil.javaassignment4;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaAssignment4 {
    static void getKyc(String signUp, String current) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date currDate = new Date(), signDate = new Date();
        try {
            signDate = formatter.parse(signUp);
            currDate = formatter.parse(current);
        } catch (Exception e) {
            System.out.println("Invalid Date format.");
            return;
        }
        Calendar signUpDate = Calendar.getInstance();
        Calendar currentDate = Calendar.getInstance();
        signUpDate.setTime(signDate);
        currentDate.setTime(currDate);
        signUpDate.set(Calendar.YEAR, currentDate.get(Calendar.YEAR));
        long days = Duration.between(signUpDate.toInstant(), currentDate.toInstant()).toDays();
        Calendar startDate = (Calendar) signUpDate.clone();
        Calendar endDate = (Calendar) signUpDate.clone();
        if (days > 30) {
            startDate.add(Calendar.DAY_OF_MONTH, -30);
            endDate.add(Calendar.DAY_OF_MONTH, +30);
            System.out.println(formatter.format(startDate.getTime()) + " " + formatter.format(endDate.getTime()));
        } else if (days > 0) {
            startDate.add(Calendar.DAY_OF_MONTH, -30);
            endDate = currentDate;
            System.out.println(formatter.format(startDate.getTime()) + " " + formatter.format(endDate.getTime()));
        } else if (days == 0) {
            startDate.add(Calendar.DAY_OF_MONTH, -30);
            System.out.println(formatter.format(startDate.getTime()) + " " + formatter.format(endDate.getTime()));
        } else if (days <= -30) {
            System.out.println("No range");
        } else {
            startDate.add(Calendar.DAY_OF_MONTH, -30);
            endDate = currentDate;
            System.out.println(formatter.format(startDate.getTime()) + " " + formatter.format(endDate.getTime()));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many forms do you want to validate?");
        int forms = scan.nextInt();
        String signUpDate, currentDate;
        System.out.println("Enter the signup and current date in the following format.");
        System.out.println("dd-mm-yyyy dd-mm-yyyy");
        while (forms > 0) {
            signUpDate = scan.next();
            currentDate = scan.next();
            getKyc(signUpDate, currentDate);
            forms--;
        }

    }
}
