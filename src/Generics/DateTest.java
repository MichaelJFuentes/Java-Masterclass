//Svein Smith
//INSY 4305
//07/22/2020
package Generics;
/*Assignment3 - Due July 27 - 5:30 PM.

Modify the Date class in Fig. 8.7 by adding a new method called nextDay() that increments the Date by 1 when called and returns a new Date object.  
This method should properly increment the Date across Month boundary (i.e from the last day of the month to the first day of the next month).

Write a program called DateTest that asks the user to enter 3 numbers (one at a time) corresponding to Month, Day and Year. 
The first two will be 2 digits(Month and Day) and 3rd will be 4 digits(Year). 
Read the numbers and create a corresponding Date object. 
Write a loop that increments this Date 3 times by calling nextDay()and displays each Date in the format mm/dd/yyyy on the console. 
You MUST use nextDay() to generate the dates. 
You CANNOT HARD CODE the output.

Your program should work for any valid data that user enters. (Assume that the user will enter VALID month,day and year numbers).
You can assume that all dates will be in the same year 2020.

Example:
If user enters 07  30 and 2020. The following should be displayed:
07/30/2020
07/31/2020
08/01/2020

Upload 2 Java files to Canvas: Date.java and DateTest.java.*/

//IMPORT SCANNER

//set up DateTest class
public class DateTest{

    public static void main(String... args){
//    	//set up scanner
//        Scanner sc = new Scanner(System.in);
//        //for day integer
//        int day;
//        //for month integer
//        int month;
//        //for year integer
//        int year;
//
//        //enter the month between 1-12
//        System.out.print("Enter month: ");
//        month = sc.nextInt();
//
//        //enter existing day in the month
//        System.out.print("Enter day: ");
//        day = sc.nextInt();
//
//        //enter year any value
//        System.out.print("Enter year: ");
//        year = sc.nextInt();
//
//        //crewate object for date
//        Date date = new Date(month, day, year);
            Date date = new Date(12,30,1999);

//        for (int i = 0; i < 3; i++) {
//            System.out.println(date);
//            date = date.nextDate();
//        }

        //adding onto date
        Date prevDate = date;

        //dispaly dates
        for (int i=0; i<3; i++){
            System.out.println(prevDate.toString());
            prevDate = prevDate.nextDate();
        }

    }
}