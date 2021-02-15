import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.javafx.scene.input.KeyCode;
import javafx.event.EventHandler;
public class Shout1 extends Application{
	private BreakoutThread breakoutthread;
		public static void main(String[]args){
			launch(args);
		}
		@Override
		public void start(Stage stage){
			stage.setTitle("Namestey!");
			Pane pane=new Pane();
			Scene scene=new Scene(pane);
			stage.setScene(scene);
			Canvas canvas =new Canvas(640,480);
			GraphicsContext gc=canvas.getGraphicsContext2D();
			pane.getChildren().add(canvas);
			scene.setOnkeyPressed(
				new EventHandler(KeyEvent e){
					key.keyPressed(e);
				}
			}
			);
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
		this.ball=new Ball();
		this.bar=new Bar();
		
	}
	@Override
	public void handle(long time){
	gc.clearRect(0,0,640,480);
	ball.draw(gc);
	ball.move();
	bar.draw(gc);
}
}
	
	class Ball{
		private int x;
		private int y;
		private int x_speed;
		private int y_speed;
		private int size;
		public Ball(){
			x=0;
			y=0;
			x_speed=5;
			y_speed=5;
			size=30;
		}
		public void draw(GraphicsContext gc){
		gc.setFill(Color.RED);
		gc.fillOval(x,y,20,20);	
		}
		public void move(){
				x+=x_speed;
				y+=y_speed;
				if(x>640-size){
				x_speed*= -1;
			}
				if(y>480-size){
				y_speed*=-1;
			}
				if (x<0){
				x_speed*=-1;
			}
				if(y<0){
				y_speed*=-1;
			}
	}
		class Bar{
			private int x;
			private int y;
			private int w;
			private int h;
			private int x_speed;
			private int y_speed;
			private Key key;
			public Bar(){
				this.x=50;
				this.y=450;
				this.w=80;
				this.h=20;
				this.key=Key;
			}
			public void draw(GraphicsContext gc){
				gc.setFill(Color.BLUE);
				gc.fillRect(x,y,w,h);
			}
			public void move(){
				if(key.right==true){
					x+=x_speed;
				}
			}
			class Key{
				private boolean right;

				public Key(){
					this.rightt=false;
				}
				public void keyPressed(KeyEvent e){
					if(e.getCode()==KeyCode.RIGHT){
						right=true;
						System.out.println("That's RIGHT");
					}
				}
			}

		
	}
}