package com.wilcleysilva.desafio;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DesafioApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Test
	public void contextLoads() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/extratoLancamento")
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("{\"listaLancamentos\":[{"
						+ "\"dataLancamento\":\"03/06/2016\",\"descricao\":\"regular\",\"numero\":\"64320236054\","
						+ "\"situacao\":\"Pago\",\"dataConfirmacao\":\"03/06/2016\","
						+ "\"dadosBancarios\":\"BANCO ABCD S.A. Ag 1 CC 00000000065470\",\"valorFinal\":\"11499.1\"},"
						+ "{\"dataLancamento\":\"02/06/2016\",\"descricao\":\"regular\",\"numero\":\"64320626054\","
						+ "\"situacao\":\"Pago\",\"dataConfirmacao\":\"02/06/2016\","
						+ "\"dadosBancarios\":\"BANCO ABCD S.A. Ag 1 CC 00000000065470\",\"valorFinal\":\"1960.0\"}]}")))
				;
	}

}
