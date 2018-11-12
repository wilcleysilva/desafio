package com.wilcleysilva.desafio.rn;

import java.util.ArrayList;
import java.util.List;

import com.wilcleysilva.desafio.model.ExtratoLancamento;
import com.wilcleysilva.desafio.model.LancamentoConta;
import com.wilcleysilva.desafio.model.legado.DomicilioBancario;
import com.wilcleysilva.desafio.model.legado.LancamentoContaCorrenteCliente;
import com.wilcleysilva.desafio.model.legado.LancamentoLegado;
import com.wilcleysilva.desafio.model.legado.ListaControleLancamento;

public class RNConverterLancamento {

	private static RNConverterLancamento aInstancia;

	private RNConverterLancamento() {

	}

	public static RNConverterLancamento getInstancia() {

		if (aInstancia == null) {
			aInstancia = new RNConverterLancamento();
		}

		return aInstancia;
	}

	public ExtratoLancamento executar(LancamentoLegado pLancamentoLegado) {

		ExtratoLancamento extratoLancamentoRetorno = new ExtratoLancamento();

		List<LancamentoConta> lancamentos = new ArrayList<LancamentoConta>();

		for (ListaControleLancamento controle : pLancamentoLegado.getListaControleLancamento()) {
			LancamentoConta lancamentoConta = montarLancamentoConta(controle);

			lancamentos.add(lancamentoConta);
		}

		extratoLancamentoRetorno.setLancamentosConta(lancamentos);

		return extratoLancamentoRetorno;
	}

	private LancamentoConta montarLancamentoConta(ListaControleLancamento pControleLancamento) {
		LancamentoConta lancamentoContaRetorno = new LancamentoConta();

		if (pControleLancamento != null) {

			lancamentoContaRetorno.setDtLancamento(pControleLancamento.getDtLancamentoContaCorrenteCliente());
			lancamentoContaRetorno.setDtConfirmLancamento(pControleLancamento.getDtEfetivaLancamento());
			lancamentoContaRetorno.setVlFinal(pControleLancamento.getVlLancamentoRemessa().toString());

			LancamentoContaCorrenteCliente lancamentoContaCorrenteCliente = pControleLancamento
					.getLancamentoContaCorrenteCliente();

			if (lancamentoContaCorrenteCliente != null) {

				lancamentoContaRetorno.setDsLancamento(lancamentoContaCorrenteCliente.getNomeTipoOperacao());
				lancamentoContaRetorno
						.setNuLancamento(lancamentoContaCorrenteCliente.getNumeroRemessaBanco().toString());
				lancamentoContaRetorno.setSiLancamento(lancamentoContaCorrenteCliente.getNomeSituacaoRemessa());

				DomicilioBancario domicilioBancario = lancamentoContaCorrenteCliente.getDadosDomicilioBancario();

				if (domicilioBancario != null) {
					String nomeBanco = (pControleLancamento.getNmBanco() != null)
							? pControleLancamento.getNmBanco().trim()
							: "";

					lancamentoContaRetorno
							.setDadosBancarios(nomeBanco.toUpperCase() + " Ag " + domicilioBancario.getNumeroAgencia()
									+ " CC " + domicilioBancario.getNumeroContaCorrente());
				}
			}
		}

		return lancamentoContaRetorno;
	}
}
