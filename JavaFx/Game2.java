import java.util.Scanner;
import java.util.Random;
public class Game2{
	public static void main(String [] args){
		System.out.println("##################");
		System.out.println("#                #");
		System.out.println("##★First Game★ ##");
		System.out.println("#                #");
		System.out.println("##################");
		System.out.println("★★★★★★★★★★★★#");
		System.out.println("★  ver.11        ★");
		System.out.println("★By Gopal Katwal ★");
		System.out.println("★                ★");
		System.out.println("★★★★★★★★★★★★★");
		Scanner sc=new Scanner(System.in);
		System.out.println("play?(1:play  2:end");
		int userData=sc.nextInt	();	
		if(userData==1){
			System.out.println("let's play★○○★");
		Random random=new Random();		
		int number=0;
		while(true){
			number++;
		int target=random.nextInt(10);
				System.out.print("your answer?");
			int answer=sc.nextInt();			
			if(answer==target){
				System.out.println("you win!");
				System.out.println("in"+number);
				break;
			}else{
				System.out.println("Target"+" "+target);
				System.out.println("you loose....");
			}
			System.out.println("play again?(1:play  2:end");
				int imput=sc.nextInt();	
			if(imput==1){
				System.out.println("let's play★○○★");
			}else if(imput==2){
				System.out.println("★★★★★★★★★★");
				System.out.println("★  end game★");
				System.out.println("★★★★★★★★★★");
			}else{
				System.out.println("error");
			break;
		}
	}
	}	
}
}