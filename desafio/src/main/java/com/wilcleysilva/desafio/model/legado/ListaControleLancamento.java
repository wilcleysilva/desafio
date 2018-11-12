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
@JsonPropertyOrder({ "lancamentoContaCorrenteCliente", "dataEfetivaLancamento", "dataLancamentoContaCorrenteCliente",
		"numeroEvento", "descricaoGrupoPagamento", "codigoIdentificadorUnico", "nomeBanco",
		"quantidadeLancamentoRemessa", "numeroRaizCNPJ", "numeroSufixoCNPJ", "valorLancamentoRemessa",
		"dateLancamentoContaCorrenteCliente", "dateEfetivaLancamento" })
public class ListaControleLancamento {

	@JsonProperty("lancamentoContaCorrenteCliente")
	private LancamentoContaCorrenteCliente aLancamentoContaCorrenteCliente;

	@JsonProperty("dataEfetivaLancamento")
	private String aDtEfetivaLancamento;

	@JsonProperty("dataLancamentoContaCorrenteCliente")
	private String aDtLancamentoContaCorrenteCliente;

	@JsonProperty("numeroEvento")
	private Long aNuEvento;

	@JsonProperty("descricaoGrupoPagamento")
	private String aDsGrupoPagamento;

	@JsonProperty("codigoIdentificadorUnico")
	private String aCdIdentificadorUnico;

	@JsonProperty("nomeBanco")
	private String aNmBanco;

	@JsonProperty("quantidadeLancamentoRemessa")
	private Long aQtLancamentoRemessa;

	@JsonProperty("numeroRaizCNPJ")
	private String aNuRaizCNPJ;

	@JsonProperty("numeroSufixoCNPJ")
	private String aNuSufixoCNPJ;

	@JsonProperty("valorLancamentoRemessa")
	private Double aVlLancamentoRemessa;

	@JsonIgnore
	private Map<String, Object> aAdditionalProperties = new HashMap<String, Object>();

	@JsonProperty("lancamentoContaCorrenteCliente")
	public LancamentoContaCorrenteCliente getLancamentoContaCorrenteCliente() {
		return aLancamentoContaCorrenteCliente;
	}

	@JsonProperty("lancamentoContaCorrenteCliente")
	public void setLancamentoContaCorrenteCliente(LancamentoContaCorrenteCliente pLancamentoContaCorrenteCliente) {
		this.aLancamentoContaCorrenteCliente = pLancamentoContaCorrenteCliente;
	}

	@JsonProperty("dataEfetivaLancamento")
	public String getDtEfetivaLancamento() {
		return aDtEfetivaLancamento;
	}

	@JsonProperty("dataEfetivaLancamento")
	public void setDtEfetivaLancamento(String pDtEfetivaLancamento) {
		this.aDtEfetivaLancamento = pDtEfetivaLancamento;
	}

	@JsonProperty("dataLancamentoContaCorrenteCliente")
	public String getDtLancamentoContaCorrenteCliente() {
		return aDtLancamentoContaCorrenteCliente;
	}

	@JsonProperty("dataLancamentoContaCorrenteCliente")
	public void setDtLancamentoContaCorrenteCliente(String pDtLancamentoContaCorrenteCliente) {
		this.aDtLancamentoContaCorrenteCliente = pDtLancamentoContaCorrenteCliente;
	}

	@JsonProperty("numeroEvento")
	public Long getNuEvento() {
		return aNuEvento;
	}

	@JsonProperty("numeroEvento")
	public void setNuEvento(Long pNuEvento) {
		this.aNuEvento = pNuEvento;
	}

	@JsonProperty("descricaoGrupoPagamento")
	public String getDsGrupoPagamento() {
		return aDsGrupoPagamento;
	}

	@JsonProperty("descricaoGrupoPagamento")
	public void setDsGrupoPagamento(String pDsGrupoPagamento) {
		this.aDsGrupoPagamento = pDsGrupoPagamento;
	}

	@JsonProperty("codigoIdentificadorUnico")
	public String getCdIdentificadorUnico() {
		return aCdIdentificadorUnico;
	}

	@JsonProperty("codigoIdentificadorUnico")
	public void setCdIdentificadorUnico(String pCdIdentificadorUnico) {
		this.aCdIdentificadorUnico = pCdIdentificadorUnico;
	}

	@JsonProperty("nomeBanco")
	public String getNmBanco() {
		return aNmBanco;
	}

	@JsonProperty("nomeBanco")
	public void setNmBanco(String pNmBanco) {
		this.aNmBanco = pNmBanco;
	}

	@JsonProperty("quantidadeLancamentoRemessa")
	public Long getQtLancamentoRemessa() {
		return aQtLancamentoRemessa;
	}

	@JsonProperty("quantidadeLancamentoRemessa")
	public void setQtLancamentoRemessa(Long pQtGrupoPagamento) {
		this.aQtLancamentoRemessa = pQtGrupoPagamento;
	}

	@JsonProperty("numeroRaizCNPJ")
	public String getNuRaizCNPJ() {
		return aNuRaizCNPJ;
	}

	@JsonProperty("numeroRaizCNPJ")
	public void setNuRaizCNPJ(String pNuRaizCNPJ) {
		this.aNuRaizCNPJ = pNuRaizCNPJ;
	}

	@JsonProperty("numeroSufixoCNPJ")
	public String getNuSufixoCNPJ() {
		return aNuSufixoCNPJ;
	}

	@JsonProperty("numeroSufixoCNPJ")
	public void setNuSufixoCNPJ(String pNuSufixoCNPJ) {
		this.aNuSufixoCNPJ = pNuSufixoCNPJ;
	}

	@JsonProperty("valorLancamentoRemessa")
	public Double getVlLancamentoRemessa() {
		return aVlLancamentoRemessa;
	}

	@JsonProperty("valorLancamentoRemessa")
	public void setVlLancamentoRemessa(Double pVlLancamentoRemessa) {
		this.aVlLancamentoRemessa = pVlLancamentoRemessa;
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