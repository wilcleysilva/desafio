package com.wilcleysilva.desafio.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtratoLancamento {
	@JsonProperty("listaLancamentos")
	private List<LancamentoConta> aLancamentosConta;

	@JsonProperty("listaLancamentos")
	public List<LancamentoConta> getLancamentosConta() {
		return aLancamentosConta;
	}

	@JsonProperty("listaLancamentos")
	public void setLancamentosConta(List<LancamentoConta> pLancamentosConta) {
		this.aLancamentosConta = pLancamentosConta;
	}
 
 
}
