package practica6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import dateutil.DateUtil;

public class Lanzador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Date date = Calendar.getInstance().getTime(); 
	    String sDate1="2022-05-28";  
	    Date date2  = new Date();
		try {
			date2 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
	    System.out.println("fecha actual" +Calendar.getInstance().getTime());
	    System.out.println("getAnio: " +DateUtil.getAnio(date));
	    System.out.println("getMes: " +DateUtil.getMes(date));
	    System.out.println("getDia: " +DateUtil.getDia(date));
	    System.out.println("isFinDeSemana: " +DateUtil.isFinDeSemana(date));
	    System.out.println("isDiaDeSemana: " +DateUtil.isDiaDeSemana(date));
	    System.out.println("getDiaDeSemana: " +DateUtil.getDiaDeSemana(date));
	    System.out.println("asDate: " +DateUtil.asDate("yyyy-MM-dd",sDate1));
	    System.out.println("asCalendar: " +DateUtil.asCalendar("yyyy-MM-dd",sDate1).getTime());
	    System.out.println("asString: " +DateUtil.asString("yyyy-MM-dd",date));
	    
	    

	}

}
