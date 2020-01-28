package com.vadinei.spring.boot.api.v1;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping(path = AbstractController.VERSION_PATH)
public class UnidadeFederativaController extends AbstractController {

	private static final long serialVersionUID = 8290898516845421660L;
	
	@GetMapping(path = "/ufs", produces = MediaType.APPLICATION_JSON_VALUE)
	public String listar() {
		return "[]";
	}

	@GetMapping(path = "/ufs/{filtro}/{ordenacao}/{pagina}/{quantidade}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String listar(@PathVariable String filtro, @PathVariable String ordenacao, @PathVariable Integer pagina, @PathVariable Integer quantidade) {
		
		Map<String, Object> mapRetorno = new LinkedHashMap<String, Object>(); 
		mapRetorno.put("filtro", filtro);
		mapRetorno.put("ordenacao", ordenacao);
		mapRetorno.put("pagina", pagina);
		mapRetorno.put("quantidade", quantidade);
		
		String retorno = new Gson().toJson(mapRetorno);
		System.out.println(retorno);
		return retorno;
		
	}

	@GetMapping(path = "/ufs/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String consultar(@PathVariable String id) {
		System.out.println(id);
		return id;
	}
	
	@PostMapping(path = "/ufs", produces = MediaType.APPLICATION_JSON_VALUE)
	public String incluir(@RequestBody String json) {
		System.out.println(json);
		return json;
	}
	
	@PutMapping(path = "/ufs", produces = MediaType.APPLICATION_JSON_VALUE)
	public String alterar(@RequestBody String json) {
		System.out.println(json);
		return json;
	}

}
