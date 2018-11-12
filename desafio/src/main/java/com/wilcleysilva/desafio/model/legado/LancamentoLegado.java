package com.wilcleysilva.desafio.model.legado;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "totalControleLancamento", "listaControleLancamento", "indice", "tamanhoPagina", "totalElements" })
public class LancamentoLegado {

	@JsonProperty("totalControleLancamento")
	private TotalControleLancamento aTotalControleLancamento;

	@JsonProperty("listaControleLancamento")
	private List<ListaControleLancamento> aListaControleLancamento = null;

	@JsonProperty("indice")
	private Long aIndice;

	@JsonProperty("tamanhoPagina")
	private Long aTamanhoPagina;

	@JsonProperty("totalElements")
	private Long aTotalElements;

	@JsonIgnore
	private Map<String, Object> aAdditionalProperties = new HashMap<String, Object>();

	@JsonProperty("totalControleLancamento")
	public TotalControleLancamento getTotalControleLancamento() {
		return aTotalControleLancamento;
	}

	@JsonProperty("totalControleLancamento")
	public void setTotalControleLancamento(TotalControleLancamento pTotalControleLancamento) {
		this.aTotalControleLancamento = pTotalControleLancamento;
	}

	@JsonProperty("listaControleLancamento")
	public List<ListaControleLancamento> getListaControleLancamento() {
		return aListaControleLancamento;
	}

	@JsonProperty("listaControleLancamento")
	public void setListaControleLancamento(List<ListaControleLancamento> pListaControleLancamento) {
		this.aListaControleLancamento = pListaControleLancamento;
	}

	@JsonProperty("indice")
	public Long getIndice() {
		return aIndice;
	}

	@JsonProperty("indice")
	public void setIndice(Long pIndice) {
		this.aIndice = pIndice;
	}

	@JsonProperty("tamanhoPagina")
	public Long getTamanhoPagina() {
		return aTamanhoPagina;
	}

	@JsonProperty("tamanhoPagina")
	public void setTamanhoPagina(Long pTamanhoPagina) {
		this.aTamanhoPagina = pTamanhoPagina;
	}

	@JsonProperty("totalElements")
	public Long getTotalElements() {
		return aTotalElements;
	}

	@JsonProperty("totalElements")
	public void setTotalElements(Long pTotalElements) {
		this.aTotalElements = pTotalElements;
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
