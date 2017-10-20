package caja_registradora;

import java.awt.*;
import javax.swing.*;


public class Panel_nombre extends JPanel{
	
	private JLabel texto;
	
	public Panel_nombre() {
		setLayout( new BorderLayout( ) );  // organiza en el tipo de orientacion que quiero ""BorderLayout""
        
		texto = new JLabel("ELECTRODOMESTICOS UDEC");
        JLabel imagen = new JLabel( );//carga una imagen 
        ImageIcon icono = new ImageIcon( "img/caja registradora.jpg" ); //icono aloja la imagen   
        
        imagen.setIcon( icono );//asignar icono 
        //Define el icono que mostrará este componente.
        
        texto.setHorizontalAlignment(JLabel.CENTER);
        imagen.setHorizontalAlignment( JLabel.LEFT );   //lo ubica
        //Establece la alineación del contenido de la etiqueta a lo largo del eje X.
 
        add( imagen, BorderLayout.WEST );
        add(texto, BorderLayout.CENTER);
        //ubicacion de mi imagen dentro del panel
        
        setBackground( Color.WHITE );

	}

}
