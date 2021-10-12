/**
 * Java 1. Homework 2
 *
 * @author Andrey Usmanov
 * @version 12.10.2021
 */
 
class Lessons2HomeWork {
    public static void main(String[] args) {	
		System.out.println(sumLimit(31, 8));
		System.out.println(sumLimit(3, -6));
		System.out.println(sumLimit(15, 1));
		
		isPositiveOrNegative(-10);
		isPositiveOrNegative(0);
		isPositiveOrNegative(15);
		isPositiveOrNegative(-1);
		
		System.out.println(isNegativeOrPositive(-5));
		System.out.println(isNegativeOrPositive(0));
		System.out.println(isNegativeOrPositive(9));
		
		repeatString("Hello", 5);
		
		System.out.println(isYearLeap(1904));
		System.out.println(isYearLeap(1900));
		System.out.println(isYearLeap(2000));
		System.out.println(isYearLeap(2021));	
    }
		   
    static boolean sumLimit(int a, int b) {
		return a + b >= 10 && a + b <= 20;
    }
    
    static void isPositiveOrNegative(int a) {
	    System.out.println(a >= 0? "Positve":"Negativ");
	}
	
	static boolean isNegativeOrPositive(int a) {
		return a < 0;
    }
	
	static void repeatString(String s, int count) {
		for (int a = 0; a < count; a++ ) {
	        System.out.println(s);
		}	
	}
	
	static boolean isYearLeap(int year) {
		return (year % 4 == 0 && year % 100 !=0) || year % 400 == 0;
    }
}