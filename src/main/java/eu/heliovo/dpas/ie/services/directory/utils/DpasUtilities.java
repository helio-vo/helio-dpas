package eu.heliovo.dpas.ie.services.directory.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import eu.heliovo.dpas.ie.services.directory.dao.exception.DpasUtilitiesException;

public class DpasUtilities 
{
	DateFormat 			helioFormatter 	= 	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public DpasUtilities() 
	{
		super();
		helioFormatter.setLenient(false);
	}

	public	String	dateToHELIOTime(Date d)
	{
		helioFormatter.setLenient(false);
		return helioFormatter.format(d);
	}

	public	String	calendarToHELIOTime(Calendar c)
	{
		helioFormatter.setLenient(false);
		return helioFormatter.format(c.getTime()).replace(" ", "T");
	}

	public	Date	HELIOTimeToDate(String s) throws ParseException
	{
		helioFormatter.setLenient(false);
		return helioFormatter.parse(s.replace("T"," "));
	}
	
	public	Calendar	HELIOTimeToCalendar(String s) throws ParseException
	{
		Calendar 	c	=	Calendar.getInstance();
		c.setTime(HELIOTimeToDate(s));
	    c.set(Calendar.MILLISECOND,0);
	    c.setTimeZone(TimeZone.getTimeZone("GMT"));
	    
	    return c;
	}
	
	
}
