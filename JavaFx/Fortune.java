import java.util.Random;
public class Fortune{
	public static void main(String[]args){
		String[] fortune={"lucky","usual","unlucky"};
		Random random=new Random();
		int num=random.nextInt(3);
		System.out.println(fortune[num]);
	}
}