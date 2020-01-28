import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField jtextfield1;
  private JLabel jlabel1, jlabel2, jlabel3, jlabel4;
  private JButton jbutton1;
  public static String texto = "";


  public Bienvenida(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Bienvenido");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  
   ImageIcon imagen = new ImageIcon("images/logo-coca.png"); 
   jlabel1 = new JLabel(imagen); 
   jlabel1.setBounds(25,15,300,150);
   add(jlabel1);

   jlabel2 = new JLabel("Sistema de Control Vacacional");
   jlabel2.setBounds(35,135,300,30);
   jlabel2.setFont(new Font("Andale Mono", 3, 18));
   jlabel2.setForeground(new Color(255,255,255));
   add(jlabel2);

   jlabel3 = new JLabel("Ingrese su nombre");
   jlabel3.setBounds(45,212,200,30);
   jlabel3.setFont(new Font("Andale Mono", 1, 12));
   jlabel3.setForeground(new Color(255,255,255));
   add(jlabel3);

   jlabel4 = new JLabel("2017 The Coca-Cola Company");
   jlabel4.setBounds(85,375,300,30);
   jlabel4.setFont(new Font("Andale Mono", 1, 12));
   jlabel4.setForeground(new Color(255,255,255));
   add(jlabel4);

   jtextfield1 = new JTextField();
   jtextfield1.setBounds(45,240,255,25);
   jtextfield1.setBackground(new Color(255,255,255));
   jtextfield1.setFont(new Font("Andale Mono", 1, 12));
   jtextfield1.setForeground(new Color(255,0,0));
   add(jtextfield1);

   jbutton1 = new JButton("Ingresar");
   jbutton1.setBounds(125,280,100,30);
   jbutton1.setBackground(new Color(255,255,255));
   jbutton1.setFont(new Font("Andale Mono", 1, 14));
   jbutton1.setForeground(new Color(255,0,0));
   jbutton1.addActionListener(this);
   add(jbutton1);
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == jbutton1){
    texto = jtextfield1.getText().trim();
    if(texto.equals("")){
     JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");  
   } else {
     Licencia vlicencia = new Licencia();
     vlicencia.setBounds(0,0,700,460);
     vlicencia.setVisible(true);
     vlicencia.setResizable(false);
     vlicencia.setLocationRelativeTo(null); 
     this.setVisible(false);
   }
  }
 }

  public static void main(String args[]){
   Bienvenida interfaz1 = new Bienvenida();
   interfaz1.setBounds(0,0,350,450);
   interfaz1.setVisible(true);
   interfaz1.setLocationRelativeTo(null);
   interfaz1.setResizable(false);
 }
}

