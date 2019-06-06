package cn.testFile;

import java.io.File;

public class FileTree {

	public static void main(String[] args) {
		File file = new File("D:/Users/uu");
		printFile(file,1);

	}
	static void printFile(File file,int level){
    	for (int i = 0; i < level; i++) {
			System.out.print("_");
		}
    	System.out.println(file.getName());
    	if(file.isDirectory()){
    		File[] files = file.listFiles();
    		for(File temp : files){
    			printFile(file, level+1);
    		}
    	}
    }
   
}
