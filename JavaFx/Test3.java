import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
	public class Test3 extends Application{
		public static void main(String[]args){
			launch(args);
		}
		@Override
		public void start(Stage stage)throws Exception{
			String name="Gopal";
			String cls="IG12";
			String msg="Hello,JavaFX";
			Label l1=new Label(name);
			Label l2=new Label(cls);
			Label l3=new Label(msg);

			BorderPane pane=new BorderPane();
			pane.setCenter(l1);
			pane.setTop(l3);
			pane.setBottom(l2);
			Scene scene=new Scene(pane,300,200);
			stage.setScene(scene);
			stage.show();
		}
	}