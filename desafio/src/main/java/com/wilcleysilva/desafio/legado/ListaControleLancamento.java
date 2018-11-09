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
@JsonPropertyOrder({ "lancamentoContaCorrenteCliente", "dataEfetivaLancamento", "dataLancamentoContaCorrenteCliente",
		"numeroEvento", "descricaoGrupoPagamento", "codigoIdentificadorUnico", "nomeBanco",
		"quantidadeLancamentoRemessa", "numeroRaizCNPJ", "numeroSufixoCNPJ", "valorLancamentoRemessa",
		"dateLancamentoContaCorrenteCliente", "dateEfetivaLancamento" })
public class ListaControleLancamento {

	@JsonProperty("lancamentoContaCorrenteCliente")
	private LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente;
	@JsonProperty("dataEfetivaLancamento")
	private String dataEfetivaLancamento;
	@JsonProperty("dataLancamentoContaCorrenteCliente")
	private String dataLancamentoContaCorrenteCliente;
	@JsonProperty("numeroEvento")
	private Long numeroEvento;
	@JsonProperty("descricaoGrupoPagamento")
	private String descricaoGrupoPagamento;
	@JsonProperty("codigoIdentificadorUnico")
	private String codigoIdentificadorUnico;
	@JsonProperty("nomeBanco")
	private String nomeBanco;
	@JsonProperty("quantidadeLancamentoRemessa")
	private Long quantidadeLancamentoRemessa;
	@JsonProperty("numeroRaizCNPJ")
	private String numeroRaizCNPJ;
	@JsonProperty("numeroSufixoCNPJ")
	private String numeroSufixoCNPJ;
	@JsonProperty("valorLancamentoRemessa")
	private Double valorLancamentoRemessa;
	@JsonProperty("dateLancamentoContaCorrenteCliente")
	private Long dateLancamentoContaCorrenteCliente;
	@JsonProperty("dateEfetivaLancamento")
	private Long dateEfetivaLancamento;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("lancamentoContaCorrenteCliente")
	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return lancamentoContaCorrenteCliente;
	}

	@JsonProperty("lancamentoContaCorrenteCliente")
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente) {
		this.lancamentoContaCorrenteCliente = lancamentoContaCorrenteCliente;
	}

	@JsonProperty("dataEfetivaLancamento")
	public String getDataEfetivaLancamento() {
		return dataEfetivaLancamento;
	}

	@JsonProperty("dataEfetivaLancamento")
	public void setDataEfetivaLancamento(String dataEfetivaLancamento) {
		this.dataEfetivaLancamento = dataEfetivaLancamento;
	}

	@JsonProperty("dataLancamentoContaCorrenteCliente")
	public String getDataLancamentoContaCorrenteCliente() {
		return dataLancamentoContaCorrenteCliente;
	}

	@JsonProperty("dataLancamentoContaCorrenteCliente")
	public void setDataLancamentoContaCorrenteCliente(String dataLancamentoContaCorrenteCliente) {
		this.dataLancamentoContaCorrenteCliente = dataLancamentoContaCorrenteCliente;
	}

	@JsonProperty("numeroEvento")
	public Long getNumeroEvento() {
		return numeroEvento;
	}

	@JsonProperty("numeroEvento")
	public void setNumeroEvento(Long numeroEvento) {
		this.numeroEvento = numeroEvento;
	}

	@JsonProperty("descricaoGrupoPagamento")
	public String getDescricaoGrupoPagamento() {
		return descricaoGrupoPagamento;
	}

	@JsonProperty("descricaoGrupoPagamento")
	public void setDescricaoGrupoPagamento(String descricaoGrupoPagamento) {
		this.descricaoGrupoPagamento = descricaoGrupoPagamento;
	}

	@JsonProperty("codigoIdentificadorUnico")
	public String getCodigoIdentificadorUnico() {
		return codigoIdentificadorUnico;
	}

	@JsonProperty("codigoIdentificadorUnico")
	public void setCodigoIdentificadorUnico(String codigoIdentificadorUnico) {
		this.codigoIdentificadorUnico = codigoIdentificadorUnico;
	}

	@JsonProperty("nomeBanco")
	public String getNomeBanco() {
		return nomeBanco;
	}

	@JsonProperty("nomeBanco")
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	@JsonProperty("quantidadeLancamentoRemessa")
	public Long getQuantidadeLancamentoRemessa() {
		return quantidadeLancamentoRemessa;
	}

	@JsonProperty("quantidadeLancamentoRemessa")
	public void setQuantidadeLancamentoRemessa(Long quantidadeLancamentoRemessa) {
		this.quantidadeLancamentoRemessa = quantidadeLancamentoRemessa;
	}

	@JsonProperty("numeroRaizCNPJ")
	public String getNumeroRaizCNPJ() {
		return numeroRaizCNPJ;
	}

	@JsonProperty("numeroRaizCNPJ")
	public void setNumeroRaizCNPJ(String numeroRaizCNPJ) {
		this.numeroRaizCNPJ = numeroRaizCNPJ;
	}

	@JsonProperty("numeroSufixoCNPJ")
	public String getNumeroSufixoCNPJ() {
		return numeroSufixoCNPJ;
	}

	@JsonProperty("numeroSufixoCNPJ")
	public void setNumeroSufixoCNPJ(String numeroSufixoCNPJ) {
		this.numeroSufixoCNPJ = numeroSufixoCNPJ;
	}

	@JsonProperty("valorLancamentoRemessa")
	public Double getValorLancamentoRemessa() {
		return valorLancamentoRemessa;
	}

	@JsonProperty("valorLancamentoRemessa")
	public void setValorLancamentoRemessa(Double valorLancamentoRemessa) {
		this.valorLancamentoRemessa = valorLancamentoRemessa;
	}

	@JsonProperty("dateLancamentoContaCorrenteCliente")
	public Long getDateLancamentoContaCorrenteCliente() {
		return dateLancamentoContaCorrenteCliente;
	}

	@JsonProperty("dateLancamentoContaCorrenteCliente")
	public void setDateLancamentoContaCorrenteCliente(Long dateLancamentoContaCorrenteCliente) {
		this.dateLancamentoContaCorrenteCliente = dateLancamentoContaCorrenteCliente;
	}

	@JsonProperty("dateEfetivaLancamento")
	public Long getDateEfetivaLancamento() {
		return dateEfetivaLancamento;
	}

	@JsonProperty("dateEfetivaLancamento")
	public void setDateEfetivaLancamento(Long dateEfetivaLancamento) {
		this.dateEfetivaLancamento = dateEfetivaLancamento;
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