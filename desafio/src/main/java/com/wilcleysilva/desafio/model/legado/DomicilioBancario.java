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
@JsonPropertyOrder({ "codigoBanco", "numeroAgencia", "numeroContaCorrente" })
public class DomicilioBancario {

	@JsonProperty("codigoBanco")
	private Integer aCdBanco;

	@JsonProperty("numeroAgencia")
	private Integer aNuAgencia;

	@JsonProperty("numeroContaCorrente")
	private String aNuContaCorrente;

	@JsonIgnore
	private Map<String, Object> aAdditionalProperties = new HashMap<String, Object>();

	@JsonProperty("codigoBanco")
	public Integer getCodigoBanco() {
		return aCdBanco;
	}

	@JsonProperty("codigoBanco")
	public void setCodigoBanco(Integer pCdBanco) {
		this.aCdBanco = pCdBanco;
	}

	@JsonProperty("numeroAgencia")
	public Integer getNumeroAgencia() {
		return aNuAgencia;
	}

	@JsonProperty("numeroAgencia")
	public void setNumeroAgencia(Integer paNuAgencia) {
		this.aNuAgencia = paNuAgencia;
	}

	@JsonProperty("numeroContaCorrente")
	public String getNumeroContaCorrente() {
		return aNuContaCorrente;
	}

	@JsonProperty("numeroContaCorrente")
	public void setNumeroContaCorrente(String pNuContaCorrente) {
		this.aNuContaCorrente = pNuContaCorrente;
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