package edu.eci.pdsw.examples.model;

public class Plato {

	private int precio;

	private String nombre;

        public Plato(){
            
        }
        
	public Plato(String nombre, int precio) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}

        public void setPrecio(int precio) {
            this.precio = precio;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        
        

	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
}
