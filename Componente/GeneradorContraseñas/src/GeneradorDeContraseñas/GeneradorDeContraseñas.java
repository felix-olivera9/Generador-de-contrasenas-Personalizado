/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorDeContraseñas;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.security.SecureRandom;
import java.util.Random;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author felix
 */
public class GeneradorDeContraseñas extends JButton implements MouseListener{
    private boolean incluirMayusculas = true;
    private boolean incluirMinusculas = true;
    private boolean incluirNumeros = true;
    private boolean incluirSimbolos = true;
    private int longitud = 8;
    private String contrasena;
    
    private boolean usarIcono=false;
    private boolean usarColor=false;
    private String tipo="Todos";
    

    
    
    public GeneradorDeContraseñas(){
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setText("Generar");
        actualizarEstilo();
        
    }
    
   
    
    private void actualizarEstilo(){
        if(usarColor){
            switch (tipo){
                case "Solo numeros":
                    setBackground(Color.yellow);
                    break;
                case  "Solo mayusculas":
                    setBackground(Color.cyan);
                    break;   
                default:
                    setBackground(Color.lightGray);
            }
        }else {
            setBackground(null);
        }
        if(usarIcono){
            setIcon(new ImageIcon(getClass().getResource("/Iconos/Logo2.png")));
             }else{
                     setIcon(null);
                    }

               
    }
    
    public void setUsarIcono(boolean usarIcono){
        this.usarIcono=usarIcono;
        actualizarEstilo();
    }
    public boolean isUsarIcono(){
        return usarIcono;
    }
    
    
    public String getTipo(){
        
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo= tipo;
        actualizarEstilo();
    }
    
    
    public boolean isUsarColor(){
        return usarColor;
    }
    public void setUsarColor(boolean usarColor){
        this.usarColor=usarColor;
        actualizarEstilo();
    }
    
    public String devolverconteseñagenerada(){
        return contrasena;
    }
    
    
    public  String generamixto(){
        String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnñopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%&*()-_=+<>?";
        String todos="";
         
        todos=mayusculas+minusculas+numeros+simbolos;
         String contrasena="";
         char cha = 0;
         SecureRandom random=new SecureRandom();
         for(int i=0;i<longitud;i++){
             
             cha=todos.charAt(random.nextInt(todos.length()));
             contrasena+=cha;
         }
         return contrasena;
    }
    public  String generaminusculas(){
        
        String minusculas = "abcdefghijklmnñopqrstuvwxyz";
        String todos="";
         
         if (incluirMinusculas==true)todos+=minusculas;
          
         char cha = 0;
         SecureRandom random=new SecureRandom();
         for(int i=0;i<longitud;i++){
             
             cha=todos.charAt(random.nextInt(todos.length()));
             contrasena+=cha;
         }
         return contrasena;
    }
    public  String generamayusculas(){
        String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String todos="";
        
         if (incluirMayusculas==true)todos+=mayusculas;
         
         char cha = 0;
         SecureRandom random=new SecureRandom();
         for(int i=0;i<longitud;i++){
             
             cha=todos.charAt(random.nextInt(todos.length()));
             contrasena+=cha;
         }
         return contrasena;
    }
    public  String generanumeros(){
        
        String numeros = "0123456789";
        String todos="";
        
         if (incluirNumeros==true)todos+=numeros;
         
         char cha = 0;
         SecureRandom random=new SecureRandom();
         for(int i=0;i<longitud;i++){
             
             cha=todos.charAt(random.nextInt(todos.length()));
             contrasena+=cha;
         }
         return contrasena;
    }
    public  String generasimbolos(){
        
        String numeros = "!@#$%&*()-_=+<>?";
        String todos="";
        
         if (incluirNumeros==true)todos+=numeros;
         
         char cha = 0;
         SecureRandom random=new SecureRandom();
         for(int i=0;i<longitud;i++){
             
             cha=todos.charAt(random.nextInt(todos.length()));
             contrasena+=cha;
         }
         return contrasena;
    }
    
    public void setIncluirMayusculas(boolean incluir) { incluirMayusculas = incluir; }
    public void setIncluirMinusculas(boolean incluir) { incluirMinusculas = incluir; }
    public void setIncluirNumeros(boolean incluir) { incluirNumeros = incluir; }
    public void setIncluirSimbolos(boolean incluir) { incluirSimbolos = incluir; }
    public void setLongitud(int Longitud) { longitud = Longitud; }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
    
}
