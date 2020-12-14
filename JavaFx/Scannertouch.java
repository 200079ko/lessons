import java.util.Scanner;
public class Scannertouch{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("please input your name");
		String name=sc.nextLine();
		String msg="hello";
		System.out.println(msg+":"+name);
		System.out.println("please input your age");
		int age=sc.nextInt();
		System.out.println("Is it"+" "+"("+age+")"+" "+"correct?");

	}
}