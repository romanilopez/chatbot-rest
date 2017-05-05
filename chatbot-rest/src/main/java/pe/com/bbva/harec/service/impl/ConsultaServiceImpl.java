package pe.com.bbva.harec.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.bbva.harec.dao.ConsultaMapper;
import pe.com.bbva.harec.model.Consulta;
import pe.com.bbva.harec.service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService{

	@Autowired
	ConsultaMapper consultaMapper;
	
	@Override
	public List<Consulta> obtenerConsulta() {
		return consultaMapper.cargarConsulta();
	}
	
}
