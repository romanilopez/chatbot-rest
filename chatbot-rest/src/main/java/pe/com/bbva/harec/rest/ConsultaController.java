package pe.com.bbva.harec.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.bbva.harec.model.Consulta;
import pe.com.bbva.harec.model.Respuesta;
import pe.com.bbva.harec.service.ConsultaService;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {
	
//	private static final Logger logger = Logger.getLogger(ConsultaController.class);
	
	@Autowired
	ConsultaService consultaService;
	
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public Respuesta obtenerConsulta() {
		List<Consulta> consultas = new ArrayList<Consulta>();//consultaService.obtenerConsulta();
		
		Respuesta resultado = new Respuesta();
		
		if(consultas.isEmpty()){
			resultado.setCodigo("0");
			resultado.setResultado("No se encontro resultado");
		}else{
			resultado.setCodigo("1");
			resultado.setResultado(consultas);
		}
		
		
		return resultado;
	}
}
