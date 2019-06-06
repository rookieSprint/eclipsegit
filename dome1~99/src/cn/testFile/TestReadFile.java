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
	  			char c =  (char)reader.read();//��ȡһ���ַ���
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
	 * ִ��˳��
	 * 1 ִ�� try,catch,������ֵ��ֵ
	 * 2 ִ��finally
	 * 3 return
	 */

}
