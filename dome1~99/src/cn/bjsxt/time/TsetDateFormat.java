package cn.bjsxt.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;//时间字符串的转化

import java.util.Date;

public class TsetDateFormat {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");//格式化字符串，格式自行设计
		Date d = new Date(123213123);
		Date dd = new Date();
		System.out.println(dd);
		System.out.println(System.currentTimeMillis()); 
		String str = df.format(d);//format将时间对象按格式化字符串 ，转化字符串
		System.out.println(str);
        String str2 =  "2014-6-28";
        DateFormat df2 = new SimpleDateFormat("yyyy-mm-dd");//括号内格式要和字符串格式保持一致
        try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
