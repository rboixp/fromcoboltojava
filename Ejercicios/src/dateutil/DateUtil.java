package dateutil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static int getAnio(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal. setTime(fecha);
		return cal.get(Calendar.YEAR);
	}
	public static int getMes(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		return cal.get(Calendar.MONTH)+1;
	}
	public static int getDia(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal. setTime(fecha);
		return cal.get(Calendar.DATE);
	}
	
	public static boolean isFinDeSemana(Date fecha) {
        LocalDate someDate = Instant.ofEpochMilli(fecha.getTime())
        	      .atZone(ZoneId.systemDefault())
        	      .toLocalDate();
        
        DayOfWeek day = DayOfWeek.of(someDate.get(ChronoField.DAY_OF_WEEK));        
        return  day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY;
	}
	public static boolean isDiaDeSemana(Date fecha) {
        LocalDate someDate = Instant.ofEpochMilli(fecha.getTime())
      	      .atZone(ZoneId.systemDefault())
      	      .toLocalDate();
      
      DayOfWeek day = DayOfWeek.of(someDate.get(ChronoField.DAY_OF_WEEK));        
      return  day == DayOfWeek.MONDAY    || 
    		  day == DayOfWeek.TUESDAY   ||
    		  day == DayOfWeek.WEDNESDAY ||
    		  day == DayOfWeek.THURSDAY   ||
    		  day == DayOfWeek.FRIDAY; 
		}
	public static int getDiaDeSemana(Date fecha) {
		Calendar cal = Calendar.getInstance();
		cal. setTime(fecha);
		return cal.get(Calendar.DAY_OF_WEEK);
		 
	}
	public static Date asDate(String pattern, String fecha) {
		Date date1 = null;
		try {
			date1=new SimpleDateFormat(pattern).parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		return date1;
	}
	public static Calendar asCalendar(String pattern, String fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = sdf.parse(fecha);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal;
	}
	public static String asString(String pattern, Date fecha)  {
        DateFormat dateFormat = new SimpleDateFormat(pattern);  
        String  strDate = null;
        return   strDate = dateFormat.format(fecha);  
}
}
