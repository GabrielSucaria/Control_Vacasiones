import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

  private JMenuBar jmenubar;
  private JMenu menuopciones, menucalcular,menuacercade,menucolor;
  private JMenuItem micalculo,mirojo,minegro,mimorado,micreador,misalir,minuevo;
  private JLabel labellogo,labelbienvenido,labeltitle,labelnombre,labelpaterno,labelmaterno,
          labeldepartamento,labelantiguedad,labelresultado,labelfooter;
  private JTextField textnombretrabajador,textpaternotrabajador,textmaternotrabajador;
  private JComboBox combodepartamento, comboantiguedad;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String texto2 = "";

  public Principal(){

   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Pantalla principal");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
 
   Bienvenida vbienvenida2 = new Bienvenida();
   texto2 = vbienvenida2.texto;

   jmenubar = new JMenuBar();
   jmenubar.setBackground(new Color(255, 0, 0));
   setJMenuBar(jmenubar);

   menuopciones = new JMenu("Opciones");
   menuopciones.setBackground(new Color(255, 0, 0));
   menuopciones.setFont(new Font("Andale Mono", 1, 14));
   menuopciones.setForeground(new Color(255, 255, 255));
   jmenubar.add(menuopciones);

   menucalcular = new JMenu("Calcular");
   menucalcular.setBackground(new Color(255, 0, 0));
   menucalcular.setFont(new Font("Andale Mono", 1, 14));
   menucalcular.setForeground(new Color(255, 255, 255));
   jmenubar.add(menucalcular);

   menuacercade = new JMenu("Acerca de");
   menuacercade.setBackground(new Color(255, 0, 0));
   menuacercade.setFont(new Font("Andale Mono", 1, 14));
   menuacercade.setForeground(new Color(255, 255, 255));
   jmenubar.add(menuacercade);

   menucolor = new JMenu("Color de fondo");
   menucolor.setFont(new Font("Andale Mono", 1, 14));
   menucolor.setForeground(new Color(255, 0, 0));
   menuopciones.add(menucolor);

   micalculo = new JMenuItem("Vacaciones");
   micalculo.setFont(new Font("Andale Mono", 1, 14));
   micalculo.setForeground(new Color(255, 0, 0));
   menucalcular.add(micalculo);
   micalculo.addActionListener(this);

   mirojo = new JMenuItem("Rojo");
   mirojo.setFont(new Font("Andale Mono", 1, 14));
   mirojo.setForeground(new Color(255, 0 , 0));
   menucolor.add(mirojo);
   mirojo.addActionListener(this);

   minegro = new JMenuItem("Negro");
   minegro.setFont(new Font("Andale Mono", 1, 14));
   minegro.setForeground(new Color(255, 0, 0));
   menucolor.add(minegro);
   minegro.addActionListener(this);

   mimorado = new JMenuItem("Morado");
   mimorado.setFont(new Font("Andale Mono", 1, 14));
   mimorado.setForeground(new Color(255, 0, 0));
   menucolor.add(mimorado);
   mimorado.addActionListener(this);

   minuevo = new JMenuItem("Nuevo");
   minuevo.setFont(new Font("Andale Mono", 1, 14));
   minuevo.setForeground(new Color(255, 0, 0));
   menuopciones.add(minuevo);
   minuevo.addActionListener(this);

   micreador = new JMenuItem("El creador");
   micreador.setFont(new Font("Andale Mono", 1, 14));
   micreador.setForeground(new Color(255, 0, 0));
   menuacercade.add(micreador);
   micreador.addActionListener(this);

   misalir = new JMenuItem("Salir");
   misalir.setFont(new Font("Andale Mono", 1, 14));
   misalir.setForeground(new Color(255, 0, 0));
   menuopciones.add(misalir);
   misalir.addActionListener(this);
   
   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   labellogo = new JLabel(imagen);
   labellogo.setBounds(5,5,250,100);
   add(labellogo);

  labelbienvenido = new JLabel("Bienvenido " + texto2);
  labelbienvenido.setBounds(280,30,300,50);
  labelbienvenido.setFont(new Font("Andale Mono", 1, 32));
  labelbienvenido.setForeground(new Color(255,255,255));
  add(labelbienvenido);

  labeltitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
  labeltitle.setBounds(45,140,900,25);
  labeltitle.setFont(new Font("Andale Mono", 0, 24));
  labeltitle.setForeground(new Color(255,255,255));
  add(labeltitle);

  labelnombre = new JLabel("Nombre completo");
  labelnombre.setBounds(25,188,180,25);
  labelnombre.setFont(new Font("Andale Mono", 1, 12));
  labelnombre.setForeground(new Color(255,255,255));
  add(labelnombre);
  
  textnombretrabajador = new JTextField();
  textnombretrabajador.setBounds(25,213,150,25);
  textnombretrabajador.setBackground(new java.awt.Color(224, 224, 224));
  textnombretrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
  textnombretrabajador.setForeground(new java.awt.Color(255, 0, 0));
  add(textnombretrabajador);

  labelpaterno = new JLabel("Apellido Paterno");
  labelpaterno.setBounds(25,248,180,25);
  labelpaterno.setFont(new Font("Andale Mono", 1, 12));
  labelpaterno.setForeground(new Color(255,255,255));
  add(labelpaterno);
  
  textpaternotrabajador = new JTextField();
  textpaternotrabajador.setBounds(25,273,150,25);
  textpaternotrabajador.setBackground(new java.awt.Color(224, 224, 224));
  textpaternotrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
  textpaternotrabajador.setForeground(new java.awt.Color(255, 0, 0));
  add(textpaternotrabajador);


  labelmaterno = new JLabel("Apellido Materno");
  labelmaterno.setBounds(25,308,180,25);
  labelmaterno.setFont(new Font("Andale Mono", 1, 12));
  labelmaterno.setForeground(new Color(255,255,255));
  add(labelmaterno);
  
  textmaternotrabajador = new JTextField();
  textmaternotrabajador.setBounds(25,334,150,25);
  textmaternotrabajador.setBackground(new java.awt.Color(224, 224, 224));
  textmaternotrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
  textmaternotrabajador.setForeground(new java.awt.Color(255, 0, 0));
  add(textmaternotrabajador);

  labelmaterno = new JLabel("Selecciona el Departamento");
  labelmaterno.setBounds(220,188,180,25);
  labelmaterno.setFont(new Font("Andale Mono", 1, 12));
  labelmaterno.setForeground(new Color(255,255,255));
  add(labelmaterno);
  
  combodepartamento = new JComboBox();
  combodepartamento.setBounds(220,213,220,25);
  combodepartamento.setBackground(new java.awt.Color(224, 224, 224));
  combodepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
  combodepartamento.setForeground(new java.awt.Color(255, 0, 0));
  add(combodepartamento);
  combodepartamento.addItem("");
  combodepartamento.addItem("Atencion al Cliente");
  combodepartamento.addItem("Departamento de Logistica");
  combodepartamento.addItem("Departamento de Gerencia");


  labelantiguedad = new JLabel("Selecciona la Antiguedad");
  labelantiguedad.setBounds(220,248,180,25);
  labelantiguedad.setFont(new Font("Andale Mono", 1, 12));
  labelantiguedad.setForeground(new Color(255, 255, 255));
  add(labelantiguedad);
  
  comboantiguedad = new JComboBox();
  comboantiguedad.setBounds(220,273,220,25);
  comboantiguedad.setBackground(new java.awt.Color(224, 224, 224));
  comboantiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
  comboantiguedad.setForeground(new java.awt.Color(255, 0, 0));
  add(comboantiguedad);
  comboantiguedad.addItem("");
  comboantiguedad.addItem("1 temporada de servicio");
  comboantiguedad.addItem("2 a 6 temporadas de servicio");
  comboantiguedad.addItem("7 temporadas o mas de servicio");

  labelresultado = new JLabel("Resultado del Calculo");
  labelresultado.setBounds(220,307,180,25);
  labelresultado.setFont(new Font("Andale Mono", 1, 12));
  labelresultado.setForeground(new Color(255, 255, 255));
  add(labelresultado);
  
  textarea1 = new JTextArea();
  textarea1.setEditable(false);
  textarea1.setBackground(new java.awt.Color(224, 224, 224));
  textarea1.setFont(new java.awt.Font("Andale Mono", 1, 11));
  textarea1.setForeground(new java.awt.Color(255, 0, 0));
  textarea1.setText("\n     Aqui aparece el resultado del calculo de las vacaciones.");
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(200,333,385,90);
  add(scrollpane1);

  labelfooter = new JLabel("2020 The Coca-Cola Company | Todos los derechos reservados");
  labelfooter.setBounds(135,445,500,30);
  labelfooter.setFont(new Font("Andale Mono", 1, 12));
  labelfooter.setForeground(new Color(255, 255, 255));
  add(labelfooter);
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == micalculo){

    String nombreTrabajador = textnombretrabajador.getText();
    String AP = textpaternotrabajador.getText();
    String AM = textmaternotrabajador.getText();
    String Departamento = combodepartamento.getSelectedItem().toString();
    String Antiguedad = comboantiguedad.getSelectedItem().toString();

    if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
       Departamento.equals("") || Antiguedad.equals("")){

     JOptionPane.showMessageDialog(null, "Debes completar todos los campos");

   } else {

     if(Departamento.equals("Atencion al Cliente")){

      if(Antiguedad.equals("1 temporada de servicio")){
       textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Departamento + " con " +
                         "\n   recibe 6 dias de vacaciones.");
     }
      if(Antiguedad.equals("2 a 6 temporadas de servicio")){
       textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Departamento + " con " +
                         "\n   recibe 14 dias de vacaciones.");
     }
      if(Antiguedad.equals("7 temporadas o mas de servicio")){
       textarea1.setText("\n   El trabajador " + nombreTrabajador + "" + AP + "" + AM +
                         "\n   quien labora en " + Departamento + " con " +
                         "\n   recibe 20 dias de vacaciones.");
     }
    }


     if(Departamento.equals("Departamento de Logistica")){
      if(Antiguedad.equals("1 temporada de servicio")){
       textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Departamento + " con " +
                         "\n   recibe 7 dias de vacaciones.");
     }
      if(Antiguedad.equals("2 a 6 temporadas de servicio")){
       textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Departamento + " con " +
                         "\n   recibe 15 dias de vacaciones.");
     }
      if(Antiguedad.equals("7 temporadas o mas de servicio")){
       textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Departamento + " con " +
                         "\n   recibe 22 dias de vacaciones.");
     }
    }


    if(Departamento.equals("Departamento de Gerencia")){
      if(Antiguedad.equals("1 temporada de servicio")){
       textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Departamento + " con " +
                         "\n   recibe 10 dias de vacaciones.");
     }
      if(Antiguedad.equals("2 a 6 temporadas de servicio")){
       textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Departamento + " con " +
                         "\n   recibe 20 dias de vacaciones.");
     }
      if(Antiguedad.equals("7 temporadas o mas de servicio")){
       textarea1.setText("\n   El trabajador " + nombreTrabajador + " " + AP + " " + AM +
                         "\n   quien labora en " + Departamento + " con " +
                         "\n   recibe 30 dias de vacaciones.");
     }
    }
   }
  }
   if(e.getSource() == mirojo){
    getContentPane().setBackground(new Color(255,0,0));
  }
   if(e.getSource() == minegro){
    getContentPane().setBackground(new Color(0,0,0));
  }
   if(e.getSource() == mimorado){
    getContentPane().setBackground(new Color(51,0,51));
  }
   if(e.getSource() == minuevo){
    textnombretrabajador.setText("");
    textpaternotrabajador.setText("");
    textmaternotrabajador.setText("");   
    combodepartamento.setSelectedIndex(0);
    comboantiguedad.setSelectedIndex(0);
    textarea1.setText("\n   Aqui aparece el resultado del calculo de vacaciones.");
  }
   if(e.getSource() == misalir){
   Bienvenida interfaz1 = new Bienvenida();
   interfaz1.setBounds(0, 0, 350, 450);
   interfaz1.setVisible(true);
   interfaz1.setLocationRelativeTo(null);
   interfaz1.setResizable(false);
   this.setVisible(false);
  }
   if(e.getSource() == micreador){
    JOptionPane.showMessageDialog(null,"Desarrollado por Carlos Gabriel Sucaria con la participacion especial de su hijo Leandro Sucaria.\n" + 
                                       "      Email: gabriel122010@gmail.com");
  }
 }

  public static void main(String args[]){
   Principal vprincipal = new Principal();
   vprincipal.setBounds(0,0,640,535);
   vprincipal.setVisible(true);
   vprincipal.setResizable(false);
   vprincipal.setLocationRelativeTo(null);   
 }
}