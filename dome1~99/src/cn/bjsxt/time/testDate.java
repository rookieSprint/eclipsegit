package cn.bjsxt.time;

import java.util.Date;

public class testDate {

	public static void main(String[] args) {
 
		Date date ;
		date = new Date();//�����в�д  Ĭ��Ϊ��ǰʱ��
		System.out.println(date);
		System.out.println(date.getTime());//getTime������ȡ��ǰʱ���longֵ
        Date date2 = new Date(1000);
        System.out.println(date2.toGMTString());
        date2.setTime(2000);//����longֵ
        System.out.println(date2.toGMTString());
         }

}
