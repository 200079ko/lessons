public class People {
    public static void main ( String[] args ) {
      Teacher tanaka = new Teacher("田中", "元気ですか？");
      Teacher yamamoto = new Teacher("山本", "出席たりてますか？");
      Teacher yoshino = new Teacher("吉野", "ALOHA!");
      
      tanaka.hello();
      yamamoto.hello();
      yoshino.hello();
      attack( yamamoto, tanaka );
      attack( tanaka, yamamoto );
      attack( tanaka, yamamoto );
       
    }
    public void attack( Teacher a, Teacher b ) {
	System.out.println( a.name + "のこうげき！" );
    System.out.println( b.name + "に 5 のダメージ！" );
		int newHp = b.hp - 5;
      	b.hp = newHp;

    	if  (b.hp <= 0  ) {
        System.out.println("yoshinoが倒れてしまった。" );
      }
    }
  }
  	class Teacher {
    String name = "";
    String msg = "";
    int hp;
    
    Teacher( String namae, String kotoba, int value ) {
      name = namae;
      msg = kotoba;
      hp = value;
    }
    
    public void hello() {
      System.out.println( name + "です。" + msg );
    }
  }
  