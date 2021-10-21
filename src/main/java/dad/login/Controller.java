package dad.login;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;

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
//		System.out.println("Chuck Norris    : " + ldap.login("cnorris", "patada"));
//		System.out.println("Charles Bronson : " + ldap.login("cbronson", "pistola"));
//		System.out.println("David Carradine : " + ldap.login("dcarradine", "kungfu"));
//		System.out.println("David Carradine : " + ldap.login("dcarradine", "karate"));
//		System.out.println("Michael Knight  : " + ldap.login("mknight", "kit"));
	}

	private void OnCancelarButton() {
		System.exit(0);
	}
}
