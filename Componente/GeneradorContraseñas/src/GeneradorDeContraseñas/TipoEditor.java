/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorDeContraseñas;

import java.beans.PropertyEditorSupport;

/**
 *
 * @author felix
 */
public class TipoEditor extends PropertyEditorSupport {
    
    private final String[] opciones = { 
        "Todo", 
        "Solo numeros", 
        "Solo mayusculas", 
        "Solo minusculas", 
        "Con simbolos" 
    };

    @Override
    public String[] getTags() {
        return opciones;
    }

    @Override
    public String getAsText() {
        return (String) getValue();
    }

    @Override
    public void setAsText(String text) {
        setValue(text);
    }

    @Override
    public String getJavaInitializationString() {
        return "\"" + getAsText() + "\"";
    }
}
            
    
    
    

