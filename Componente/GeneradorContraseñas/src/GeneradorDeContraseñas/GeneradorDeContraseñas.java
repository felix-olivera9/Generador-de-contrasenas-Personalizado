/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorDeContraseñas;

import java.awt.Color;
import java.security.SecureRandom;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Componente JButton personalizado que genera contraseñas aleatorias según diferentes criterios.
 * Permite configurar el tipo de caracteres a incluir, longitud y aspectos visuales como iconos y colores.
 * 
 * @author felix
 */
public class GeneradorDeContraseñas extends JButton {
    /** Indica si se deben incluir mayúsculas en la generación de contraseñas */
    private boolean incluirMayusculas = true;
    /** Indica si se deben incluir minúsculas en la generación de contraseñas */
    private boolean incluirMinusculas = true;
    /** Indica si se deben incluir números en la generación de contraseñas */
    private boolean incluirNumeros = true;
    /** Indica si se deben incluir símbolos en la generación de contraseñas */
    private boolean incluirSimbolos = true;
    /** Longitud de la contraseña a generar */
    private int longitud = 8;
    /** Última contraseña generada */
    private String contrasena;

    /** Indica si el botón debe mostrar un icono según el tipo de contraseña */
    private boolean usarIcono = false;
    /** Indica si el botón debe usar colores específicos según el tipo de contraseña */
    private boolean usarColor = false;
    /** Tipo de contraseña a generar (Todo, Solo numeros, Solo mayusculas, etc.) */
    private String tipo = "Todo";

    /**
     * Constructor que inicializa el botón con el texto "Generar" y actualiza su estilo visual.
     */
    public GeneradorDeContraseñas() {
        this.setText("Generar");
        actualizarEstilo();
    }

    /**
     * Establece el texto del botón y notifica a los PropertyChangeListeners.
     * 
     * @param text El nuevo texto a mostrar en el botón
     */
    @Override
    public void setText(String text) {
        super.setText(text);
        firePropertyChange("text", null, text);
    }

    /**
     * Obtiene el texto actual del botón.
     * 
     * @return El texto actual del botón
     */
    @Override
    public String getText() {
        return super.getText();
    }

    /**
     * Actualiza el estilo visual del botón según las configuraciones actuales.
     * Cambia colores de fondo y texto, así como iconos según el tipo de contraseña seleccionado.
     */
    private void actualizarEstilo() {
        if (usarColor) {
            switch (tipo) {
                case "Solo numeros":
                    setBackground(Color.blue);
                    setForeground(Color.yellow);
                    break;
                case "Todo":
                    setBackground(Color.white);
                    setForeground(Color.black);
                    break;
                case "Solo minusculas":
                    setBackground(Color.orange);
                    setForeground(Color.blue);
                    break;
                case "Con simbolos":
                    setBackground(Color.green);
                    setForeground(Color.red);
                    break;
                case "Solo mayusculas":
                    setBackground(Color.cyan);
                    setForeground(Color.gray);
                    break;
                default:
                    setBackground(Color.white);
                    setForeground(Color.black);
            }
        } else {
            setBackground(Color.lightGray);
            setForeground(Color.black);
        }

        if (usarIcono) {
            switch (tipo) {
                case "Solo numeros":
                    setIcon(new ImageIcon(getClass().getResource("/Iconos/IconoNumeros1.png")));
                    break;
                case "Solo minusculas":
                    setIcon(new ImageIcon(getClass().getResource("/Iconos/IconoMinusculas1.png")));
                    break;
                case "Con simbolos":
                    setIcon(new ImageIcon(getClass().getResource("/Iconos/IconoSimbolos1.png")));
                    break;
                case "Solo mayusculas":
                    setIcon(new ImageIcon(getClass().getResource("/Iconos/IconoMayusculas1.png")));
                    break;
                default:
                    setIcon(null);
            }
        } else {
            setIcon(null);
        }
    }

    /**
     * Establece si el botón debe mostrar un icono según el tipo de contraseña.
     * 
     * @param usarIcono true para mostrar icono, false para ocultarlo
     */
    public void setUsarIcono(boolean usarIcono) {
        this.usarIcono = usarIcono;
        actualizarEstilo();
    }

