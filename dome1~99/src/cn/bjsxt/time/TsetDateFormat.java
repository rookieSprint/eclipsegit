package cn.bjsxt.time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;//ʱ���ַ�����ת��

import java.util.Date;

public class TsetDateFormat {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("yyyy��MM��dd��");//��ʽ���ַ�������ʽ�������
		Date d = new Date(123213123);
		Date dd = new Date();
		System.out.println(dd);
		System.out.println(System.currentTimeMillis()); 
		String str = df.format(d);//format��ʱ����󰴸�ʽ���ַ��� ��ת���ַ���
		System.out.println(str);
        String str2 =  "2014-6-28";
        DateFormat df2 = new SimpleDateFormat("yyyy-mm-dd");//�����ڸ�ʽҪ���ַ�����ʽ����һ��
        try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
