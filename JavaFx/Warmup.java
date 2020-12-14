public class Warmup{
	public static void main (String[]args){
		//String[]data=getData()
		String data=getData();
		showData(data);
	}
	public static String  getData(){
		System.out.println("getdata()!");
		return "Namaste";
	}
	public static void showData(String name){
		System.out.println("showdata()!");
		System.out.println(name);
	}
}