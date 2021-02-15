import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
public class C extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start (Stage stage)throws Exception{
		Group root =new Group();
		Scene scene=new Scene(root,400,300);
		Circle circle=new Circle(150,150,25);
		circle.setFill(Color.BROWN);
		root.getChildren().add(circle);
		stage.setScene(scene);
		stage.show();

	}
}