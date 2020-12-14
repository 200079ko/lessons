public class MethodTest2{
	public static void main(String[]args){
		hello("Tanaka");
		hello("Yamamoto");
		hello("Tanaka");
		hello("Yoshino");
	}
	public static void hello(String name){
		String msg="Hello!";
		if(name.equals("Yoshino")){
			msg="Aloha!";
			System.out.println(msg+" "+name+"!");
		}else{
			System.out.println(msg+" "+name+"!");
		}
	} 
}