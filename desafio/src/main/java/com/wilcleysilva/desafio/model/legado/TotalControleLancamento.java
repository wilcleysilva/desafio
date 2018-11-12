package com.wilcleysilva.desafio.model.legado;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "quantidadeLancamentos", "quantidadeRemessas", "valorLancamentos" })
public class TotalControleLancamento {

	@JsonProperty("quantidadeLancamentos")
	private Long aQtLancamentos;
	
	@JsonProperty("quantidadeRemessas")
	private Long aQtRemessas;
	
	@JsonProperty("valorLancamentos")
	private Double aVlLancamentos;
	
	@JsonIgnore
	private Map<String, Object> aAdditionalProperties = new HashMap<String, Object>();

	@JsonProperty("quantidadeLancamentos")
	public Long getQtLancamentos() {
		return aQtLancamentos;
	}

	@JsonProperty("quantidadeLancamentos")
	public void setQtLancamentos(Long pQtLancamentos) {
		this.aQtLancamentos = pQtLancamentos;
	}

	@JsonProperty("quantidadeRemessas")
	public Long getQtRemessas() {
		return aQtRemessas;
	}

	@JsonProperty("quantidadeRemessas")
	public void setQtRemessas(Long pQtRemessas) {
		this.aQtRemessas = pQtRemessas;
	}

	@JsonProperty("valorLancamentos")
	public Double getVlLancamentos() {
		return aVlLancamentos;
	}

	@JsonProperty("valorLancamentos")
	public void setValorLancamentos(Double pVlLancamentos) {
		this.aVlLancamentos = pVlLancamentos;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.aAdditionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.aAdditionalProperties.put(name, value);
	}

}