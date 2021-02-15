import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Atari extends Application{
	public static void main(String[]args){
		launch(args);
	}
	public void start(Stage stage)throws Exception{
		View v=new View();
		Scene scene=new Scene(v,500,400);
		stage.setScene(scene);
		stage.show();
		scene.setOnKeyPressed(e-> System.out.println("キー押されました!"));
	}
}
class View extends Group{
	public View(){
		Rectangle gle=new Rectangle(0,0,60,70);
		gle.setFill(Color.GREEN);
		Rectangle gle2=new Rectangle(230,30,80,80);
		gle2.setFill(Color.BLACK);
	TranslateTransition animation=new TranslateTransition(Duration.seconds(2),gle);
	animation.setFromX(-50);
	animation.setFromY(50);
	animation.setToX(300);
	animation.setToY(50);
	animation.setCycleCount(Animation.INDEFINITE);
	animation.play();
	getChildren().add(gle);
	getChildren().add(gle2);

	}
}