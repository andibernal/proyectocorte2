package caja_registradora;

import java.awt.*;
import java.util.*;
import javax.swing.*;


public class VentanaInicial extends JFrame{
	public LinkedHashMap listaPersona;
	
	
    
	Panel_vis obj_Panelvis;
	Panel_men obj_Panelmen;
	Panel_con obj_Panelcon;
	Panel_nombre obj_Panelnombre;
	Panel_persona obj_Panelper;
	Lista_clientes Listac;
	
	public VentanaInicial() {
		super("Caja Registradora");
		listaPersona = new LinkedHashMap();
		inicio();
		componente();
		pack();
		setLocationRelativeTo( null );
	}
	
	public VentanaInicial inicio(){
		Dimension dims = new Dimension(800, 600);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane( ).setLayout( new BorderLayout( ) );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return this;
	}
	
	public void componente() {
		
		//obj_Panelper = new Panel_persona(this);
		//add(obj_Panelper, BorderLayout.CENTER);
		
		obj_Panelnombre = new Panel_nombre();
		add(obj_Panelnombre, BorderLayout.NORTH);
		
		obj_Panelmen = new Panel_men();
		add(obj_Panelmen, BorderLayout.WEST);
		
		obj_Panelvis = new Panel_vis();
		add(obj_Panelvis, BorderLayout.CENTER);
		
		obj_Panelcon = new Panel_con();
		add(obj_Panelcon, BorderLayout.SOUTH);
		
		
		
	}
	
	public void repintar () {
		  
		
	   	//obj_Panelvis.add(this.obj_Panelper);
	   	add(obj_Panelper, BorderLayout.CENTER);  
		
	}
	
	/*public void  agregarPersona(String _nombre, String _apellido) {//_referenciapersona     , int _cedula, int _edad, String _empresa, int _sueldo
		Personas obj = new Personas(_nombre,_apellido);   //,_cedula,_edad,_empresa,_sueldo
		listaPersona.put(_nombre, obj);
		//actualizarTabla();
	}
	
	public void actualizarTabla() {
		
		Listac.refrescarLista(listaPersona);
		JOptionPane.showMessageDialog(null,"Lista actuallizada. ","Mens",JOptionPane.INFORMATION_MESSAGE);
	}*/

	
}
