import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Segundos extends JFrame{
	
	private Introduce introduce;
	private Resultado resultado;
	
	public Segundos(){
		setTitle("Convertir");
		setSize(300,197);
		setLayout (new BorderLayout());
		
		introduce = new Introduce(null);
		add(introduce, BorderLayout.NORTH);
		
		resultado = new Resultado(null);
		add(resultado, BorderLayout.SOUTH);
		
		
	}

	public static void main(String[] args) throws Exception{
		Segundos Vent = new Segundos();
		Vent.setVisible(true);
	}

}
