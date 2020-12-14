import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.checkbox;


public class Pri extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception{
		Label label=new Label("Hello");
		CheckBox check=new CheckBox("チャッキボックス");
		check.setOnAction((ActionEvent)->{
			String kekka=check.isSelected()?"Selected":"not Selected...";
			label.setText(kekka);
			)
		}
	}
}