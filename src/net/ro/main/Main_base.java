package net.ro.main;

import java.awt.Dimension;

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
	
	public JTextField num_uno;
	
	public JButton sum;
	public JButton res;
	public JButton mul;
	public JButton div;
	
	public JTextField num_dos;
	
	JLabel debug;
	
	private final Dimension dim = new Dimension(50, 50);
	
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
        
        input = new JTextField("0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F");
        
        input.setLocation(10, 50);
        input.setSize(500, 25);
        
        // Base de salida
        
        txt_ = new JLabel("Introducide los caracteres que utiliza la otra base:");
        
        txt_.setLocation(10, 100);
        txt_.setSize(500, 25);
        
        input_ = new JTextField("0,1,2,3,4,5,6,7,8,9");
        
        input_.setLocation(10, 140);
        input_.setSize(500, 25);
        
        input_.setEnabled(false);
        
        // Primer numero
        
        num_uno = new JTextField();
        
        num_uno.setLocation(10, 180);
        num_uno.setSize(250, 25);
        
        // Segundo numero
        
        num_dos = new JTextField();

        num_dos.setLocation(505, 180);
        num_dos.setSize(250, 25);
        
        // Botones
        
        sum = new JButton("+");
        
        sum.setLocation(275, 180);
        sum.setSize(dim);
        
        sum.setEnabled(false);
        
        res = new JButton("-");
        
        res.setLocation(330, 180);
        res.setSize(dim);
        
        mul = new JButton("*");
        
        mul.setLocation(385, 180);
        mul.setSize(dim);

        div = new JButton("/");
        
        div.setLocation(440, 180);
        div.setSize(dim);
        
        // Debug para que se puedan ver bien los JTextFields
        
        debug = new JLabel();
        
        ventana.add(txt);
        ventana.add(input);

        ventana.add(txt_);
        ventana.add(input_);
        
        ventana.add(num_uno);
        ventana.add(num_dos);

        ventana.add(sum);
        ventana.add(res);
        ventana.add(mul);
        ventana.add(div);
        
        ventana.add(debug);
        
        ventana.setVisible(true);
    }
}
