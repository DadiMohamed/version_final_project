package metier;

import java.util.Date;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

public class VerificationDonnees {
	
public  void acceptDate(Date d1 , Date d2){
		
		if( (d1.after(d2) )|| (d1.equals(d2))){
			
			JOptionPane.showMessageDialog( null, "la date de debut doit etre inferieur a la date du fin ", "Erreur",
			        JOptionPane.ERROR_MESSAGE);
	}
}

public void acceptChamp(String s){
	
		if(s.isEmpty()){
			
			JOptionPane.showMessageDialog( null, "il y a un champs vide  !! ", "Erreur",
			        JOptionPane.ERROR_MESSAGE);
		}
		else if( ! s.matches("(\\w|\\s)+")){
			
			JOptionPane.showMessageDialog( null, " enlever les characteres contenant les accents   !! ", "Erreur",
			        JOptionPane.ERROR_MESSAGE);
		}
	
}


public void acceptValeure(String s){
	
	
	if(s.isEmpty() ){
		
		JOptionPane.showMessageDialog( null, " il y a un champs vide!! ", "Erreur",
		        JOptionPane.ERROR_MESSAGE);
	}else if( ! s.matches("([0-9]+)([.,][0-9]{1,3})?")){
		
		JOptionPane.showMessageDialog( null, "champs valeure incorrecte!! max 3 chiffres aprèe la virgule ", "Erreur",
		        JOptionPane.ERROR_MESSAGE);
	
		
		
	}

}

}
