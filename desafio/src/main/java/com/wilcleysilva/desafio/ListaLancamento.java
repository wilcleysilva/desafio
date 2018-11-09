package com.wilcleysilva.desafio;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListaLancamento {
	@JsonProperty("listaLancamentos")
	private List<LancamentoConta> lancamentosConta;

	public List<LancamentoConta> getLancamentosConta() {
		return lancamentosConta;
	}

	public void setLancamentosConta(List<LancamentoConta> lancamentosConta) {
		this.lancamentosConta = lancamentosConta;
	}
 
 
}
