package caja_registradora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class Panel_persona extends JPanel implements ActionListener  {

	private GridBagConstraints c;
	private Insets in;
	
	private JLabel Jl_nombre;
	private JLabel Jl_apellido;
	private JLabel Jl_cedula;
	private JLabel Jl_edad;
	private JLabel Jl_empresa;
	private JLabel Jl_sueldo;
	private JButton Jbt_agregar;
	private JTextField Jtf_nombre;
	private JTextField Jtf_apellido;
	private JTextField Jtf_cedula;
	private JTextField Jtf_edad;
	private JTextField Jtf_empresa;
	private JTextField Jtf_sueldo;
	private VentanaInicial referenciaVentaPrincipal;
	
	public Panel_persona(VentanaInicial _referenciaVentanaPrincipal) { 
	
		referenciaVentaPrincipal=_referenciaVentanaPrincipal;
		
	setLayout(new GridBagLayout());
	Border borde1 = BorderFactory.createTitledBorder("Formulario");
	setBorder (borde1);
	
	
	Jl_nombre= new JLabel("Nombre: ");
	c = new GridBagConstraints();
	c.gridx=0;
	c.gridy=0;
    c.fill = GridBagConstraints.BOTH; 
    in = new Insets( 5, 50, 5, 50 );
    c.insets = in;	        
    add( Jl_nombre,c);
    
    
    Jtf_nombre = new JTextField();
    c = new GridBagConstraints();
    c.gridx=0;
    c.gridy=1;
    c.fill=GridBagConstraints.BOTH;
    in = new Insets(5, 10, 5, 10);
               // alto izq abajo derecha
    c.insets= in;
    add(Jtf_nombre,c);
    
    
    Jl_apellido = new JLabel("Apellido: ");
    c = new GridBagConstraints();
    c.gridx=1;
    c.gridy=0;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 50, 5, 50);
    c.insets=in;
    add(Jl_apellido,c);
    		
    
    Jtf_apellido = new JTextField();
    c = new GridBagConstraints();
    c.gridx=1;
    c.gridy=1;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 10, 5, 10);
    c.insets= in;
    add(Jtf_apellido,c);
    
    Jl_cedula = new JLabel("Cedula:   ");
    c = new GridBagConstraints();
    c.gridx=2;
    c.gridy=0;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 50, 5, 50);
    c.insets=in;
    add(Jl_cedula,c);
    		
    
    Jtf_cedula = new JTextField();
    c = new GridBagConstraints();
    c.gridx=2;
    c.gridy=1;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 10, 5, 10);
    c.insets= in;
    add(Jtf_cedula,c);
    
    Jl_edad = new JLabel("Edad:   ");
    c = new GridBagConstraints();
    c.gridx=0;
    c.gridy=3;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 50, 5, 50);
    c.insets=in;
    add(Jl_edad,c);
    		
    
    Jtf_edad = new JTextField();
    c = new GridBagConstraints();
    c.gridx=0;
    c.gridy=4;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 10, 5, 10);
    c.insets= in;
    add(Jtf_edad,c);
    
    Jl_empresa = new JLabel("Empresa: ");
    c = new GridBagConstraints();
    c.gridx=1;
    c.gridy=3;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 50, 5, 50);
    c.insets=in;
    add(Jl_empresa,c);
    		
    
    Jtf_empresa = new JTextField();
    c = new GridBagConstraints();
    c.gridx=1;
    c.gridy=4;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 10, 5, 10);
    c.insets= in;
    add(Jtf_empresa,c);
    
    Jl_sueldo = new JLabel("Sueldo: ");
    c = new GridBagConstraints();
    c.gridx=2;
    c.gridy=3;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 50, 5, 50);
    c.insets=in;
    add(Jl_sueldo,c);
    		
    
    Jtf_sueldo = new JTextField();
    c = new GridBagConstraints();
    c.gridx=2;
    c.gridy=4;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets(5, 10, 5, 10);
    c.insets= in;
    add(Jtf_sueldo,c);
    
    
    Jbt_agregar = new JButton("Agregar");
    Jbt_agregar.addActionListener(this);
    Jbt_agregar.setActionCommand("a");
    c=new GridBagConstraints();
    c.gridx=1;
    c.gridy=5;
    c.fill = GridBagConstraints.BOTH;
    in = new Insets( 5, 10, 5, 10 );
    c.insets = in;
    add(Jbt_agregar,c);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Hola ...");
		referenciaVentaPrincipal.agregarPersona(Jtf_nombre.getText(), Jtf_apellido.getText(),Integer.parseInt(Jtf_cedula.getText()),Integer.parseInt(Jtf_edad.getText()),Jtf_empresa.getText(),Integer.parseInt(Jtf_sueldo.getText()));
		JOptionPane.showMessageDialog(null,"Persona agregada. ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	

}
