import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class Game3 extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception{
		Group root=new Group();
		Scene scene=new Scene(root,650,350);
		Rectangle rect=new Rectangle(100,100,50,50);
		Rectangle rect01=new Rectangle(150,100,50,50);
		Circle cr=new Circle(240,120,40);
		Rectangle rect02=new Rectangle(280,100,50,50);
		Rectangle rect03=new Rectangle(320,100,50,50);
		rect.setFill(Color.RED);
		rect01.setFill(Color.GRAY);
		cr.setFill(Color.PINK);
		rect02.setFill(Color.RED);
		rect03.setFill(Color.GRAY);
		root.getChildren().add(rect);
		root.getChildren().add(rect01);
		root.getChildren().add(cr);
		root.getChildren().add(rect02);
		root.getChildren().add(rect03);
		stage.setScene(scene);
		stage.show();
	}
} 