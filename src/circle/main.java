package circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class main extends Application {

	public static double WorldWidth = 400;
	public static double WorldHeight = 400;

	public void start(Stage stage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root, WorldWidth, WorldHeight, Color.WHITE);
		Circle cir = new Circle(20, Color.BLUE);
		
		
		cir.setTranslateY(WorldHeight/2);
		cir.setTranslateX(WorldWidth/2);
		
		
		
		stage.setTitle("GitHub-Intro");
		stage.setScene(scene);
		stage.show();
		
		root.getChildren().add(cir);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}

