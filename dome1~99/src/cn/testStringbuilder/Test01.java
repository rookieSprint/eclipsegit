package cn.testStringbuilder;
/**
 * 测试可变字符序列  StringBuilder（线程不安全，效率高 ）, StringBuffer（线程安全，效率低）
 * string：不可变字符序列 
 * @author uu
 *
 */
public class Test01 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //字符串长度初始位16
		StringBuilder sb1 = new StringBuilder(32); //字符串长度初始位32
		StringBuilder sb2= new StringBuilder("a"); //字符串长度初始位17，value[] = {'a',\u0000,\u0000..}
        sb2.append("bc");
        System.out.println(sb2);
        sb2.append("bc").append(true).append("efg");
        System.out.println(sb2);
        
        String str = new String("abc");
        for(int i = 0;i < 3;i++)
        {
        	str += i;
        }
        System.out.println(str);
        /**
         * str指向new出的
         * 创建了5个对象new一个   “abc” “abc0” "abc01" "abc012"
         * str不停地指向新的对象  浪费空间
         */
        
        StringBuilder str1 = new StringBuilder("abc");
        for(int i = 0; i < 3; i++){
        	str1.append(i);
        }
        System.out.println(str1);
        /**
         *append方法可直接给后面添加
         *当长度大于初始长度时 会对数组扩容 （新建数组）
         */
        
	}

}
