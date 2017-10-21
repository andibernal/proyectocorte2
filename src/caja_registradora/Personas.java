package caja_registradora;


public class Personas {
		String nombre, apellido,datos,empresa_Labora;
		int cedula,edad,sueldo_actu;
		
		public Personas( String nom, String ape,int ced, int edad,String empre_Labo,int suled_actu) {   // 
			
			this.nombre=nom;
			this.apellido=ape;
			this.cedula=ced;
			this.edad=edad;
			this.empresa_Labora=empre_Labo;
			this.sueldo_actu=suled_actu;
			
		}
		/*public Personas(String nom, String ape) {  //, int edad,String empre_Labo,int suled_actu 
			
			this.nombre=nom;
			this.apellido=ape;
			/*
			this.edad=edad;
			this.empresa_Labora=empre_Labo;
			this.sueldo_actu=suled_actu;
			
		}*/
		
		public int getCed() {
			return cedula;
		}
		public int getEdad() {
			return edad;
				
		}
		
		public String getNombre() {
			return nombre;
		}
		public String getApellido() {
			return apellido;
		}
		
		/////
		
		public String getEmpresa_labora() {
			return empresa_Labora;
		}
		
		public int getSueldo_actu() {
			return sueldo_actu;
		}
		
		
		
		
		public void setCed(int c) {
			this.cedula=c;
		}
		
		public void setNombre(String c) {
			this.nombre=c;
		}
		public void setApellido(String c) {
			this.apellido=c;
		}
		
		public void setEdad(int d) {
			this.edad=d;
		}
		
		public void setEmpresa_labora(String c) {
			this.empresa_Labora=c;
		}
		public void setSueldo_actu(int d) {
			this.sueldo_actu=d;
		}
		
		/*
		public void setDatos(String a, String b) { //, String c,String d,String e
			
			a=this.getNombre();
			b=this.getApellido();
			
			
			c=Integer.toString(getEdad());
			d=this.getEmpresa_labora();
			e=Integer.toString(getSueldo_actu());
			
			//datos = a+b+c;
			
		}
		*/
		/*
		public String getDatos() {
			return datos;
		}
		
		public Object[] getDetalles() {
			Object[] data = {this.cedula, this.nombre, this.apellido};//,this.edad, this.empresa_Labora,this.sueldo_actu
			return data;
		}
		*/
}


