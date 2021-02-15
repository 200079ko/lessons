import javafx.application.Application;
import javafx.stage.Stage;
// import javafx.scene.Scene;
// import javafx.scene.layout.Pane;
public class TestFX extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage){
		stage.setTitle("Namestey,TestFX");
		// Pane pane=new Pane();
		// Scene scene=new Scene(pane);
		stage.show();
	}
}