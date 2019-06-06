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
		System.out.println("���������ڣ����˸�ʽ���� 2050-5-26����");
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
			int startWeek = calendar.get(Calendar.DAY_OF_WEEK);//��ȡ��ǰ��������Ӧ������
			int maxDate = calendar.getActualMaximum(Calendar.DATE);//��ȡ�����������
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
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
				if(w==Calendar.SATURDAY)//ÿ����������
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
