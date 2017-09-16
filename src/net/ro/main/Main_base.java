package net.ro.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main_base
{
	JFrame ventana;
	
    void init_ventana()
    {
        ventana = new JFrame("Ez profit calculator");
        
        ventana.setAlwaysOnTop(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setSize(1280, 720);
        
        // Introducir aquí todo lo que vaya dentro de la ventana
        
        ventana.setVisible(true);
    }
}
