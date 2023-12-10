package app_cliente;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MostrarGraficaCentroCliente extends JFrame {

	
	 private ClientePrincipal principal;
	 
	 public MostrarGraficaCentroCliente(ClientePrincipal p_principal) {
		 principal = p_principal;
		 setTitle("Grafica Disponibilidad");
		 setResizable( false );
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 //setSize(screenSize.width, screenSize.height-50);
		 setSize(1350,710);
		 setLayout(new BorderLayout());
		 
		 
		 JPanel panel_centro = new GraficaCentroCliente(principal);
		 add(panel_centro, BorderLayout.CENTER); 
		 
	 }
}
