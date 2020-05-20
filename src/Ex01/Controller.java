package Ex01;

import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Controller implements Initializable{
	@FXML private Button login;
	@FXML private TextField id;
	@FXML private TextField pw;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		login.setOnMouseClicked(e->loginevent());
		
	}

	public void loginevent() {
		MyDB db = new MyDB();
		HashMap map = db.getTable();
		System.out.println(map.entrySet());
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key);
			if(id.getText().isEmpty()!=true) {
				System.out.println("hihi");
				if(id.getText().equals(key)) {
					
					if(pw.getText().equals(map.get(key))) {
						System.out.println("�α��μ���");
						Alert alert = new Alert(AlertType.CONFIRMATION);
						alert.setContentText("�α��� ����");
						alert.show();
						break;
					}
					
					
					//System.out.println("�α��� ����");
					//break;
				}else {
					System.out.println("�α��ν���");
					Alert alert = new Alert(AlertType.ERROR);
					alert.setContentText("�α��� ����");
					alert.show();
					id.clear();
					pw.clear();
					id.requestFocus();
					continue;
				}
				
			}
		}
	}

}
