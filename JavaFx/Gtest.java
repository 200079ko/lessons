import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.ParallelCamera;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;

public class Gtest extends Application{
	public static void main (String[]args){
		launch(args);
	}
	@Override
	public void start (Stage stage)throws Exception{
		Group root=new Group();
		Scene scene=new Scene(root,200,200);
		Rectangle rect1=new Rectangle(100,100,50,50);
		Rectangle rect2=new Rectangle(150,100,50,50);
		 rect1.setFill(Color.AQUA);
		 rect2.setFill(Color.rgb(0,255,0));
		 root.getChildren().add(rect1);
		 root.getChildren().add(rect2);
		 stage.setScene(scene);
		 stage.show();
		 
	}
}