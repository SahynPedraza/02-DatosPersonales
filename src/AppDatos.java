import javax.swing.JOptionPane;
/**
 * 
 * @author Sain y Brandon
 *
 */
public class AppDatos {
	/**
	 * 
	 * @param args 
	 */
	public static void main(String[] args){
		Alumno al = new Alumno("Sain", "19", "4568742", "Tecamac", "Ajedrez", "México", "Tecamac", "55765", "sain@hotmail.com", "Masculino");
		/**
		 * Clase joptionpane
		 */
		JOptionPane.showMessageDialog(null, String.format("Hola %s \n Tu edad es %s \nTu telefono es %s \n tu domicilio es %s \n tu colonia es %s \n tu estado es %s \n tu municipio es %s \n tu codigo postal es %s \n tu email es %s \n tu genero es %s."
		,al.getNombre(),al.getEdad(), al.getTelefono(), al.getDomicilio(), al.getColonia(), al.getEstado(), al.getMunicipio(), al.getCodigoPostal(), al.getEmail(), al.getGenero() ));
	
	}

}
