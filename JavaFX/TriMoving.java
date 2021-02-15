import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.Group;
public class TriMoving extends Application{
	public static void main(String[]args){
		launch(args);

	}
	public void start(Stage stage)throws Exception{
		View v=new View();
		Scene scene=new Scene(v,500,400);
		stage.setScene(scene);
		stage.show();
	}
}
class View extends Group{
	public View(){
		Polygon triangle=new Polygon(100,20,130,230,250,130);
		triangle.setFill(Color.NAVY);
		TranslateTransition animation=new TranslateTransition(Duration.seconds(2),triangle);
		animation.setFromX(-50);
		animation.setFromY(50);
		animation.setToX(300);
		animation.setToY(50);
		animation.setCycleCount(Animation.INDEFINITE);
		animation.setAutoReverse(true);
		animation.play();
		getChildren().add(triangle);

	}
}