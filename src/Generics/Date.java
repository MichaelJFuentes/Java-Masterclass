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

import java.time.Year;

//set class date
public class Date {

	//set month integer
    private int month; 
    //set day integer
    private int day; 
    //set year integer
    private int year; 

    //settinf the days in each month
    private static final int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Date (int month, int day, int year){

    	//Make sure month is between 1-12
        if (month <= 0 || month > 12){
            throw new IllegalArgumentException("Month "+month+" must be in between 1-12");
        }

        // check is day in range for month
        if (day <= 0 || (day>daysPerMonth[month - 1]) && !Year.isLeap(year)){
            throw new IllegalArgumentException("Day "+day+"must be a valid day in the month");
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

//    public Date nextDate(){
//    	//setting values
//        int day = 0;
//        int month = 0;
//        int year = 0;
//
//
//        //calculate next date
//        //setting up for last day of month
//        if(this.day >= daysPerMonth[this.month]){
//            day = 1; this.month = this.month + 1;
//
//            if(this.month > 12){
//                month = 1; year = this.year + 1;
//            }
//            else {
//                year = this.year;
//            }
//        }
//
//        //if day is last of month
//        else{
//            day = this.day+1; month = this.month; year = this.year;
//        }
//
//        //return value
//        return new Date(month, day, year); // return object of next date
//    }

    public Date nextDate() {
        int newDate = this.day + 1;
        int month = this.month;
        int year = this.year;

        if (newDate > daysPerMonth[month - 1]) {
            month += 1;
            newDate = 1;
            if (month >= 12) {
                year += 1;
                month = 1;
            }
        }

        return new Date(month, newDate, year);

    }
    //SET OVERRIDE
    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", month, day, year);
    }
}