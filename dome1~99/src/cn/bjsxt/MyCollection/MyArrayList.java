package cn.bjsxt.MyCollection;

public class MyArrayList {
	private Object[] value;
	private int size = 0;
	 public MyArrayList(){
		 value = new Object[16];
		 //this(16);
	 }
	 
	 public MyArrayList(int size){
		 if(size < 0){
			 try {
				throw new Exception();//手动抛出异常
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
		 value = new Object[size];
	 }
	 
	 public boolean isEmpty(){
		 return size == 0;
	 }
	 
	 public int size(){
		 return size;
	 }
	 
	 public void add(Object obj){
		 value[size] = obj;
		 size++;
		 if(size >= value.length){
			 int newCapacity = value.length*2;
			 Object[] newList = new Object[newCapacity];
			 for(int i =0; i< value.length; i++){
				 newList[i] = value[i];
			 }
		 }
	 }
	 
	 public Object get(int index){
		 if(index < 0 || index > size-1){
			 try {
				throw new Exception();//手动抛出异常
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
		 return value[index];
	 }
	 
	 public int indexOf(Object obj){//判断是否在其内  在返回下表不再返回-1
		 if(obj == null){
             return -1; 
		 } else{
			 for(int i = 0; i < value.length; i++){
				 if(obj == value[i]){
					  return i;
				 }
			 }
			 return -1;
		 }
	 }
	 
	 public Object set(int index, Object obj){
		 rangCheck(index);
		 Object old = value[index];
		 value[index] = obj;
		 return value[index];
		 
	 }
	 public void rangCheck(int index){
		 if(index < 0 || index > size-1){
			 try {
				throw new Exception();//手动抛出异常
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
	 }

	public static void main(String[] args) {
         MyArrayList list = new MyArrayList(2);
         list.add("aaa");
         list.add(new Human("董优龙"));
         //list.add("bbb");//越界 抛出异常
         System.out.println(list.get(0));
         Human h = (Human) list.get(1);
         System.out.println(h.getName());
	}

}

