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
@JsonPropertyOrder({ "numeroRemessaBanco", "nomeSituacaoRemessa", "dadosDomicilioBancario", "nomeTipoOperacao",
		"dadosAnaliticoLancamentoFinanceiroCliente" })
public class LancamentoContaCorrenteCliente {

	@JsonProperty("numeroRemessaBanco")
	private Long aNuRemessaBanco;
	
	@JsonProperty("nomeSituacaoRemessa")
	private String aNmSituacaoRemessa;
	
	@JsonProperty("dadosDomicilioBancario")
	private DomicilioBancario aDadosDomicilioBancario;
	
	@JsonProperty("nomeTipoOperacao")
	private String aNmTipoOperacao;
	
	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	private List<Object> aDadosAnaliticoLancamentoFinanceiroCliente = null;
	
	@JsonIgnore
	private Map<String, Object> aAdditionalProperties = new HashMap<String, Object>();

	@JsonProperty("numeroRemessaBanco")
	public Long getNumeroRemessaBanco() {
		return aNuRemessaBanco;
	}

	@JsonProperty("numeroRemessaBanco")
	public void setNumeroRemessaBanco(Long pNuRemessaBanco) {
		this.aNuRemessaBanco = pNuRemessaBanco;
	}

	@JsonProperty("nomeSituacaoRemessa")
	public String getNomeSituacaoRemessa() {
		return aNmSituacaoRemessa;
	}

	@JsonProperty("nomeSituacaoRemessa")
	public void setNomeSituacaoRemessa(String pNmSituacaoRemessa) {
		this.aNmSituacaoRemessa = pNmSituacaoRemessa;
	}

	@JsonProperty("dadosDomicilioBancario")
	public DomicilioBancario getDadosDomicilioBancario() {
		return aDadosDomicilioBancario;
	}

	@JsonProperty("dadosDomicilioBancario")
	public void setDadosDomicilioBancario(DomicilioBancario pDadosDomicilioBancario) {
		this.aDadosDomicilioBancario = pDadosDomicilioBancario;
	}

	@JsonProperty("nomeTipoOperacao")
	public String getNomeTipoOperacao() {
		return aNmTipoOperacao;
	}

	@JsonProperty("nomeTipoOperacao")
	public void setNomeTipoOperacao(String pNmTipoOperacao) {
		this.aNmTipoOperacao = pNmTipoOperacao;
	}

	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	public List<Object> getDadosAnaliticoLancamentoFinanceiroCliente() {
		return aDadosAnaliticoLancamentoFinanceiroCliente;
	}

	@JsonProperty("dadosAnaliticoLancamentoFinanceiroCliente")
	public void setDadosAnaliticoLancamentoFinanceiroCliente(List<Object> pDadosAnaliticoLancamentoFinanceiroCliente) {
		this.aDadosAnaliticoLancamentoFinanceiroCliente = pDadosAnaliticoLancamentoFinanceiroCliente;
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
