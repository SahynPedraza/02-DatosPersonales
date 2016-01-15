/**
 * 
 * @author Sain y Brandon
 *
 */

public class Alumno {
	private String nombre;
	private String edad;
	private String telefono;
	private String Domicilio;
	private String Colonia;
	private String Estado;
	private String Municipio;
	private String CodigoPostal;
	private String Email;
	private String Genero;
	
/**
 * construsctor sin parametros 
 */
	public Alumno(){}
/**
 * 
 * @param nombre de la persona en formato string
 * @param edad
 * @param telefono
 * @param domicilio
 * @param colonia
 * @param estado
 * @param municipio
 * @param codigoPostal
 * @param email
 * @param genero
 */
	
	public Alumno(String nombre, String edad, String telefono, String domicilio, String colonia, String estado,
			String municipio, String codigoPostal, String email, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.Domicilio = domicilio;
		this.Colonia = colonia;
		this.Estado = estado;
		this.Municipio = municipio;
		this.CodigoPostal = codigoPostal;
		this.Email = email;
		this.Genero = genero;
	}

	/**
	 * 
	 * @return el nombre de la persona string
	 */
	public String getDomicilio() {
		return Domicilio;
	}
/**
 * 
 * @param domicilio de la persona en string
 */
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
/**
 * 
 * @return la colonia de la persona string
 */
	public String getColonia() {
		return Colonia;
	}
/**
 * 
 * @param colonia de la persona string
 */
	public void setColonia(String colonia) {
		Colonia = colonia;
	}
/**
 * 
 * @return el estado de la persona string
 */
	public String getEstado() {
		return Estado;
	}
/**
 * 
 * @param estado de la persona string
 */
	public void setEstado(String estado) {
		Estado = estado;
	}
/**
 * 
 * @return el municipio de la persona string
 */
	public String getMunicipio() {
		return Municipio;
	}
/**
 * 
 * @param municipio de la persona string
 */
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}
/**
 * 
 * @return el codigo postal de la persona string
 */
	public String getCodigoPostal() {
		return CodigoPostal;
	}
/**
 * 
 * @param codigoPostal de la persona string
 */
	public void setCodigoPostal(String codigoPostal) {
		CodigoPostal = codigoPostal;
	}
/**
 * 
 * @return el email de la persona string
 */
	public String getEmail() {
		return Email;
	}
/**
 * 
 * @param email de la persona string
 */
	public void setEmail(String email) {
		Email = email;
	}
/**
 * 
 * @return el genero de la persona string
 */
	public String getGenero() {
		return Genero;
	}
/**
 * 
 * @param genero de la persona string
 */
	public void setGenero(String genero) {
		Genero = genero;
	}
/**
 * 
 * @return el nombre de la persona string
 */
	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre de la persona string
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return la edad de la persona string
 */
	public String getEdad() {
		return edad;
	}
/**
 * 
 * @param edad de la persona string
 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
/**
 * 
 * @return el telefono de la persona string
 */
	public String getTelefono() {
		return telefono;
	}
/**
 * 
 * @param telefono de la persona string
 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	

}
