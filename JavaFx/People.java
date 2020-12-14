public class People{
	public static void main(String[]args){
		Tanaka tk=new Tanaka();
		tk.hello();
		Yamamoto ym=new Yamamoto();
		ym.hello();
		Yoshino yt=new Yoshino();
		yt.hello();
	}
}
class Yoshino,Tanaka,Yamamoto{
	String msg="Aloha!";
	public void hello(){
		System.out.println(msg);
	}
}
class Tanaka{
	String msg="ban ban ban";
	public void hello(){
		System.out.println(msg);
	}
}
class Yamamoto{
	String msg="失敗しました。";
	public void hello(){
		System.out.println(msg);
	}
}