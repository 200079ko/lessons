import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;


public class Test5 extends Application{
	public static void main (String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception{
		Label msg=new Label("Hello,JavaFX!");
		Label name=new Label("Gopal");
		Label classCode=new Label("ig-12");
		BorderPane pane=new BorderPane();
		pane.setTop(msg);
		pane.setCenter(name);
		pane.setBottom(classCode);
		Scene scene =new Scene( pane,500,500);
		stage.setScene(scene);
		stage.show();
	}
}