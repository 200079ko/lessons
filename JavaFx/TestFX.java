import javafx.application.Application;
  import javafx.stage.Stage;
  import javafx.scene.Scene;
  import javafx.scene.control.Label;
  import javafx.scene.layout.BorderPane;
  import javafx.scene.Scene;
  import javafx.scene.Group;
  import javafx.scene.image.Image;
  import javafx.scene.image.ImageView;
  import javafx.scene.layout.HBox;
  import javafx.scene.paint.Color;
  
  public class TestFX extends Application {
    public static void main ( String[] args ) {
      launch( args );
    }
    
    @Override
    public void start( Stage stage ) throws Exception {
     Image image=new Image("samurai.jpg");
     ImageView iv1=new ImageView();
     iv1.setImage(image);
     Group root=new Group();
     Scene scene=new Scene(root);
     scene.setFill(Color.BLACK);
     HBox box=new HBox();
     box.getChildren().add(iv1);
     root.getChildren().add(box);
     stage.setTitle("ImageView");
     stage.setWidth(500);
     stage.setHeight(300);
     stage.setScene(scene);
     stage.sizeToScene();
     stage.show();
    }
  }