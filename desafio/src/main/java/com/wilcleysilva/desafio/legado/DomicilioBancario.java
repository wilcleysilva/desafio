package com.wilcleysilva.desafio.legado;

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
	private Integer codigoBanco;
	@JsonProperty("numeroAgencia")
	private Integer numeroAgencia;
	@JsonProperty("numeroContaCorrente")
	private String numeroContaCorrente;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("codigoBanco")
	public Integer getCodigoBanco() {
		return codigoBanco;
	}

	@JsonProperty("codigoBanco")
	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	@JsonProperty("numeroAgencia")
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}

	@JsonProperty("numeroAgencia")
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	@JsonProperty("numeroContaCorrente")
	public String getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	@JsonProperty("numeroContaCorrente")
	public void setNumeroContaCorrente(String numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}