package br.com.senac.defesa.model;

import java.util.List;

public class MaisProximo extends RegraDeAlvo {

    @Override
    public Inimigo escolher(Ponto posicaoDaTorre, List<Inimigo> candidatos) {
        Inimigo escolhido = null;
        double menorDistancia = Double.MAX_VALUE;
        for (Inimigo candidato : candidatos) {
            double distancia = posicaoDaTorre.distanciaAte(candidato.getPosicao());
            if (distancia < menorDistancia) {
                menorDistancia = distancia;
                escolhido = candidato;
            }
        }
        return escolhido;
    }

    @Override
    public String getNome() {
        return "PROXIMO";
    }
}