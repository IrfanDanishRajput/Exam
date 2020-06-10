package javaDoc;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
/**
 * Lab class is a helper class that provides temperature conversion, String manipulation, and System date functionalities
 * */
public class Lab {
	
	static Date today = new Date();
	
	/**
	 * This method converts fahrenheit temperature to Centrigrade
	 * @author Danish
	 * @param fahrenheit takes the fahrenheit value as input and generate
	 * @return outputs the values of centigrade temperature
	 * */
	public static int fahrenheitToCentigrade(int fahrenheit) {
	return (fahrenheit - 32) * 5 / 9;
	}
	
	/**
	 * This method converts Centrigrade temperature to fahrenheit
	 * @author Danish
	 * @param centigrade takes the centigrade value as input and generate
	 * @return outputs the values of fahrenheit temperature 
	 * */
	public static int centigradeToFahrenheit(int centigrade) {
	return ((centigrade * 9) / 5) + 32;
	}
	
	/**
	 * This method takes a string as input and returns the string with no exclaimation marks
	 * @author Danish
	 * @param in takes a string as input containing and sentence or charater
	 * @return outputs the string that contains no exclaimation mark
	 * */
	public static String removeSignOfExclaimation(String in){
	if(in==null||in.length()==0)
	return in;
	return in.replaceAll("!", "");
	}
	
	/**
	 * This method tells the current day of the month
	 * @author Danish
	 *
	 * @return current day of the month
	 * */
	public static int getCurrentDay(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getDayOfMonth();
	}
	
	/**
	 * This method tells the current local month 
	 * @author Danish
	 *
	 * @return current month int value
	 * */
	public static int getCurrentMonth(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getMonthValue();
	}
	
	/**
	 * This method tells the current year
	 * @author Danish
	 *
	 * @return current year as integer value
	 * */
	public static int getCurrentYear(){
	LocalDate localDate = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	return localDate.getYear();
	}

}

