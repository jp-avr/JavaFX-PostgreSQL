package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ArmaPersonagemFormController implements Initializable {

    @FXML
    private TextField txtCodArma;

    @FXML
    private TextField txtCodPersonagem;

    @FXML
    private Label labelErrorCodArma;

    @FXML
    private Label labelErrorCodPersonagem;

    @FXML
    private Button btSalvar;

    @FXML
    private Button btCancelar;

    @FXML
    public void onBtSalvarAction(){
        System.out.println("onBtSalvarAction");
    }

    @FXML
    public void onBtCancelarAction(){
        System.out.println("onBtCancelarAction");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {  
        initializeNodes();      
    }

    private void initializeNodes(){
        Constraints.setTextFieldInteger(txtCodArma);
        Constraints.setTextFieldInteger(txtCodPersonagem);
    }
    
    
}