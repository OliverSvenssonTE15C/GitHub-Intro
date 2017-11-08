package circle;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class main extends Application {

	public static double WorldWidth = 400;//Skapar variabler som representerar höjden/längden på scenen 
	public static double WorldHeight = 400;

	public void start(Stage stage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root, WorldWidth, WorldHeight, Color.WHITE);//Ger scenen höjd/längd
		Circle cir = new Circle(20, Color.BLUE);//Skapar en cirkel med radien 20 och färgen blå
		
		
		cir.setTranslateY(WorldHeight/2);//placerar cirkeln vid halva höjden av scenen
		cir.setTranslateX(WorldWidth/2);//placerar cirkeln vid halva bredden av scenen
		
		
		
		stage.setTitle("GitHub-Intro");
		stage.setScene(scene);
		stage.show();
		
		root.getChildren().add(cir);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}

