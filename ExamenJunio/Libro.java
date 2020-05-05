package ExamenJunio;

public class Libro implements Ordenable {

		private String titulo;
		private String descripcion;
		private boolean prestado=false;
		public final int tipo_novela =1;
		public final int tipo_relatos =2;
		public final int tipo_poesia=3;
		public int tipoLibro;
		public int contador=0;
		public int identificador=100;
		public int identificador2;
		private String cambiarPrestado;
		
		public Libro(String titulo, String descripcion, int tipoLibro) {
			this.titulo=titulo;
			this.descripcion=descripcion;
			this.prestado=false;
			this.tipoLibro=tipoLibro;
			this.identificador2=identificador++;
			contador++;
			
		}
		public Libro(String titulo,String descripcion){
			this.titulo=titulo;
			this.descripcion=descripcion;
			this.tipoLibro=tipo_poesia;
			identificador++;
		
			contador++;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public boolean isPrestado() {
			return prestado;
		}
		public void setPrestado(boolean prestado) {
			this.prestado = prestado;
		}
		public void cambiarPrestado() {
			this.prestado=true;
			System.out.println("El libro esta prestado");
			
		}
		public static void main(String[] args ) {
			Libro esla=new Libro("el señor de los anillos","Buenisimo",1);
			System.out.println(esla.titulo + " " +esla.descripcion + " " + esla.tipo_novela+ " "  + " " +esla.identificador2++ +" "+ esla.contador++);
			
			Libro esla2=new Libro("relatos cortos","pequeñas historias",2);
			System.out.println(esla2.titulo + " " +esla2.descripcion + " " + esla2.tipo_relatos + " " +esla.identificador2++ + " "+esla.contador++);
			
			Libro esla3=new Libro("Las almas de Brandon","poesia pura",3);
			System.out.println(esla3.titulo + " " +esla3.descripcion + " " + esla3.tipo_poesia+ " "  + " " +esla.identificador2++ + " "+esla.contador++);
			esla3.cambiarPrestado();
		}
		@Override
		public void entero() {
			// TODO Auto-generated method stub	
			System.out.println(identificador);
		}
		
}