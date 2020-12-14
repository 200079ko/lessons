import java.util.Scanner;
public class ArrayTest{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String[]names=new String[3];
		for(int i=0;i<3;i++){
			System.out.println("input name:");
			names[i]=sc.nextLine		}
		for(int i=0; i<3; i++){
			System.out.println(names[i]);
		}
		while(true){
			System.out.println("input password:");
			String password="qwerty";
			String userData=sc.nextLine			if( password.equals(userData)){
				System.out.println("OK!");
				System.out.println("welcome:");
			}else{
				System.out.println("Password Invalid.Please Try Again");
			}
			break;
		}
	}
}