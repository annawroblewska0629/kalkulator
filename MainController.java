package kalkulator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class MainController {
	
	@FXML
	private Label wynik;
	private long liczba1 = 0;
	private String operator = "";
	private boolean start = true;
	private Model model = new Model();
	//definujemy zmienne
	@FXML
	public void procesNumerow(ActionEvent wydarzenie) {
		if (start) {
			wynik.setText(""); //klakualtor wysietla pust epole
			start = false;
		}
		String wartosc = ((Button)wydarzenie.getSource()).getText();
		wynik.setText(wynik.getText()+ wartosc); // tlumaczy wartosc przycisku i wysietla ja na kalkulatorze

	}
	
	@FXML
	public void procesKalkulacji(ActionEvent wydarzenie) {
		String wartosc = ((Button)wydarzenie.getSource()).getText();
		
		if (!wartosc.equals("=")) { 
			if (!operator.isEmpty())// sprawdza czy operator nie jets pusty
				return;
			
			operator = wartosc;
			liczba1 = Long.parseLong(wynik.getText());
			wynik.setText("");
		} else {
			if (operator.isEmpty())// sparwdza czy jets pusty 
				return;
			long liczba2 = Long.parseLong(wynik.getText());
			float output = model.kalkulacje(liczba1, liczba2, operator);
			wynik.setText(String.valueOf(output));
			operator = "";
			start = true;
		}
	}
}

