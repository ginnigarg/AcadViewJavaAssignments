package dateConversion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DateConversion {
	
	static Map<String,String> dates =  new HashMap<String,String>();
	static Map<String,String> months =  new HashMap<String,String>();
	static Map<String,String> centuries =  new HashMap<String,String>();
	static Map<String,String> numeric =  new HashMap<String,String>();
	static Map<String,String> decade = new HashMap<String,String>();
	static String date,month,century,year;
	
	public static void setDate() {
		dates.put("01", "First");
		dates.put("02", "Second");
		dates.put("03", "Third");
		dates.put("04", "Fourth");
		dates.put("05", "Fifth");
		dates.put("06", "Sixth");
		dates.put("07", "Seventh");
		dates.put("08", "Eighth");
		dates.put("09", "Nineth");
		dates.put("10", "Tenth");
		dates.put("11", "Eleventh");
		dates.put("12", "Tweleveth");
		dates.put("13", "Thirteenth");
		dates.put("14", "Fourteenth");
		dates.put("15", "Fifteenth");
		dates.put("16", "Sixteenth");
		dates.put("17", "Seventeenth");
		dates.put("18", "Eighteenth");
		dates.put("19", "Nineteenth");
		dates.put("20", "Twenty");
		dates.put("21", "Twenty First");
		dates.put("22", "Twenty Second");
		dates.put("23", "Twenty Third");
		dates.put("24", "Twenty Fourth");
		dates.put("25", "Twent Fifth");
		dates.put("26", "Twenty Sixth");
		dates.put("27", "Twenty Seventh");
		dates.put("28", "Twenty Eighth");
		dates.put("29", "Twenty Nineth");
		dates.put("30", "Thirty");
		dates.put("31", "Thirty First");
	}
	
	public static void setMonth() {
		months.put("01", "January");
		months.put("02", "February");
		months.put("03", "March");
		months.put("04", "April");
		months.put("05", "May");
		months.put("06", "June");
		months.put("07", "July");
		months.put("08", "August");
		months.put("09", "September");
		months.put("10", "October");
		months.put("11", "November");
		months.put("12", "December");
	}
	
	public static void setCentury() {
		centuries.put("19", "Nineteen");
		centuries.put("20", "Twenty");
	}
	
	public static void setNumeric() {
		numeric.put("0", "Zero");
		numeric.put("1", "One");
		numeric.put("2", "Two");
		numeric.put("3", "Three");
		numeric.put("4", "Four");
		numeric.put("5", "Five");
		numeric.put("6", "Six");
		numeric.put("7", "Seven");
		numeric.put("8", "Eight");
		numeric.put("9", "Nine");
		numeric.put("10", "Ten");
		numeric.put("11", "Eleven");
		numeric.put("12", "Tweleve");
		numeric.put("13", "Thirteen");
		numeric.put("14", "Fourteen");
		numeric.put("15", "Fifteen");
		numeric.put("16", "Sixteen");
		numeric.put("17", "Seventeen");
		numeric.put("18", "Eighteen");
		numeric.put("19", "Nineteen");
	}
	
	public static void setDecade(){
		decade.put("2","Twenty");
		decade.put("3","Thirty");
		decade.put("4","Fourty");
		decade.put("5","Fifty");
		decade.put("6","Sixty");
		decade.put("7","Seventy");
		decade.put("8","Eighty");
		decade.put("9","Ninety");
		
	}
	
	public static void set() {
		setDate();
		setMonth();
		setCentury();
		setDecade();
		setNumeric();
	}
	
	public static void createSubstrings(String day) {
		date = day.substring(0, 2);
		month = day.substring(3,5);
		century = day.substring(6,8);
		year = day.substring(8, 10);
	}
	
	public static void convert() {
		//System.out.println(year);
		date = dates.get(date);
		month = months.get(month);
		century = centuries.get(century);
		int num = Integer.parseInt(year);
		//System.out.println(num);
		if(num > 9 && num<20) {
			year = numeric.get(year);
		} else if(num <= 9){
			year = "Zero " + numeric.get("year");
		} else {
			year = decade.get(year.substring(0, 1)) + " " + numeric.get(year.substring(1,2));
		}
		System.out.println(date  + " " + month + " " + century +" " +year);
	}
	
	public static void main(String[] args) {
		set();
		
		Scanner sc = new Scanner(System.in);
		String day = sc.nextLine();
		sc.close();
		
		createSubstrings(day);
		
		convert();
		
	}

}
