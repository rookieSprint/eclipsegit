package cn.bjsxt.time;

import java.util.Date;

public class testDate {

	public static void main(String[] args) {
 
		Date date ;
		date = new Date();//括号中不写  默认为当前时间
		System.out.println(date);
		System.out.println(date.getTime());//getTime（）获取当前时间的long值
        Date date2 = new Date(1000);
        System.out.println(date2.toGMTString());
        date2.setTime(2000);//设置long值
        System.out.println(date2.toGMTString());
         }

}
