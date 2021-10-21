package dad.login;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void stop() throws Exception {
		super.stop();
		System.out.println("Aplicación Cerrandose");
	}

}
