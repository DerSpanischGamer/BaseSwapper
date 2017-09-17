package net.ro.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main_base
{
	JFrame ventana;
	
	JLabel txt;
	public JTextField input;
	
	JLabel txt_;
	public JTextField input_;
	
	JLabel debug;
	
    void init_ventana()
    {
        ventana = new JFrame("Base changer calculator");
        
        ventana.setAlwaysOnTop(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setSize(1280, 720);
        
        // Base de entrada
        
        txt = new JLabel("Introducide los caracteres que utiliza tu base:");
        
        txt.setLocation(10, 10);
        txt.setSize(500, 25);
        
        input = new JTextField("0,1,2,3,4,5,6,7,8,9");
        
        input.setLocation(10, 50);
        input.setSize(500, 25);
        
        // Base de salida
        
        txt_ = new JLabel("Introducide los caracteres que utiliza la otra base:");
        
        txt_.setLocation(10, 100);
        txt_.setSize(500, 25);
        
        input_ = new JTextField("0,1,2,3,4,5,6,7,8,9");
        
        input_.setLocation(10, 140);
        input_.setSize(500, 25);
        
        // Debug para que se puedan ver bien los JTextFields
        
        debug = new JLabel();
        
        ventana.add(txt);
        ventana.add(input);

        ventana.add(txt_);
        ventana.add(input_);
        
        ventana.add(debug);
        
        ventana.setVisible(true);
    }
}
