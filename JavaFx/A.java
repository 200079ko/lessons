import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.animation.Animation;
import javafx.util.Duration;
import javafx.scene.paint.Color;
public class A extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage primaryStage){
		View v=new View();
		Scene scene=new Scene(v,400,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
class View extends Group{
	public View(){
		Rectangle rect=new Rectangle(0,0,50,50);
		rect.setFill(Color.SKYBLUE);
		Rectangle rect2=new Rectangle(0,0,50,50);
		rect2.setFill(Color.AQUAMARINE);
		TranslateTransition animation=new TranslateTransition(Duration.seconds(0.2),rect);
		animation.setFromX(0);
		animation.setFromY(0);
		animation.setToX(350);
		animation.setToY(250);
		animation.setCycleCount(Animation.INDEFINITE);
		animation.setAutoReverse(true);
		animation.play();
		getChildren().add(rect);
	TranslateTransition animation2=new TranslateTransition(Duration.seconds(0.2),rect2);
		animation2.setFromX(100);
		animation2.setFromY(300);
		animation2.setToX(200);
		animation2.setToY(0);
		animation2.setCycleCount(Animation.INDEFINITE);
		animation2.setAutoReverse(true);
		animation2.play();
		getChildren().add(rect2);
		Circle cr=new Circle(200,100,25);
		cr.setFill(Color.YELLOW);
		TranslateTransition animation3=new TranslateTransition(Duration.seconds(0.2),cr);
		animation3.setFromX(190);
		animation3.setFromY(0);
		animation3.setToX(-190);
		animation3.setToY(0);
		animation3.setCycleCount(Animation.INDEFINITE);
		animation3.setAutoReverse(true);
		animation3.play();
		getChildren().add(cr);
	}
}