    /**
     * Indica si el botón está configurado para mostrar iconos.
     * 
     * @return true si muestra iconos, false en caso contrario
     */
    public boolean isUsarIcono() {
        return usarIcono;
    }

    /**
     * Indica si el botón está configurado para usar colores específicos.
     * 
     * @return true si usa colores específicos, false en caso contrario
     */
    public boolean isUsarColor() {
        return usarColor;
    }

    /**
     * Establece si el botón debe usar colores específicos según el tipo de contraseña.
     * 
     * @param usarColor true para activar colores específicos, false para desactivarlos
     */
    public void setUsarColor(boolean usarColor) {
        this.usarColor = usarColor;
        actualizarEstilo();
    }

    /**
     * Obtiene el tipo actual de contraseña configurado.
     * 
     * @return El tipo de contraseña actual (Todo, Solo numeros, etc.)
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de contraseña a generar y actualiza el estilo visual.
     * 
     * @param tipo El nuevo tipo de contraseña (Todo, Solo numeros, etc.)
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
        actualizarEstilo();
    }

    /**
     * Establece si se deben incluir mayúsculas en la generación de contraseñas.
     * 
     * @param incluir true para incluir mayúsculas, false para excluirlas
     */
    public void setIncluirMayusculas(boolean incluir) { incluirMayusculas = incluir; }

    /**
     * Establece si se deben incluir minúsculas en la generación de contraseñas.
     * 
     * @param incluir true para incluir minúsculas, false para excluirlas
     */
    public void setIncluirMinusculas(boolean incluir) { incluirMinusculas = incluir; }

    /**
     * Establece si se deben incluir números en la generación de contraseñas.
     * 
     * @param incluir true para incluir números, false para excluirlos
     */
    public void setIncluirNumeros(boolean incluir) { incluirNumeros = incluir; }

    /**
     * Establece si se deben incluir símbolos en la generación de contraseñas.
     * 
     * @param incluir true para incluir símbolos, false para excluirlos
     */
    public void setIncluirSimbolos(boolean incluir) { incluirSimbolos = incluir; }

    /**
     * Establece la longitud de las contraseñas a generar.
     * 
     * @param longitud La nueva longitud de las contraseñas (debe ser mayor que 0)
     */
    public void setLongitud(int longitud) { this.longitud = longitud; }

    /**
     * Genera y devuelve una contraseña según la configuración actual.
     * 
     * @return La contraseña generada como String
     */
    public String devolverconteseñagenerada() {
        switch (tipo) {
            case "Solo numeros":
                contrasena = generarDesdeCadena("0123456789");
                break;
            case "Solo minusculas":
                contrasena = generarDesdeCadena("abcdefghijklmnñopqrstuvwxyz");
                break;
            case "Solo mayusculas":
                contrasena = generarDesdeCadena("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
                break;
            case "Con simbolos":
                contrasena = generarDesdeCadena("!@#$%&*()-_=+<>?");
                break;
            case "Todo":
            default:
                contrasena = generamixto();
        }
        return contrasena;
    }

    /**
     * Genera una contraseña que puede incluir múltiples tipos de caracteres según la configuración.
     * 
     * @return La contraseña generada como String
     * @throws IllegalStateException Si no se ha seleccionado ningún tipo de carácter para incluir
     */
    public String generamixto() {
        String mayusculas = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnñopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%&*()-_=+<>?";

        String todos = "";
        if (incluirMayusculas) todos += mayusculas;
        if (incluirMinusculas) todos += minusculas;
        if (incluirNumeros) todos += numeros;
        if (incluirSimbolos) todos += simbolos;

        if (todos.isEmpty()) {
            return "ERROR: Selecciona al menos un tipo de carácter.";
        }

        return generarDesdeCadena(todos);
    }

    /**
     * Genera una contraseña aleatoria a partir de un conjunto específico de caracteres.
     * 
     * @param caracteres Los caracteres permitidos para generar la contraseña
     * @return La contraseña generada como String
     */
    private String generarDesdeCadena(String caracteres) {
        StringBuilder sb = new StringBuilder();
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < longitud; i++) {
            sb.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return sb.toString();
    }
}