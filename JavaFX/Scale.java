import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.stage.Stage;
public class Scale extends Application{
	public static void main(String[]args){
		launch(args);
	}
	public void start(Stage stage)throws Exception{
		View v=new View();
		Scene scene=new Scene(v,500,500);
		stage.setScene(scene);
		stage.show();
	}
}
class View extends Group{
	public View(){
		Rectangle rtr=new Rectangle(-50,-50,60,60);
		rtr.setFill(Color.CYAN);
		ScaleTransition animation2=new ScaleTransition(Duration.seconds(2),rtr);
		animation2.setFromX(0.01);
		animation2.setFromY(0.01);
		animation2.setToX(10);
		animation2.setToY(10);
		animation2.setCycleCount(Animation.INDEFINITE);
		animation2.play();
		animation2.setAutoReverse(true);
		getChildren().add(rtr);
		Circle crl=new Circle(0,25,25);
		crl.setFill(Color.RED);
		ScaleTransition animation=new ScaleTransition(Duration.seconds(2),crl);
		animation.setFromX(0.1);
		animation.setFromY(0.1);
		animation.setToX(5);
		animation.setToY(5);
		animation.setCycleCount(Animation.INDEFINITE);

		animation.play();
		animation.setAutoReverse(true);
		getChildren().add(crl);
			
	}
}