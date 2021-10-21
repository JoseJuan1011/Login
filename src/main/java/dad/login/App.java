package dad.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller controller = new Controller();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(controller.getView(), 420, 300);
		
		primaryStage.setTitle("Iniciar Sesión");
		primaryStage.setScene(scene);
		primaryStage.show();
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
