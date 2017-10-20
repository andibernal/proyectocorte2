package caja_registradora;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Panel_con extends JPanel implements ActionListener {
	
	private GridBagConstraints c;
	private Insets in;
	private JButton b1,b2;
	
	public Panel_con() {
		setLayout(new GridBagLayout());
		Border borde1 = BorderFactory.createTitledBorder("Consultar");
		setBorder (borde1);
		
		b1 = new JButton("Consultar mejor cliente");
		b1.addActionListener(this);
        //b1.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=0;
		c.gridy=0;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b1,c);
		
        b2 = new JButton("Consultar ganancias de las compras");
        b2.addActionListener(this);
        b2.setActionCommand("a");
		c = new GridBagConstraints();
		c.gridx=1;
		c.gridy=0;
        c.fill = GridBagConstraints.BOTH; 
        in = new Insets( 5, 10, 5, 10 );
        c.insets = in;	        
        add( b2,c);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==b1);
		if(arg0.getSource()==b2);
		
	}

}
