package br.com.senac.defesa.model;

import java.util.List;

public class MaisAvancado extends RegraDeAlvo {

    @Override
    public Inimigo escolher(Ponto posicaoDaTorre, List<Inimigo> candidatos) {
        Inimigo escolhido = null;
        double maisAvancado = -1;
        for (Inimigo candidato : candidatos) {
            if (candidato.getPercorrido() > maisAvancado) {
                maisAvancado = candidato.getPercorrido();
                escolhido = candidato;
            }
        }
        return escolhido;
    }

    @Override
    public String getNome() {
        return "AVANCADO";
    }
}