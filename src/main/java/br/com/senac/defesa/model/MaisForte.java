package br.com.senac.defesa.model;

import java.util.List;

public class MaisForte extends RegraDeAlvo {

    @Override
    public Inimigo escolher(Ponto posicaoDaTorre, List<Inimigo> candidatos) {
        Inimigo escolhido = null;
        int maiorVida = -1;
        for (Inimigo candidato : candidatos) {
            if (candidato.getVida() > maiorVida) {
                maiorVida = candidato.getVida();
                escolhido = candidato;
            }
        }
        return escolhido;
    }

    @Override
    public String getNome() {
        return "FORTE";
    }
}