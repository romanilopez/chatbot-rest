package pe.com.bbva.harec.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.bbva.harec.model.Peticion;
import pe.com.bbva.harec.model.RespuestaChatbot;
import pe.com.bbva.harec.model.Value;
import pe.com.bbva.harec.service.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	
//	private static final Logger logger = Logger.getLogger(ConsultaController.class);
	
	@Autowired
	ConsultaService consultaService;
	
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public RespuestaChatbot obtenerConsulta(Peticion peticion) {
		RespuestaChatbot resultado = new RespuestaChatbot();
		resultado.setType("menu");
		resultado.setInfo("¿Que opcion quieres realizar?");
		List<Value> values = new ArrayList<Value>();
		values.add(new Value("reclamos", "Mi cuenta ha sido cancelada"));
		values.add(new Value("consultas", "¿Como realizo un prestamo hipotecario?"));
		resultado.setValue(values);
		resultado.setScope("1");
		return resultado;
	}
}
