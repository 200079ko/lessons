import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;


public class Test8 extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage)throws Exception{
		Label label=new Label("Hello");
		CheckBox check=new CheckBox("チェックボックス");
		check.setOnAction((ActionEvent)->{
			String kekka=check.isSelected()?"Selected!":"not selected...";
			label.setText(kekka);
		});	
BorderPane pane=new BorderPane();
pane.setTop(label);
pane.setCenter(check);
Scene scene=new Scene(pane,490,800);
stage.setScene(scene);
stage.show();
		}

}