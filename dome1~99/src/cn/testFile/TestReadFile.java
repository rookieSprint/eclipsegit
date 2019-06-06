package cn.testFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestReadFile {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			    reader = new FileReader("d:/a.txt");
	  			char c =  (char)reader.read();//读取一个字符串
	  			char c1 = (char)reader.read();
	  			System.out.println(""+c+c1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader!= null){
				    reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	/*
	 * 执行顺序：
	 * 1 执行 try,catch,给返回值赋值
	 * 2 执行finally
	 * 3 return
	 */

}
