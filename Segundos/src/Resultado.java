import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Resultado extends JPanel{

	private Segundos Principal;
	private float dias, horas, minutos, segundos;
	private JLabel lDia, lHora, lMinuto, lSegundo;
	
	Introduce intro = new Introduce(Principal);
	private float num = intro.num;
	
	public Resultado ( Segundos v){
		Principal=v;
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		TitledBorder border = BorderFactory.createTitledBorder("Resultado");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		lDia = new JLabel("Días: "+dias);
        add(lDia);
        lHora = new JLabel("Horas: "+horas);
        add(lHora);
        lMinuto = new JLabel("Minutos: "+minutos);
        add(lMinuto);
        lSegundo = new JLabel("Segundos: "+segundos);
        add(lSegundo);
				
	}
}
