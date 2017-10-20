package caja_registradora;

import java.awt.*;
import java.util.ArrayList;
import java.util.*;
import javax.swing.*;


public class VentanaInicial extends JFrame{
	public LinkedHashMap listaPersona;
	
    
	Panel_vis obj_Panelvis;
	Panel_men obj_Panelmen;
	Panel_con obj_Panelcon;
	Panel_nombre obj_Panelnombre;
	Panel_persona obj_Panelper;
	Lista_clientes obj_Lista_clientes;
	Lista_clientes Listac;
	
	public VentanaInicial() {
		super("Caja Registradora");
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
		
		obj_Panelnombre = new Panel_nombre();
		add(obj_Panelnombre, BorderLayout.NORTH);
		
		obj_Panelmen = new Panel_men();
		add(obj_Panelmen, BorderLayout.WEST);
		
		obj_Panelvis = new Panel_vis();
		add(obj_Panelvis, BorderLayout.CENTER);
		
		//obj_Panelper = new Panel_persona(this);
		//add(obj_Panelper, BorderLayout.EAST);
		
		obj_Panelcon = new Panel_con();
		add(obj_Panelcon, BorderLayout.SOUTH);
		
		
		
	}
	
	public void repintar () {
		  
		  //VentanaInicial.remove(obj_Panelvis);
		  //VentanaInicial.add(Lista_clientes, BorderLayout.CENTER);
	      //VentanaInicial.repintar();
		
	   	  obj_Panelvis.add(this.obj_Panelper);
			
	}
	
	public void  agregarPersona(String _nombre, String _apellido, int _cedula, int _edad, String _empresa, int _sueldo) {//_referenciapersona
		Personas obj = new Personas(_nombre,_apellido,_cedula,_edad,_empresa,_sueldo);
		listaPersona.put(_nombre,obj);
		actualizarTabla();
	}
	public void actualizarTabla() {
		
		obj_Lista_clientes.refrescarLista(listaPersona);
		
	}

	
}
