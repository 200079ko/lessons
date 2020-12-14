class Student {
      private String name;
      private String favorite;
      
      public void setName( String name ){
        this.name = name;
      }
      
      public void sayHello() {
        System.out.println( "Hello! My name is " + this.name );
      }
      
      public void setFavorite( String some ) {
        this.favorite = some;
      }
      
      public void sayFavorite() {
        System.out.println( "I love " + this.favorite );
      }
    }
    
    public class Test1 {
      public static void main ( String[] args ) {
        Student yamada = new Student();
        yamada.setName( "Yamada Taro" );
        yamada.sayHello();
        yamada.setFavorite( "coffee" );
        yamada.sayFavorite();
        
        Student tanaka = new Student();
        tanaka.setName( "Tanaka Masahiko" );
        tanaka.sayHello();
        tanaka.setFavorite( "抹茶" );
        tanaka.sayFavorite();
      }
    }