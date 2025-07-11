/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorDeContraseñas;

import java.beans.*;

/**
 *
 * @author felix
 */
public class GeneradorDeContraseñasBeanInfo extends SimpleBeanInfo {
    
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            PropertyDescriptor tipo = new PropertyDescriptor("tipo", GeneradorDeContraseñas.class);
            tipo.setPropertyEditorClass(TipoEditor.class);

            PropertyDescriptor usarIcono = new PropertyDescriptor("usarIcono", GeneradorDeContraseñas.class);
            PropertyDescriptor usarColor = new PropertyDescriptor("usarColor", GeneradorDeContraseñas.class);

            return new PropertyDescriptor[] { tipo, usarIcono, usarColor };
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
