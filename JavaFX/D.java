import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.scene.Group;
import javafx.animation.Timeline;
import javafx.scene.Background;

public class D extends Application{
	public static void main(String[]args){
		launch(args);
	}
}
@Override
public void start(Stage stage)throws Exception{
	View v=new View();
    Scene scene=new scene(v,100,100);
    Scene 
    Rectangle rt=new Rectangle(0,0,70,20);
    rt.setFill(Color.BLUE);
}