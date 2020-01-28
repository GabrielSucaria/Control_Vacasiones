import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombre = "";

  public Licencia(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Licencia de uso");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida ventanaBienvenida = new Bienvenida();
   nombre = ventanaBienvenida.texto;

   label1 = new JLabel("TERMINOS Y CONDICIONES");
   label1.setBounds(215,5,200,30);
   label1.setFont(new Font("Andale Mono", 1, 14));
   label1.setForeground(new Color(0, 0, 0));
   add(label1);

   textarea1 = new JTextArea();
   textarea1.setEditable(false);
   textarea1.setText("\n\n          TERMINOS Y CONDICIONES" +
                       "\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE CARLOS GABRIEL SUCARIA." +
                       "\n\n          B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE." +
                       "\n\n          C. CARLOS GABRIEL SUCARIA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                       "\n          LOS ACUERDOS LEGALES PREVIAMENTE EXPUESTOS RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE." +
                       "\n          SI USTED ACEPTA ESTOS TERMINOS Y CONDICIONES, HAGA CLIC EN (ACEPTO). DE LO CONTRARIO" +
                       "\n          HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE. " +
                       "\n\n          PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, CONTACTESE : " +
                       "\n          EMAIL: gabriel122010@gmail.com   TEL. +543513112460");
   scrollpane1= new JScrollPane(textarea1);
   scrollpane1.setBounds(10,40,680,245);
   add(scrollpane1);

   check1 = new JCheckBox("Yo " + nombre + " Acepto");
   check1.setBounds(10,300,300,30);
   check1.addChangeListener(this);
   add(check1);

   boton1 = new JButton("Continuar");
   boton1.setEnabled(false);
   boton1.setBounds(10,340,100,30);
   boton1.addActionListener(this);
   add(boton1);

   boton2 = new JButton("No Acepto");
   boton2.setEnabled(true);
   boton2.setBounds(120,340,100,30);
   boton2.addActionListener(this);
   add(boton2);

   ImageIcon imagen = new ImageIcon("images/coca-cola.png");
   label2 = new JLabel(imagen);
   label2.setBounds(315,185,300,300);
   add(label2);   
 }

  public void stateChanged(ChangeEvent e){
   if(check1.isSelected() == true){
    boton1.setEnabled(true);
    boton2.setEnabled(false);
  }else{
    boton1.setEnabled(false);
    boton2.setEnabled(true);
  }
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == boton1){
   Principal vprincipal = new Principal();
   vprincipal.setBounds(0,0,640,535);
   vprincipal.setVisible(true);
   vprincipal.setResizable(false);
   vprincipal.setLocationRelativeTo(null);
   this.setVisible(false);
  }
   if(e.getSource() == boton2){
   Bienvenida interfaz1 = new Bienvenida();
   interfaz1.setBounds(0,0,350,450);
   interfaz1.setVisible(true);
   interfaz1.setLocationRelativeTo(null);
   interfaz1.setResizable(false);
   this.setVisible(false);
  }
 }

  public static void main(String args[]){
   Licencia vlicencia = new Licencia();
   vlicencia.setBounds(0,0,700,460);
   vlicencia.setVisible(true);
   vlicencia.setResizable(false);
   vlicencia.setLocationRelativeTo(null); 
 }
} 