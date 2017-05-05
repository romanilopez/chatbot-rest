package pe.com.bbva.harec.model;

public class Consulta {
	private String orden;
	private String nombre;
	private String fecha;
	private String prende;
	public String getOrden() {
		return orden;
	}
	public void setOrden(String orden) {
		this.orden = orden;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getPrende() {
		return prende;
	}
	public void setPrende(String prende) {
		this.prende = prende;
	}
	@Override
	public String toString() {
		return "Consulta [orden=" + orden + ", nombre=" + nombre + ", fecha=" + fecha + ", prende=" + prende + "]";
	}
}
