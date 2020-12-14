import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
public class B extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage){
		View v=new View();
		Scene scene=new Scene(v,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
class View extends Group{
	public View(){
		Rectangle h=new Rectangle(0,0,50,50);
		h.setFill(Color.PINK);
		Rectangle h1=new Rectangle(0,0,50,50);
		h.setFill(Color.RED);
		Rectangle h2=new Rectangle(0,0,50,50);
		h.setFill(Color.GREEN);
		RotateTransition rotta=new RotateTransition(Duration.seconds(1),h);
		rotta.setByAngle(180);
		rotta.setCycleCount(Animation.INDEFINITE);
		TranslateTransition animation=new TranslateTransition(Duration.seconds(2),h);
		 animation.setFromX(0);
		animation.setFromY(00);
		 animation.setToX(450);
		 animation.setToY(450);
		animation.setCycleCount(Animation.INDEFINITE);
		animation.setAutoReverse(true);
		rotta.play();
		animation.play();
		getChildren().add(h);
		RotateTransition rot=new RotateTransition(Duration.seconds(1),h1);
		rot.setByAngle(100);
		rot.setCycleCount(Animation.INDEFINITE);
		TranslateTransition animation2=new TranslateTransition(Duration.seconds(2),h1);
		 animation2.setFromX(0);
		 animation2.setFromY(00);
		 animation2.setToX(350);
		 animation2.setToY(450);
		animation2.setCycleCount(Animation.INDEFINITE);
		animation2.setAutoReverse(true);
		rot.play();
		animation2.play();
		getChildren().add(h1);
		RotateTransition rot2=new RotateTransition(Duration.seconds(1),h2);
		rot2.setByAngle(90);
		rot2.setCycleCount(Animation.INDEFINITE);
		TranslateTransition animation3=new TranslateTransition(Duration.seconds(2),h2);
		 animation3.setFromX(0);
		animation3.setFromY(00);
		 animation3.setToX(350);
		 animation3.setToY(450);
		animation3.setCycleCount(Animation.INDEFINITE);
		animation3.setAutoReverse(true);
		rot2.play();
		animation.play();
		getChildren().add(h2);
	}
}