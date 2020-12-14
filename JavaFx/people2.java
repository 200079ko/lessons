public class people2{
 public static void main(String[] args) {
		Teacher tanaka=new Teacher("Tanaka","別にいいけど");
		Teacher yamamoto=new Teacher("Yamamoto","出席足りてますか？");
		Teacher yoshino=new Teacher("Yoshino","Aloha!");
		tanaka.hello();
		yamamoto.hello();
		yoshino.hello();
	}
}
class Teacher {
    String name = "";
    String msg = "";
    int hp;
    
    Teacher( String namae, String kotoba ) {
      name = namae;
      msg = kotoba;
    }
    
    public void hello() {
      System.out.println( name + "です。" + msg );
    }
  }