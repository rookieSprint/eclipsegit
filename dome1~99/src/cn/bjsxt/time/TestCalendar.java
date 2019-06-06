package cn.bjsxt.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author uu
 *
 */
public class TestCalendar {

	public static void main(String[] args) {
		Calendar c  = new GregorianCalendar();
		c.set(2017, 3, 24, 12, 04);
		
		//c.set(Calendar.YEAR, 2016);
		//c.set(Calendar.MONTH, 1);
		
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR));
		
		//ÈÕÆÚ¼ÆËã
		c.add(Calendar.YEAR,10);
		System.out.println(c);
		
		

	}

}
