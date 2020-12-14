class Student{
private String name;
public void sayHello(){
	System.out.println("Hello.My name is"+" "+this.name);
}
public void setName(){
	
}
}

public class ztest{
	public static void main(String[]args){
System.out.println("Hello!");
Student yamada=new Student();
yamada.name="Yamada Taro";
System.out.println(yamada.name);
yamada.sayHello();
Student tanaka=new Student();
tanaka.name="Masahiko Tanaka";
tanaka.sayHello();
	}
}