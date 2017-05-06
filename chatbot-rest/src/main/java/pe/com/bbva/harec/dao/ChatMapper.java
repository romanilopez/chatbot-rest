package pe.com.bbva.harec.dao;

import java.util.List;

import pe.com.bbva.harec.model.Mensaje;
import pe.com.bbva.harec.model.Participante;

public interface ChatMapper {
	void registrarParticipante(Participante participante);
	void registrarMensaje(Mensaje mensaje);
	List<Participante> consultarParticipantes(String sessionId);
	List<Mensaje> consultarMensajes(String sessionId);
}
