import java.util.Scanner;
public class Scan{
	
	public static void main (String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("imput message");
		String msg=sc.nextLine();
		System.out.print("message: "+msg);

	}
}