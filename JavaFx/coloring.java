import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class coloring extends Application{
	public static void main(String []args){
		launch(args);
	}
	@Override
	public void start (Stage stage)throws Exception{
		Group root =new Group();
		Scene scene=new Scene(root,450,450);
		Rectangle rect01=new Rectangle(250,125,50,50);
		Rectangle rect02=new Rectangle(200,125,50,50);
		Rectangle rect03=new Rectangle(100,125,50,50);
		Rectangle rect04=new Rectangle(150,125,50,50);
		rect01.setFill(Color.BLUE);
		rect02.setFill(Color.BLACK);
		rect03.setFill(Color.BROWN);
		rect04.setFill(Color.PINK);
		root.getChildren().add(rect01);
		root.getChildren().add(rect02);
		root.getChildren().add(rect03);
		root.getChildren().add(rect04);
		stage.setScene(scene);
		stage.show();
	}
}