package caja_registradora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;

import javax.swing.*;
import javax.swing.border.Border;

public class Panel_men extends JPanel  implements ActionListener{
	
	
	private GridBagConstraints c;
	private Insets in;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8;
	
	
	
	Panel_persona obj_Panelper;
	VentanaInicial ventana;
	Lista_clientes lista;
	Panel_vis Panel_vis;
	

	
	public Panel_men() {
		
		
		setLayout(new GridBagLayout());
		Border borde1 = BorderFactory.createTitledBorder("Menu");
		//setBorder (borde1);
		
		b1 = new JButton("Agregar productos");
		b1.addActionListener(this);
        //b1.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b1,c);
		
        b2 = new JButton("Ver listado inventario");
        b2.addActionListener(this);
        b2.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=1;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b2,c);
		
        b3 = new JButton("Alerta de inventario");
        b3.addActionListener(this);
        b3.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=2;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b3,c);
		
        b4 = new JButton("Registrar Cliente");
        b4.addActionListener(this);
        b4.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=3;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b4,c);
		
        b5 = new JButton("Lista de clientes");
        b5.addActionListener(this);
        b5.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=4;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b5,c);
		
        b6 = new JButton("Mejores Clientes");
        b6.addActionListener(this);
        b6.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=5;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b6,c);
		
        b7 = new JButton("Iniciar compra");
        b7.addActionListener(this);
        b7.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=6;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b7,c);
		
        b8 = new JButton("Eliminar Compra");
        b8.addActionListener(this);
        b8.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=7;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b8,c);
		
        System.out.println("hola3456");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0){
		if(arg0.getSource()==b1);
		if(arg0.getSource()==b2);
		if(arg0.getSource()==b3);
		if(arg0.getSource()==b4) {
			

			
			//obj_Panelper = new Panel_persona(this);
			ventana = new VentanaInicial();
			ventana.getContentPane().add(obj_Panelper, BorderLayout.CENTER);
			ventana.setVisible(true); 
			
			
			
		}
				
		
		if(arg0.getSource()==b5) {
			
			lista = new Lista_clientes();
			ventana = new VentanaInicial();
			ventana.getContentPane().add(lista, BorderLayout.CENTER);
			ventana.obj_Panelvis.setVisible(false);
			ventana.setVisible(true);
			
			
			/*ventana = new VentanaInicial();
			ventana.remove(Panel_vis);
			ventana.obj_Lista_clientes.add(lista, BorderLayout.CENTER);
			*/
			
			
			 
			  
			
		}
		if(arg0.getSource()==b6);
		if(arg0.getSource()==b7);
		if(arg0.getSource()==b8) { 
			System.out.println("hola");
			
		}
		
	}
	
	

}
