package cn.testFile;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestThrows {

	public static void main(String[] args) {
		String string = null;
		try {
			string = new TestThrows().openFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        System.out.println(string);
	}
	/*
	 * throw 声明异常 谁调用处理 
	 */
	String openFile() throws FileNotFoundException{
		FileReader reader =  new FileReader("d:/a.txt");
        
		return "";
	}

}
