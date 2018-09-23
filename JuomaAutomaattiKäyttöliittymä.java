import java.util.Scanner;
import javax.swing.JOptionPane;

public class JuomaAutomaattiKäyttöliittymä {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String vastaus = null;
		
		do {
			vastaus = JOptionPane.showInputDialog(null,
				"*******Juoma-Automaatti*******\n"+
				"1. Kahvi\n2.Tee\n3.Kaakao\n4.Lopeta",
				JOptionPane.QUESTION_MESSAGE);
			if (vastaus == "1") {
				JuomaAutomaatti tilattuKahvi = new JuomaAutomaatti();
				tilattuKahvi.valmistaKahvi();
				
				JOptionPane.showMessageDialog(null, tilattuKahvi.toString());
			}
			if (vastaus == "2") {
				JuomaAutomaatti tilattuTee = new JuomaAutomaatti();
				tilattuTee.valmistaTee();
				
				JOptionPane.showMessageDialog(null, tilattuTee.toString());
			}
			if (vastaus == "3") {
				JuomaAutomaatti tilattuKaakao = new JuomaAutomaatti();
				tilattuKaakao.valmistaKaakao();
				
				JOptionPane.showMessageDialog(null, tilattuKaakao.toString());
			}
		} while (vastaus == "4");
	}

}
