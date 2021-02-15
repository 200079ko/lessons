import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
public class BarTestFX extends Application{
	private BreakoutThread breakoutthread;
	public static void main(String[]args){
		launch(args);
	}
	@Override
	public void start(Stage stage){
		stage.setTitle("Ball Test");
		Bar bar =new Bar();
		Key key=new Key();
		
		Pane pane=new Pane();

		Scene scene=new Scene(pane);

		stage.setScene(scene);
		scene.setOnKeyPressed(
		new EventHandler<KeyEvent>(){
			public void handle(KeyEvent e){
				key.keyPressed(e);
			}
		}	


	);

		Canvas canvas=new Canvas(640,480);
		GraphicsContext gc=canvas.getGraphicsContext2D();
		pane.getChildren().add(canvas);


		breakoutthread=new BreakoutThread(gc);
		breakoutthread.start();


		stage.show();
	}

}
class BreakoutThread extends AnimationTimer{
	private GraphicsContext gc;
	private Ball ball;
	private Bar bar;
	public BreakoutThread(GraphicsContext gc){
		this.gc=gc;
		ball=new Ball();
		bar=new Bar();
	}
	@Override
	public void handle(long time){
		gc.clearRect(0,0,640,480);
		ball.draw(gc);
		bar.draw(gc);
		ball.move();
	}
}
	class Ball{
		private int x;
		private int y;
		private int x_speed;
		private int y_speed;

		public Ball(){
			this.x=20;
			this.y=20;
			this.x_speed=5;
			this.y_speed=5;
		}


		public void draw(GraphicsContext gc){
			gc.setFill(Color.GREEN);
			gc.fillOval(x,y,20,20);
		}
		public void move(){
			this.x+=this.x_speed;
			this.y+=this.y_speed;
		}
		

	}
	class Key{
		public void keyPressed(KeyEvent e){
			switch (e.getCode()){
				case LEFT:
				System.out.println("LEFT pressed.");
				case RIGHT:
				System.out.println("RIGHT pressed.");
				break;
				default:
				break;
			}
		}
	}
	class Bar{
		private int x;
		private int y;
		private int w;
		private int h;
		private int x_speed;
		private int y_speed;
		public Bar(){
		x=50;
		y=450;
		w=100;
		h=20;
		}
		public void draw(GraphicsContext gc){
			gc.setFill(Color.BLUE);
			gc.fillRect(x,y,w,h);
		}
	}