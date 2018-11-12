package com.wilcleysilva.desafio.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.ALWAYS)
@JsonPropertyOrder({ "dataLancamento", "descricao", "numero", "situacao", "dataConfirmacao", "dadosBancarios",
		"valorFinal" })
public class LancamentoConta {

	@JsonProperty("dataLancamento")
	private String aDtLancamento;

	@JsonProperty("descricao")
	private String aDsLancamento;

	@JsonProperty("numero")
	private String aNuLancamento;

	@JsonProperty("situacao")
	private String aSiLancamento;

	@JsonProperty("dataConfirmacao")
	private String aDtConfirmLancamento;

	@JsonProperty("dadosBancarios")
	private String aDadosBancarios;

	@JsonProperty("valorFinal")
	private String aVlFinal;

	@JsonProperty("dataLancamento")
	public String getDtLancamento() {
		return aDtLancamento;
	}
	
	@JsonProperty("dataLancamento")
	public void setDtLancamento(String pDtLancamento) {
		this.aDtLancamento = pDtLancamento;
	}

	@JsonProperty("descricao")
	public String getDsLancamento() {
		return aDsLancamento;
	}

	@JsonProperty("descricao")
	public void setDsLancamento(String pDsLancamento) {
		this.aDsLancamento = pDsLancamento;
	}

	@JsonProperty("numero")
	public String getNuLancamento() {
		return aNuLancamento;
	}

	@JsonProperty("numero")
	public void setNuLancamento(String pNuLancamento) {
		this.aNuLancamento = pNuLancamento;
	}

	@JsonProperty("situacao")
	public String getSiLancamento() {
		return aSiLancamento;
	}

	@JsonProperty("situacao")
	public void setSiLancamento(String pSiLancamento) {
		this.aSiLancamento = pSiLancamento;
	}

	@JsonProperty("dataConfirmacao")
	public String getDtConfirmLancamento() {
		return aDtConfirmLancamento;
	}

	@JsonProperty("dataConfirmacao")
	public void setDtConfirmLancamento(String pDtConfirmLancamento) {
		this.aDtConfirmLancamento = pDtConfirmLancamento;
	}
	
	@JsonProperty("dadosBancarios")
	public String getDadosBancarios() {
		return aDadosBancarios;
	}

	@JsonProperty("dadosBancarios")
	public void setDadosBancarios(String pDadosBancarios) {
		this.aDadosBancarios = pDadosBancarios;
	}

	@JsonProperty("valorFinal")
	public String getVlFinal() {
		return aVlFinal;
	}

	@JsonProperty("valorFinal")
	public void setVlFinal(String pVlFinal) {
		this.aVlFinal = pVlFinal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aDadosBancarios == null) ? 0 : aDadosBancarios.hashCode());
		result = prime * result + ((aDsLancamento == null) ? 0 : aDsLancamento.hashCode());
		result = prime * result + ((aDtConfirmLancamento == null) ? 0 : aDtConfirmLancamento.hashCode());
		result = prime * result + ((aDtLancamento == null) ? 0 : aDtLancamento.hashCode());
		result = prime * result + ((aNuLancamento == null) ? 0 : aNuLancamento.hashCode());
		result = prime * result + ((aSiLancamento == null) ? 0 : aSiLancamento.hashCode());
		result = prime * result + ((aVlFinal == null) ? 0 : aVlFinal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LancamentoConta other = (LancamentoConta) obj;
		if (aDadosBancarios == null) {
			if (other.aDadosBancarios != null)
				return false;
		} else if (!aDadosBancarios.equals(other.aDadosBancarios))
			return false;
		if (aDsLancamento == null) {
			if (other.aDsLancamento != null)
				return false;
		} else if (!aDsLancamento.equals(other.aDsLancamento))
			return false;
		if (aDtConfirmLancamento == null) {
			if (other.aDtConfirmLancamento != null)
				return false;
		} else if (!aDtConfirmLancamento.equals(other.aDtConfirmLancamento))
			return false;
		if (aDtLancamento == null) {
			if (other.aDtLancamento != null)
				return false;
		} else if (!aDtLancamento.equals(other.aDtLancamento))
			return false;
		if (aNuLancamento == null) {
			if (other.aNuLancamento != null)
				return false;
		} else if (!aNuLancamento.equals(other.aNuLancamento))
			return false;
		if (aSiLancamento == null) {
			if (other.aSiLancamento != null)
				return false;
		} else if (!aSiLancamento.equals(other.aSiLancamento))
			return false;
		if (aVlFinal == null) {
			if (other.aVlFinal != null)
				return false;
		} else if (!aVlFinal.equals(other.aVlFinal))
			return false;
		return true;
	}

	
}
