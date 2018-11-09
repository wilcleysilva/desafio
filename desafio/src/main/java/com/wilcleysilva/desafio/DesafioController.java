package com.wilcleysilva.desafio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.wilcleysilva.desafio.legado.LancamentoLegado;
import com.wilcleysilva.desafio.legado.ListaControleLancamento;
import com.wilcleysilva.desafio.legado.utils.Util;

@org.springframework.web.bind.annotation.RestController
public class DesafioController {

	@RequestMapping("/extratoLancamento")
	public ListaLancamento lancamentoConta() throws Exception {
		LancamentoLegado dadosLegado = Util.carregarLancamentoDoArquivo();

		List lancamentos = new ArrayList<LancamentoConta>();

		for (ListaControleLancamento controle : dadosLegado.getListaControleLancamento()) {
			LancamentoConta l = new LancamentoConta();

			l.setDtLancamento(controle.getDataLancamentoContaCorrenteCliente());
			l.setDsLancamento(controle.getLancamentoContaCorrenteCliente().getNomeTipoOperacao());
			l.setNuLancamento(controle.getLancamentoContaCorrenteCliente().getNumeroRemessaBanco().toString());
			l.setSiLancamento(controle.getLancamentoContaCorrenteCliente().getNomeSituacaoRemessa());
			l.setDtConfirmLancamento(controle.getDataEfetivaLancamento());
			l.setDadosBancarios(controle.getNomeBanco().trim().toUpperCase() + " Ag "
					+ controle.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario().getNumeroAgencia()
					+ " CC " + controle.getLancamentoContaCorrenteCliente().getDadosDomicilioBancario()
							.getNumeroContaCorrente());
			l.setVlFinal(controle.getValorLancamentoRemessa().toString());

			lancamentos.add(l);
		}

		ListaLancamento retorno = new ListaLancamento();

		retorno.setLancamentosConta(lancamentos);

		return retorno;
	}
}