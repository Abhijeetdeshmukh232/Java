package com.company;

public class demo2 {
    public static void main(String[] args) {
        String day = "wed";
        switch (day) {
            case "mon":
                System.out.println("Monday");
                break;
            case "tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thu":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            case "sat":
                System.out.println("Saturday");
                break;
            case "sun":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("enter valid day");
        }

    }
}
