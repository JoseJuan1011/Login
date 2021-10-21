package dad.login;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;

public class Model {
	
	private StringProperty usuario;
	
	private StringProperty contraseña;

	private BooleanProperty usarLdap;
	
	public final StringProperty usuarioProperty() {
		return this.usuario;
	}
	

	public final String getUsuario() {
		return this.usuarioProperty().get();
	}
	

	public final void setUsuario(final String usuario) {
		this.usuarioProperty().set(usuario);
	}
	

	public final StringProperty contraseñaProperty() {
		return this.contraseña;
	}
	

	public final String getContraseña() {
		return this.contraseñaProperty().get();
	}
	

	public final void setContraseña(final String contraseña) {
		this.contraseñaProperty().set(contraseña);
	}


	public final BooleanProperty usarLdapProperty() {
		return this.usarLdap;
	}
	
	public final boolean isUsarLdap() {
		return this.usarLdapProperty().get();
	}
	

	public final void setUsarLdap(final boolean usarLdap) {
		this.usarLdapProperty().set(usarLdap);
	}
}
