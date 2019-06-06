package cn.testFile;

public class myException extends Exception{
	public myException(){
		
	}
	public myException(String message){
		super(message);
	}

}
class TestmyException{
	void test()throws myException{
		
	}
	public static void main(String[] args){
		try {
			new TestmyException().test();
		} catch (myException e) {
			e.printStackTrace();
		};
	}
	
}