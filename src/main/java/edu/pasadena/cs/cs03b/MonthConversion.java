package edu.pasadena.cs.cs03b;

public class MonthConversion {
    public static void main(String[] args) {
        int month = 0;
        
        month = Integer.parseInt(args[0]);
        
        String monthString = "WRONG";
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:  monthString = "February";
            // TODO: what is missing here
            case 3:  monthString = "March";
                     break;
            // TODO: Add the rest of the months here
            // TODO: add a default case to output "No Such Month"
        }
        
        System.out.println(monthString);
    }
}
