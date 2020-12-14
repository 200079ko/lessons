import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.CheckBox;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class TestCheckbox extends Application{
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start (Stage stage)throws Exception{
		CheckBox check=new CheckBox("チャックボックス");
		check.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e){
				for(int i=0;i<1;i++){
				if(i==0){
					System.out.println(" Checked");
				}else{
					System.out.println("Not Checked");
				}
			}
		}
		});
		BorderPane pane=new BorderPane();
		pane.setCenter(check);
		Scene scene=new Scene(pane,600,600);
		stage.setScene(scene);
		stage.show();
	}
}