public class UsuarioWeb {
	private int idUsuario;
	private String nombreUsuario;
	private String contraseña;
	private EstadoUsuarioWeb estado;
	private CarritoDeCompras carrito;

	// Getters and Setters
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public EstadoUsuarioWeb getEstado() {
		return estado;
	}

	public void setEstado(EstadoUsuarioWeb estado) {
		this.estado = estado;
	}

	public CarritoDeCompras getCarrito() {
		return carrito;
	}

	public void setCarrito(CarritoDeCompras carrito) {
		this.carrito = carrito;
	}
}