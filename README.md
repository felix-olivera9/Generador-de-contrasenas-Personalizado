# Generador-de-contrasenas-Personalizado


![Ejemplo visual del componente](Componente_Ejemplo.png)

## 📝 Descripción
Componente Java Swing personalizado que genera contraseñas seguras con múltiples opciones de configuración. Permite:
- Generar contraseñas con diferentes combinaciones de caracteres
- Personalizar longitud y tipos de caracteres
- Cambiar aspecto visual (colores e iconos) según el tipo de contraseña
- Integración sencilla en entornos de desarrollo visual (NetBeans, etc.)

## 🛠 Métodos y Propiedades Relevantes

| Método/Propiedad                     | Descripción |
|---------------------------------------|-------------|
| `setTipo(String tipo)`                | Establece el tipo de contraseña a generar ("Todo", "Solo numeros", "Solo mayusculas", etc.) y actualiza el estilo visual del botón |
| `devolverContraseñaGenerada()`        | Genera y devuelve una contraseña según la configuración actual |
| `generarDesdeCadena(String caracteres)` | Método interno que genera la contraseña aleatoria a partir de los caracteres permitidos |
| `setLongitud(int longitud)`           | Define la longitud de las contraseñas generadas (valor debe ser mayor que 0) |
| `setUsarIcono(boolean usarIcono)`     | Activa/desactiva la visualización de iconos representativos en el botón |
| `setUsarColor(boolean usarColor)`     | Activa/desactiva el cambio de colores según el tipo de contraseña |
| `setIncluirMayusculas(boolean incluir)` | Controla si se incluyen mayúsculas en la generación de contraseñas |
| `setIncluirMinusculas(boolean incluir)` | Controla si se incluyen minúsculas en la generación de contraseñas |
| `setIncluirNumeros(boolean incluir)`  | Controla si se incluyen números en la generación de contraseñas |
| `setIncluirSimbolos(boolean incluir)` | Controla si se incluyen símbolos en la generación de contraseñas |

## 🚀 Instrucciones de Uso

1. ## 🖥 Integración en Entornos Visuales (NetBeans)

**Agrega el botón a la paleta de NetBeans** 

   - Abre el diseñador de formularios (`.java`).
   - Clic derecho en la `Paleta de Componentes` → `Agregar desde JAR...`.
   - Selecciona el `.jar`, luego elige la clase `GeneradorDeContraseñas`.
   - Asigna una categoría personalizada (ej. “Componentes personalizados”).
   - Localiza el componente "GeneradorDeContraseñas" en la paleta de componentes
   - Arrástralo directamente a tu formulario JFrame/JPanel

2. **Configurar propiedades** (editor de propiedades)  
   ```properties
   tipo: "Todo" | "Solo numeros" | "Solo mayusculas" | etc.
   usarIcono: true/false
   usarColor: true/false
   text: "Texto personalizado"
3. **Configurar propiedades**
  - Cambia entre 5 tipos de contraseñas con estilos predefinidos
  - Activa/desactiva iconos con un checkbox
  - Modifica colores con un checkbox
4. **Créditos**:
   - Formato tabular profesional
   - Columnas para Rol y Contribución específica
   - Fácil de actualizar
5. **Javadoc**:
     - file:///C:/Users/felix/OneDrive/Documentos/NetBeansProjects/GeneradorContrase%C3%B1as/dist/javadoc/GeneradorDeContrase%C3%B1as/package-summary.html
4. **Video**:
     
     - https://youtu.be/5E_n5iqR3Zo?si=8Xdq4_h33ilXx1yx
     
