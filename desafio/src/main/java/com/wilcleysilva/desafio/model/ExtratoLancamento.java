package com.wilcleysilva.desafio.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtratoLancamento {
	@JsonProperty("listaLancamentos")
	private List<LancamentoConta> lancamentosConta;

	public List<LancamentoConta> getLancamentosConta() {
		return lancamentosConta;
	}

	public void setLancamentosConta(List<LancamentoConta> lancamentosConta) {
		this.lancamentosConta = lancamentosConta;
	}
 
 
}
