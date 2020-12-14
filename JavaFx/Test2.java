class Student{
	private String name;
public void setName(String data){
	this.name=data;
}
public String getName(){
	return this.name;
}
}
public class Test2{
public static void main (String[]args){
Student yamada=new Student();
yamada.setName("Yamada Taro");
System.out.println(yamada.getName());
}
}