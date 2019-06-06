package cn.bjsxt.time;

import java.io.ObjectInputStream.GetField;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VisualCalendar {

	public static void main(String[] args) {
		System.out.println("请输入日期（按此格式输入 2050-5-26）：");
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.nextLine();
		
		//String temp = "2017-4-24";
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = format.parse(inputStr);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1);
			//System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			//System.out.println(calendar.getActualMaximum(Calendar.DATE));
			int startWeek = calendar.get(Calendar.DAY_OF_WEEK);//获取当前日期所对应的星期
			int maxDate = calendar.getActualMaximum(Calendar.DATE);//获取当月最大天数
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			for(int i = 1; i < startWeek; i++){
				System.out.print("\t");
			}
			for(int i = 1; i<= maxDate;i++)
			{
				if(i == day)
				{
					System.out.print("*");
				}
				System.out.print(i+"\t");
				int w = calendar.get(Calendar.DAY_OF_WEEK);
				if(w==Calendar.SATURDAY)//每逢周六换行
				{
					System.out.print("\n");
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		

	}

}
