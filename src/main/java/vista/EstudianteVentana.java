/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.EstudianteControl;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author PCG
 */
public class EstudianteVentana extends JFrame implements ActionListener{
    
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JButton> jButtonList;
    private List<JPanel> jPanelList;
    private EstudianteControl estudianteControl = new EstudianteControl();
    
    public EstudianteVentana(String title) throws HeadlessException {
        this.setTitle(title);
        this.setSize(300,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
        this.jPanelList.get(0).setLayout(new FlowLayout());
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));
        this.jPanelList.get(0).add(this.jLabelList.get(2));
        this.jPanelList.get(0).add(this.jTextFieldList.get(2));
        this.jPanelList.get(0).add(this.jLabelList.get(3));
        this.jPanelList.get(0).add(this.jTextFieldList.get(3));
        this.jPanelList.get(0).add(this.jLabelList.get(4));
        this.jPanelList.get(0).add(this.jTextFieldList.get(4));
        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.ORANGE);
        this.setContentPane(this.jPanelList.get(0));
        
    }
    
    public void iniciarEtiquetas(){
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Ingrese el Nombre del Estudiante:"));
        this.jLabelList.add(new JLabel("Ingrese la Edad del Estudiante:"));
        this.jLabelList.add(new JLabel("Ingrese el ID del Estudiante:"));
        this.jLabelList.add(new JLabel("Ingrese el Grado del Estudiante:"));
        this.jLabelList.add(new JLabel("Ingrese el Lugar de Nacimiento del Estudiante:"));
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(20));
        this.jTextFieldList.add(new JTextField(5));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(10));
        this.jTextFieldList.add(new JTextField(20));
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));
        this.jButtonList.get(0).addActionListener(this);
        this.jButtonList.get(1).addActionListener(this); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.jButtonList.get(0))){
            String [] params = new String[5];
            params[0]=this.jTextFieldList.get(0).getText();
            params[1]=this.jTextFieldList.get(1).getText();
            params[2]=this.jTextFieldList.get(2).getText();
            params[3]=this.jTextFieldList.get(3).getText();
            params[4]=this.jTextFieldList.get(4).getText();
            
            this.estudianteControl.crear(params); 
            
            this.jTextFieldList.get(0).setText("");
            this.jTextFieldList.get(1).setText("");
            this.jTextFieldList.get(2).setText("");
            this.jTextFieldList.get(3).setText("");
            this.jTextFieldList.get(4).setText("");  
        }
        
        if(e.getSource().equals(this.jButtonList.get(1))){
            System.out.println(this.estudianteControl.listar().toString());
        }
    }  
}
