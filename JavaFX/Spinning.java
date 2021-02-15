import static javafx.scene.paint.Color;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Point3D;
import javafx.scene.Camera;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.stage.Stage;
import javafx.util.Duration;


public class Spinning extends Application{
	private double bodyBase=30;
	private double bodyHeight=bodyBase*3/2;
	private double baseRadius=bodyBase/2;
	
	@Override
	public void start(Stage stage)throws Exception{
		DoubleProperty spinAngle=new DoubleProperty();
		Rotate spin =new Rotate(0,Rotate.Z_AXIS);
		spin.angleProperty().bind(spinAngle);

		Timeline spinAnim=new Timeline(new KeyFrame(Duration.seconds(2),new KeyValue(spinAngle,360)));
		spinAnim.setCycleCount(Timeline.INDEFINITE);
		spinAnim.play();
		Group dreide1=createDreide1();
		Translate zTrans=new Translate(0,0,-(bodyHeight/2+baseRadius));
		dreide1.getTransforms().addAll(spin,zTrans);
		Scene scene=new Scene(dreide,200,200,true,SceneAntialiasing.BALANCED);
		scene.setFill(GOLD);
		scene.setCamera(createCamera());
		stage.setScene(scene);
		stage.show();
	}
	private Group createDreide1(){
		double handleHeight=bodyBase*3/4;
		Cylinder handle=new Cylinder(bodyBase/6,handleHeight);
		handle.setTranslateZ(-(bodyHeight+handleHeight)/2);
		handle.setRotationAxis(Rotate.X_AXIS);
		handle.setRotate(90);
		handle.setMaterial(new PhongMaterial(BLUE));
		Sphere base=new Sphere(baseRadius);
		base.setTranslateZ(bodyHeight/2);
		base.setMaterial(new PhongMaterial(GREEN));
		return new Group(handle,body,base);
	}
	private Camerea createCamera(){
		PerspectiveCamera camera=new PerspectiveCamera(true);
		camera.setFarClip(1000);
		int xy=150;
		Translate trans=new Translate(-xy,xy,-120);
		Rotate rotXY=new Rotate(70,new Point3D(1,1,0));
		Rotate rotZ=new Rotate(45,new Point3D(0,0,1));
		camera.getTransforms().addAll(trans,rotXY,rotZ);
		return camera;
	}
	public static void main(String[]args){
		launch();
	}

}