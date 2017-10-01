package net.ro.main;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main_base
{
	private JFrame ventana;
	
	private JLabel txt;
	public JTextField input;
	
	private JLabel txt_;
	public JTextField input_;
	
	private JLabel txt_uno;
	public JTextField num_uno;
	
	public JButton sum;
	public JButton res;
	public JButton mul;
	public JButton div;
	
	private CambioModo c;
	
	private JButton[] botones = new JButton[4];
	public int modo = 0;
	
	private JButton calcular;
	
	private JLabel txt_dos;
	public JTextField num_dos;
	
	public JTextField num_out;
	
	private MandarDatos m;
	
	private JLabel txt_cam;
	public JTextField cambio;
	private JButton cambio_btn;
	
	private JLabel txt_out;
	private JTextField cambio_out;
	private int base = 10;
	
	private JLabel ro;
	
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
        
        input = new JTextField("0,1,2,3,4,5,6,7,8,9,A,B");
        
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
        
        m = new MandarDatos(this);
        
        calcular = new JButton("Calcular");
        
        calcular.setLocation(780, 180);
        calcular.setSize(100, 50);
        
        calcular.setName("0");
        
        calcular.addActionListener(m);
        
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
        
        cambio_btn = new JButton("Cambiar base del numero introducido");
        
        cambio_btn.setLocation(310, 325);
        cambio_btn.setSize(250, 50);

        cambio_btn.setName("1");
        
        cambio_btn.addActionListener(m);
        
        // Salida entre cambio de bases
        
        txt_out = new JLabel("Tu número en base " + base + " es:");
        
        txt_out.setLocation(570, 325);
        txt_out.setSize(300, 25);
        
        cambio_out = new JTextField("0");
        
        cambio_out.setLocation(570, 350);
        cambio_out.setSize(300, 25);
        
        cambio_out.setEnabled(false);
        
        // RO ;P
        
        ro = new JLabel("RO ;P - 2017");
        
        ro.setLocation(1200, 670);
        ro.setSize(80, 25);
        
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
        
        ventana.add(txt_out);
        ventana.add(cambio_out);
        
        ventana.add(ro);
        
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
    
    public void cambiarBase(int _b)
    {
    	base = _b;
    	
    	txt_out.setText("Tu número en base " + base + " es:");
    }
}
