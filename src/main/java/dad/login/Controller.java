package dad.login;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {

	private View view = new View();
	
	private Model model = new Model();
	
	public Controller() {
		
		view.getUsuarioTextField().textProperty().bindBidirectional(model.usuarioProperty());
		
		view.getContraseñaPasswordField().textProperty().bindBidirectional(model.contraseñaProperty());
		
		view.getUseLdapCheckBox().selectedProperty().bindBidirectional(model.usarLdapProperty());
		
		view.getAccederButton().setOnAction((e -> OnAccederButton()));
		
		view.getCancelarButton().setOnAction((e -> OnCancelarButton()));
	}

	private void OnAccederButton() {
		AuthService ldap = model.isUsarLdap() ? new LdapAuthService() : new FileAuthService();
		try {
			Alert alert;
			if (ldap.login(model.getUsuario(), model.getContraseña())) {
				alert = OnAlertPermitido();
			}
			else {
				alert = OnAlertDenegado();
			}
			System.out.println("Usuario: "+model.getUsuario()+", Contraseña: "+model.getContraseña());
			alert.showAndWait();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private Alert OnAlertPermitido() {
		Alert alert = new Alert(AlertType.INFORMATION, "Las credenciales de acceso son válidas.");
		alert.setHeaderText("Acceso permitido");
		return alert;
	}

	private Alert OnAlertDenegado() {
		Alert alert = new Alert(AlertType.ERROR, "El usuario y/o contraseña no son válidos.");
		alert.setHeaderText("Acceso denegado");
		return alert;
	}

	private void OnCancelarButton() {
		System.exit(0);
	}

	public View getView() {
		return view;
	}

	public Model getModel() {
		return model;
	}
}
