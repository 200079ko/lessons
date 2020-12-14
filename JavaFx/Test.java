import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Test extends Application{
	public static void main(String[]args){
		launch (args);
	}
	@Override
	public void start (Stage stage)throws Exception{
		Group root=new Group();
		Scene scene=new Scene(root,400,300);
		Rectangle rect=new Rectangle(200,100,60,60);
		rect.setFill(Color.AQUA);
	
		root.getChildren().add(rect);
		stage.setScene(scene);
		stage.show();
	}
}