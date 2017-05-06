package pe.com.bbva.harec.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.bbva.harec.model.Chat;
import pe.com.bbva.harec.model.Mensaje;
import pe.com.bbva.harec.model.Participante;
import pe.com.bbva.harec.model.Peticion;
import pe.com.bbva.harec.model.RespuestaChatbot;
import pe.com.bbva.harec.model.Value;
import pe.com.bbva.harec.service.ChatService;
import pe.com.bbva.harec.service.ConsultaService;

@RestController
@RequestMapping("/chat")
public class ChatController {
	
//	private static final Logger logger = Logger.getLogger(ConsultaController.class);
	
	@Autowired
	ChatService chatService;
	
	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public Chat consultarMensajes(String sessionId) {
		List<Mensaje> mensajes = chatService.consultarMensajes(sessionId);
		List<Participante> participantes = chatService.consultarParticipantes(sessionId);

		Chat chat = null;
		
		if (participantes != null && !participantes.isEmpty()) {
			chat = new Chat();
			chat.setParticipantes(participantes);
			chat.setMensajes(mensajes);
		}
		
		return chat;
	}
}
