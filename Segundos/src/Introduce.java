import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Introduce extends JPanel{
	
	private Segundos Principal;
	private JTextField fieldDato;
	private JLabel labSegundos;
	private JButton convertir;
	private JPanel panelSuperior, panelInferior;
	public float num;
	
	
	public Introduce ( Segundos v){
		Principal=v;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		TitledBorder border = BorderFactory.createTitledBorder("Calculadora");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		construyePanelSuperior();
		add(panelSuperior);
		
		convertir = new JButton("Convertir");
		add(convertir);
		
		AccionBoton oyenteBoton = new AccionBoton();
		convertir.addActionListener(oyenteBoton);
	}
	
	void construyePanelSuperior(){
		panelSuperior = new JPanel ();
        panelSuperior.setLayout(new GridLayout(1,2));
        
        labSegundos = new JLabel("Segundos: ");
        panelSuperior.add(labSegundos);
        
        fieldDato = new JTextField();
        panelSuperior.add(fieldDato);
	}
	
	class AccionBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String datos = fieldDato.getText();
			num = Float.parseFloat(datos);
			
		}
		
		
	}
	

}
