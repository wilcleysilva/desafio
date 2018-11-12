package com.wilcleysilva.desafio.utils;

import java.io.IOException;
import java.io.InputStreamReader;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wilcleysilva.desafio.model.legado.LancamentoLegado;

public class Util {

	public static LancamentoLegado carregarLancamentoDoArquivo()
			throws JsonParseException, JsonMappingException, IOException {
		InputStreamReader in = new InputStreamReader(Util.class.getResourceAsStream("/lancamento-conta-legado.json"));
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(in, new TypeReference<LancamentoLegado>() {
		});
	}
	
}
