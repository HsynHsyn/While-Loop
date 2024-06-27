package Muhtar_SDET.Day14_Method_Overloading_Loops_Intro;

public class Task4_SalaryCalculator {
    public static void main(String[] args) {
        // print the salary
        System.out.println("Your salary is " + salary(40,45)); // call the method
    }
    public static double salary(double hourlyRate, double weeklyHours) {

        double salary =  (hourlyRate * weeklyHours) * 52; // calculates salary

        return salary;

    }
}
/*
 Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
and weekly hours (int) and returns the salary.

			Example:
				double income = salary(45, 40);

			Output:
				93600.0
 */