package cn.bjsxt.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

 

public class VisualCanlendar02 {
	public static void main(String[] args) {
		String temp = "2017-7-16";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");	
		try {
			Date date = dateFormat.parse(temp);
		    Calendar calendar = new GregorianCalendar();
		    calendar.setTime(date);
		    int day = calendar.get(Calendar.DATE);
		    calendar.set(Calendar.DATE, 1);//��ȡ��ǰһ��
		    //System.out.println(calendar.get(calendar.DAY_OF_WEEK));//��ȡ��Ǯ��������Ӧ���ڼ���sunday==1��
		   // System.out.println(calendar.getActualMaximum(calendar.DATE));//��ȡ�����������  
		    int startWeek = calendar.get(Calendar.DAY_OF_WEEK);
		    int maxDay = calendar.getActualMaximum(Calendar.DATE);
		    System.out.println("��\tһ\t��\t��\t��\t��\t��");
			for(int i = 1; i < startWeek; i++){
				System.out.print("\t");
			}
		    for(int i = 1;i <= maxDay; i++){
		    	if(i == day){
		    		System.out.print("*");
		    	}
		    	System.out.print(i+"\t");
		    	int w = calendar.get(Calendar.DAY_OF_WEEK);
		    	if(w == Calendar.SATURDAY){
		    		System.out.println();
		    	}
		    	calendar.add(Calendar.DATE, 1);
		    }
		    
		} catch (ParseException e) {
			e.printStackTrace();
		}
//		int count = 0;
//		System.out.println("��\tһ\t��\t��\t��\t��\t��");
//		for(int i = 1; i<=31;i++){
//			System.out.print(i+"\t");
//			count++;
//			if(count%7 == 0){
//				System.out.println();
//			}
//		}
	}

}
