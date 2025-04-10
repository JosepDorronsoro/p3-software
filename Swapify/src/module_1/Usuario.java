package module_1;

public class Usuario{
	
	public String nombre;
	

	public String contrasena;
	public Productos[] listaProductos;
	public Chats[] chats;
	public Promociones[] promociones;
	public Venta[] ventasRealizadas;
	public Venta[] compras;
	
	public Usuario(String nombre, String contrasena) {
		this.nombre = nombre;
		this.contrasena = contrasena;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
		
}
