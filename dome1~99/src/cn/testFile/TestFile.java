package cn.testFile;

import java.io.File;
import java.io.IOException;

import cn.bjsxt.MyCollection.MyArrayList;

public class TestFile {

	public static void main(String[] args) {
		File file = new File("D:/Users/uu/workspace/dome1~99/bin/cn/bjsxt/MyCollection/Human.class");//
		File file1 = new File("D:/Users/uu/workspace/dome1~99/bin/cn/bjsxt/MyCollection");
		File file2 = new File(file1,"MyArrayList.class");
		File file3 = new File(file1,"MyTest1212.class");
		try {
			file3.createNewFile();//创建文件
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//file3.delete();//删除文件
		File file4 = new File("d:/Users/uu/aa/bb/ccc");
		file4.mkdirs();//mkdirs 当所创建的文件夹前面的父目录不存在  他就创建
		//file4.mkdir();//mkdir  当所创建的文件夹前面的父目录不存在 创建失败， 如果父目录存在就创建
		
		if(file.isFile()){
			System.out.println("是一个文件");
		}
		if(file1.isDirectory()){
			System.out.println("是一个目录") ;
		}


	}

}
