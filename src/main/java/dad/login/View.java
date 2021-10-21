package dad.login;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;

public class View extends VBox {
	
	private GridPane dataPane;
	
	private TextField usuarioTextField;
	private PasswordField contraseñaPasswordField;
	
	private CheckBox useLdapCheckBox;
	
	private HBox buttonsBox;
	
	private Button accederButton;
	private Button cancelarButton;
	
	public View() {
		usuarioTextField = new TextField();
		usuarioTextField.setPromptText("Nombre de Usuario");
		
		contraseñaPasswordField = new PasswordField();
		contraseñaPasswordField.setPromptText("Contraseña de usuario");
		
		dataPane = new GridPane();
		dataPane.setHgap(5);
		dataPane.setVgap(5);
		dataPane.setAlignment(Pos.CENTER);
		dataPane.addRow(0, new Label("Usuario: "), usuarioTextField);
		dataPane.addRow(1, new Label("Contraseña: "), contraseñaPasswordField);
		
		RowConstraints[] rows = {
				new RowConstraints(),
				new RowConstraints()
		};
		
		dataPane.getRowConstraints().addAll(rows);
		
		rows[0].setValignment(VPos.CENTER);
		rows[1].setValignment(VPos.CENTER);
		
		ColumnConstraints[] cols = {
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		
		dataPane.getColumnConstraints().addAll(cols);
		
		cols[0].setHalignment(HPos.LEFT);
		cols[0].setMinWidth(10);
		
		cols[1].setMaxWidth(175);
		cols[1].setFillWidth(true);
		
		useLdapCheckBox = new CheckBox("Usar Ldap");
		
		accederButton = new Button("Acceder");
		
		cancelarButton = new Button("Cancelar");
		
		buttonsBox = new HBox(accederButton, cancelarButton);
		buttonsBox.setAlignment(Pos.CENTER);
		buttonsBox.setSpacing(5);
		
		getChildren().addAll(dataPane, useLdapCheckBox, buttonsBox);
		setAlignment(Pos.CENTER);
		setSpacing(5);
	}

	public TextField getUsuarioTextField() {
		return usuarioTextField;
	}

	public PasswordField getContraseñaPasswordField() {
		return contraseñaPasswordField;
	}

	public CheckBox getUseLdapCheckBox() {
		return useLdapCheckBox;
	}

	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}
}
