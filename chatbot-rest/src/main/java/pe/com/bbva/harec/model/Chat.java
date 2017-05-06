package pe.com.bbva.harec.model;

import java.util.List;

public class Chat {
	private List<Participante> participantes;
	private List<Mensaje> mensajes;
	
	public List<Participante> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}
	public List<Mensaje> getMensajes() {
		return mensajes;
	}
	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
}
