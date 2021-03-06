import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.util.Duration;
public class Moving2 extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception{
		View v=new View();
		Scene scene=new Scene(v,400,500);
		stage.setScene(scene);
		stage.show();
	}
}
class View extends Group{
	public View(){
		Rectangle rec=new Rectangle(0,0,25,25);
		rec.setFill(Color.AQUAMARINE);
		TranslateTransition animation=new TranslateTransition(Duration.seconds(1),rec);
		animation.setFromX(50);
		animation.setFromY(50);
		animation.setToX(300);
		animation.setToY(300);
		animation.setCycleCount(Animation.INDEFINITE);
		animation.play();
		getChildren().add(rec);
	}
}