/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeneradorDeContraseñas;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.beans.IntrospectionException;

/**
 * Clase BeanInfo para el componente {@link GeneradorDeContraseñas}.
 * <p>
 * Esta clase define las propiedades personalizadas que serán visibles
 * en el editor de propiedades de NetBeans u otros entornos de desarrollo
 * que soporten Java Beans.
 * </p>
 * 
 * @author felix
 */
public class GeneradorDeContraseñasBeanInfo extends SimpleBeanInfo {

    /**
     * Devuelve los descriptores de propiedades personalizados del componente
     * {@link GeneradorDeContraseñas}, para que puedan ser editados gráficamente
     * en un entorno de desarrollo visual como NetBeans.
     *
     * @return un arreglo de {@link PropertyDescriptor} con las propiedades visibles del componente
     */
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            /**
             * Propiedad: tipo
             * Define el tipo de contraseña que se generará (ej. Solo números, Solo mayúsculas, etc.).
             * Se vincula a un editor personalizado (TipoEditor).
             */
            PropertyDescriptor tipo = new PropertyDescriptor("tipo", GeneradorDeContraseñas.class);
            tipo.setPropertyEditorClass(TipoEditor.class);
            tipo.setDisplayName("Tipo de contraseña");
            tipo.setShortDescription("Tipo de caracteres que se incluirán en la contraseña generada");

            /**
             * Propiedad: usarIcono
             * Indica si se debe mostrar un icono representativo en el botón, según el tipo de contraseña.
             */
            PropertyDescriptor usarIcono = new PropertyDescriptor("usarIcono", GeneradorDeContraseñas.class);
            usarIcono.setDisplayName("Usar icono");
            usarIcono.setShortDescription("Muestra un icono representativo según el tipo de contraseña");

            /**
             * Propiedad: usarColor
             * Define si el botón debe cambiar de color según el tipo de contraseña.
             */
            PropertyDescriptor usarColor = new PropertyDescriptor("usarColor", GeneradorDeContraseñas.class);
            usarColor.setDisplayName("Usar color");
            usarColor.setShortDescription("Cambia el color del botón según el tipo de contraseña");

            /**
             * Propiedad: text
             * Texto que se muestra dentro del botón.
             */
            PropertyDescriptor text = new PropertyDescriptor("text", GeneradorDeContraseñas.class);
            text.setDisplayName("Texto del botón");
            text.setShortDescription("Texto que aparece en el botón del generador");

            return new PropertyDescriptor[] { tipo, usarIcono, usarColor, text };
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return new PropertyDescriptor[0];
        }
    }
}
