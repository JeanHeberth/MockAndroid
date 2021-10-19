package br.com.alura.leilao.ui.recyclerview.adapter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import br.com.alura.leilao.model.Leilao;

public class ListaLeilaoAdapterTest {

    @Test
    public void deveAtulizarListaDeLeiloesQuandoReceberListaDeLeioloes(){

        ListaLeilaoAdapter adapter = new ListaLeilaoAdapter(null);

        adapter.atualiza(new ArrayList<>(Arrays.asList(
                new Leilao("Casa"),
                new Leilao("Carro"),
                new Leilao("Moto")
                )));

        int quantidadeDeLeiloesDevolvida = adapter.getItemCount();
        assertThat(quantidadeDeLeiloesDevolvida, is(3));

    }

}