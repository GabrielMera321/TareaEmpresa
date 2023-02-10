package co.edu.unbosque.model;
import util.datos;

/**
* 
	 * @author Santiago
	 *Este clase se encarga de definir el objeto Candidatos.
	 *por lo cual nos beneficiara para crearla y hacer los ajustes que sean nesesarios
	 */
public class Candidatos {

		/**
		 * Variable de tipo cadena para el nombre.
		 */
		private String nombre;
		/**
		 * Variable de tipo cadena para el apellido.
		 */
		private String apellido;
		/**
		 * Variable de tipo entero para la cedula.
		 */
		private int cedula;
		/**
		 * Variable de tipo entero para la edad.
		 */
		private int edad;
		/**
		 * Variable de tipo cadena para el cargo.
		 */
		private String cargo;
		/**
		 * Este metodo constructor es aquel que inicializa y da el valor a las variables.
		 * <b>pre<b> Deben estar previamentar creadas las variables
		 * <b>post<b>Las variables son inicializadas
		 * @param nombre es el nombre del candidato.
		 * @param apellido es el apellido del candidato
		 * @param cedula es la cedula del candidato.
		 * @param edad es la cedula del candidato.
		 * @param cargo es el cargo del candidato. 
		 */
		public Candidatos(String nombre, String apellido, int cedula, int edad, String Cargo) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.cedula = cedula;
			this.edad = edad;
			this.cargo = cargo; 
		}
		/**
		 * Obtener la varible del nombre
		 * <b>pre<b>La variable debe estar creada e inicializada
		 * <b>post<b>Se obtiene el contenido de la variable
		 * @return Regresa el nombre de la persona
		 */

		public String getNombre() {
			return nombre;
		}
		/**
		 * Cambiar el valor de la variable nombre
		 * <b>pre<b>La variable debe estar creada e inicializada
		 * <b>post<b>Se cambia el contenido de la variable
		 * @param nombre es el nombre de la persona
		 */
		public void setnombre(String nombre) {
			this.nombre = nombre;
		}
		/**
		 * Obtener la varible del genero
		 * <b>pre<b>La variable debe estar creada e inicializada
		 * <b>post<b>Se obtiene el contenido de la variable
		 * @return Regresa el nombre de la persona
		 */
		public String getapellido() {
			return apellido;
		}
		/**
		 * Cambiar el valor de la variable apellido
		 * <b>pre<b>La variable debe estar creada e inicializada
		 * <b>post<b>Se cambia el contenido de la variable
		 * @param genero es el genero de la persona
		 */
		public void setapellido(String apellido) {
			this.apellido = apellido;
		}
		/**
		 * Obtener la varible del documento
		 * <b>pre<b>La variable debe estar creada e inicializada
		 * <b>post<b>Se obtiene el contenido de la variable
		 * @return Regresa el nombre de las personas
		 */

		public int getcedula() {
			return cedula;
		}
		/**
		 * Cambiar el valor de la variable documento
		 * <b>pre<b>La variable debe estar creada e inicializada
		 * <b>post<b>Se cambi a el contenido de la variable
		 * @param documento es el documento de la persona
		 */

		public void setcedula(int cedula) {
			this.cedula = cedula;
		}
		/**
		 * Obtener la varible de la edad
		 * <b>pre<b>La variable debe estar creada e inicializada
		 * <b>post<b>Se obtiene el contenido de la variable
		 * @return Regresa la edad de la persona
		 */
		public int getedad() {
			return edad;
		}
		/**
		 * Cambiar el valor de la variable edad
		 * <b>pre<b>La variable debe estar creada e inicializada
		 * <b>post<b>Se cambia el contenido de la variable
		 * @param edad es la edad de la persona
		 */

		public void setedad(int edad) {
			this.edad = edad;
		}
		
		public String getcargo() {
			return cargo;
		}
		
		public void setcargo(String cargo) {
			this.cargo = cargo;
		}
		
		/**
		 * Metodo que se encagra de agregar a la persona al arreglo
		 * <b>pre<b>La información del objeto persona tiene que estar ya declarada
		 * <b>post<b>La persona es agregada a la lista con su respectiva información
		 * @param nombre2 es el nombre de la persona
		 * @param edad2 es la edad de la persona
		 * @param documento2 es el documento de la persona
		 * @param genero2 es el genero dee la persona
		 */
//		public void add(String nombre2, int edad2, int documento2, String genero2) {
//					this.nombre = nombre2;
//					this.apellido = apellido2;
//					this.cedula = cedula2;
//					this.edad = edad2;
//					this.cargo = cargo2;
//				}
		/**
		 * Metodo toString
		 * <b>pre<b>Todas las vairables debieron ser previamente creadas e inicializadas
		 * <b>post<b>Se muestra la informaci�n de todas las variables
		 * @return Regresa todas las variables pero como tipo String
		 */
		@Override
		public String toString() {
			return "Candidatos [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad
					+ ", cargo=" + cargo + "]";
		}
		
	}
 