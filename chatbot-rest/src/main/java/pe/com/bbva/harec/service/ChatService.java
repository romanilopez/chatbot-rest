package pe.com.bbva.harec.service;

import java.util.List;

import pe.com.bbva.harec.model.Chat;
import pe.com.bbva.harec.model.Mensaje;
import pe.com.bbva.harec.model.Participante;

public interface ChatService {
	void registrarParticipante(Participante participante);
	void registrarMensaje(Mensaje mensaje);
	List<Participante> consultarParticipantes(String sessionId);
	List<Mensaje> consultarMensajes(String sessionId);
}
