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
			file3.createNewFile();//�����ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//file3.delete();//ɾ���ļ�
		File file4 = new File("d:/Users/uu/aa/bb/ccc");
		file4.mkdirs();//mkdirs �����������ļ���ǰ��ĸ�Ŀ¼������  ���ʹ���
		//file4.mkdir();//mkdir  �����������ļ���ǰ��ĸ�Ŀ¼������ ����ʧ�ܣ� �����Ŀ¼���ھʹ���
		
		if(file.isFile()){
			System.out.println("��һ���ļ�");
		}
		if(file1.isDirectory()){
			System.out.println("��һ��Ŀ¼") ;
		}


	}

}
