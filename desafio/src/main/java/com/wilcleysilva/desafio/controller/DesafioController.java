package com.wilcleysilva.desafio.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wilcleysilva.desafio.model.ExtratoLancamento;
import com.wilcleysilva.desafio.model.legado.LancamentoLegado;
import com.wilcleysilva.desafio.rn.RNConverterLancamento;
import com.wilcleysilva.desafio.utils.Util;

@RestController
public class DesafioController {

	@RequestMapping("/extratoLancamento")
	public ExtratoLancamento lancamentoConta() throws Exception {

		LancamentoLegado dadosLegado = Util.carregarLancamentoDoArquivo();
		
		return RNConverterLancamento.getInstancia().executar(dadosLegado);
	}
}
