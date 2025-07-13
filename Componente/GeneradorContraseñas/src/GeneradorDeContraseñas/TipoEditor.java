/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorDeContraseñas;

import java.beans.PropertyEditorSupport;

/**
 * Editor de propiedades personalizado para seleccionar tipos de contraseñas.
 * Proporciona una lista predefinida de opciones para generar diferentes tipos de contraseñas.
 * 
 * @author felix
 */
public class TipoEditor extends PropertyEditorSupport {
    
    /** Opciones disponibles para generación de contraseñas */
    private final String[] opciones = { 
        "Todo", 
        "Solo numeros", 
        "Solo mayusculas", 
        "Solo minusculas", 
        "Con simbolos" 
    };

    /**
     * Obtiene las opciones disponibles para este editor de propiedades.
     * 
     * @return Un arreglo de Strings que representa todas las opciones disponibles
     */
    @Override
    public String[] getTags() {
        return opciones;
    }

    /**
     * Obtiene el valor actual del editor como texto.
     * 
     * @return El valor actual como String
     */
    @Override
    public String getAsText() {
        return (String) getValue();
    }

    /**
     * Establece el valor del editor a partir de un String.
     * 
     * @param text El texto que representa el nuevo valor a establecer
     * @throws IllegalArgumentException Si el texto no es una opción válida
     */
    @Override
    public void setAsText(String text) {
        setValue(text);
    }

    /**
     * Genera el código de inicialización Java para el valor actual.
     * 
     * @return Una cadena que representa la inicialización Java del valor actual,
     *         adecuada para generar código
     */
    @Override
    public String getJavaInitializationString() {
        return "\"" + getAsText() + "\"";
    }
}
    
    
    

