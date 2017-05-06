package pe.com.bbva.harec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.harec.dao.ChatMapper;
import pe.com.bbva.harec.dao.ConsultaMapper;
import pe.com.bbva.harec.model.Chat;
import pe.com.bbva.harec.model.Consulta;
import pe.com.bbva.harec.model.Mensaje;
import pe.com.bbva.harec.model.Participante;
import pe.com.bbva.harec.service.ChatService;
import pe.com.bbva.harec.service.ConsultaService;

@Service
public class ChatServiceImpl implements ChatService{

	@Autowired
	ChatMapper chatMapper;
	
	@Override
	public void registrarParticipante(Participante participante) {
		chatMapper.registrarParticipante(participante);
	}
	
	@Override
	public void registrarMensaje(Mensaje mensaje) {
		chatMapper.registrarMensaje(mensaje);
	}
	
	@Override
	public List<Participante> consultarParticipantes(String sessionId) {
		return chatMapper.consultarParticipantes(sessionId);
	}
	
	@Override
	public List<Mensaje> consultarMensajes(String sessionId) {
		return chatMapper.consultarMensajes(sessionId);
	}
}
