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
	
	JLabel txt_uno;
	public JTextField num_uno;
	
	public JButton sum;
	public JButton res;
	public JButton mul;
	public JButton div;
	
	CambioModo c;
	
	JButton[] botones = new JButton[4];
	public int modo = 0;
	
	JButton calcular;
	
	JLabel txt_dos;
	public JTextField num_dos;
	
	public JTextField num_out;
	
	JLabel txt_cam;
	public JTextField cambio;
	JButton cambio_btn;
	
	private JLabel debug;
	
	private final Dimension dim = new Dimension(50, 50);
	
	// TODO añadir JLabels y más inputs y outputs
	
    void init_ventana()
    {
        ventana = new JFrame("Base changer calculator");
        
        ventana.setAlwaysOnTop(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setSize(1280, 720);
        
        // Base de entrada
        
        txt = new JLabel("Introduce los caracteres que utiliza tu base:");
        
        txt.setLocation(10, 10);
        txt.setSize(500, 25);
        
        input = new JTextField("0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F");
        
        input.setLocation(10, 50);
        input.setSize(500, 25);
        
        // Base de salida
        
        txt_ = new JLabel("Introduce los caracteres que utiliza la otra base:");
        
        txt_.setLocation(10, 100);
        txt_.setSize(500, 25);
        
        input_ = new JTextField("0,1,2,3,4,5,6,7,8,9");
        
        input_.setLocation(10, 140);
        input_.setSize(500, 25);
        
        input_.setEnabled(false);
        
        // Primer numero y su texto
        
        num_uno = new JTextField("1");
        
        num_uno.setLocation(10, 205);
        num_uno.setSize(250, 25);
        
        txt_uno = new JLabel("Introduce el primer número:");
        
        txt_uno.setLocation(10, 180);
        txt_uno.setSize(250, 25);
        
        // Segundo numero y su texto
        
        num_dos = new JTextField("1");

        num_dos.setLocation(505, 205);
        num_dos.setSize(250, 25);

        txt_dos = new JLabel("Introduce el segundo número:");
        
        txt_dos.setLocation(505, 180);
        txt_dos.setSize(250, 25);
        // Botones
        
        sum = new JButton("+");
        
        sum.setLocation(275, 180);
        sum.setSize(dim);
        sum.setName("0");
        
        res = new JButton("-");
        
        res.setLocation(330, 180);
        res.setSize(dim);
        res.setName("1");
        
        mul = new JButton("*");
        
        mul.setLocation(385, 180);
        mul.setSize(dim);
        mul.setName("2");
        
        div = new JButton("/");
        
        div.setLocation(440, 180);
        div.setSize(dim);
        div.setName("3");

        botones[0] = sum;
        botones[1] = res;
        botones[2] = mul;
        botones[3] = div;
        
        // Acabar con los botones
        
        c = new CambioModo(this);
        
        for (int i = 0; i < botones.length; i++)
    	{
    		botones[i].addActionListener(c);
    	}
        
        // Botón calcular
        
        calcular = new JButton("Calcular");
        
        calcular.setLocation(780, 180);
        calcular.setSize(100, 50);
        
        // Resultado de la cuenta
        
        num_out = new JTextField("2");
        
        num_out.setLocation(10, 250);
        num_out.setSize(555, 25);
        num_out.setEnabled(false);
        
        // Cambio de numeros entre bases
        
        txt_cam = new JLabel("Introduce un numero que quieras cambiar de base:");
        
        txt_cam.setLocation(10, 325);
        txt_cam.setSize(300, 25);
        
        cambio = new JTextField("0");
        
        cambio.setLocation(10, 350);
        cambio.setSize(290, 25);
        
        cambio_btn = new JButton("Cambiar base dle numero introducido:");
        
        cambio_btn.setLocation(310, 325);
        cambio_btn.setSize(250, 50);
        
        // Debug para que se puedan ver bien los JTextFields
        
        debug = new JLabel();
        
        ventana.add(txt);
        ventana.add(input);

        ventana.add(txt_);
        ventana.add(input_);
        
        ventana.add(num_uno);
        ventana.add(num_dos);
        
        ventana.add(txt_uno);
        ventana.add(txt_dos);

        ventana.add(sum);
        ventana.add(res);
        ventana.add(mul);
        ventana.add(div);
        
        ventana.add(calcular);
        
        ventana.add(num_out);
        
        ventana.add(txt_cam);
        ventana.add(cambio);
        ventana.add(cambio_btn);
        
        ventana.add(debug);
        
        desactivar(modo);
        
        ventana.setVisible(true);
    }
    
    public void desactivar(int _s)
    {
    	for (int i = 0; i < botones.length; i++)
    	{
    		botones[i].setEnabled(true);
    	}
    	botones[_s].setEnabled(false);
    	
    	modo = _s;
    }
}
