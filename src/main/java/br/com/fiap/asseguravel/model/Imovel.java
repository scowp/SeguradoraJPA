package br.com.fiap.asseguravel.model;

import br.com.fiap.pessoa.model.Pessoa;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Imovel {

    private int qtdQuartos;

    private int qtdBanheiros;

    private int intQtdVagasDeGaragem;

    private String numeroRegistroNoCartorio;

    protected Set<Pessoa> proprietarios = new LinkedHashSet<>();


    public Imovel() {
    }

    public Imovel(int qtdQuartos, int qtdBanheiros, int intQtdVagasDeGaragem, String numeroRegistroNoCartorio) {
        this.qtdQuartos = qtdQuartos;
        this.qtdBanheiros = qtdBanheiros;
        this.intQtdVagasDeGaragem = intQtdVagasDeGaragem;
        this.numeroRegistroNoCartorio = numeroRegistroNoCartorio;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public Imovel setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
        return this;
    }

    public int getQtdBanheiros() {
        return qtdBanheiros;
    }

    public Imovel setQtdBanheiros(int qtdBanheiros) {
        this.qtdBanheiros = qtdBanheiros;
        return this;
    }

    public int getIntQtdVagasDeGaragem() {
        return intQtdVagasDeGaragem;
    }

    public Imovel setIntQtdVagasDeGaragem(int intQtdVagasDeGaragem) {
        this.intQtdVagasDeGaragem = intQtdVagasDeGaragem;
        return this;
    }

    public String getNumeroRegistroNoCartorio() {
        return numeroRegistroNoCartorio;
    }

    public Imovel setNumeroRegistroNoCartorio(String numeroRegistroNoCartorio) {
        this.numeroRegistroNoCartorio = numeroRegistroNoCartorio;
        return this;
    }


    public Set<Pessoa> getProprietarios() {
        return Collections.unmodifiableSet(proprietarios);
    }


    public Imovel addProprietario(Pessoa pessoa) {
        this.proprietarios.add(pessoa);
        return this;
    }


    public Imovel removerProprietario(Pessoa pessoa) {
        this.proprietarios.remove(pessoa);
        return this;
    }


    @Override
    public String toString() {
        return "Imovel{" +
                "qtdQuartos=" + qtdQuartos +
                ", qtdBanheiros=" + qtdBanheiros +
                ", intQtdVagasDeGaragem=" + intQtdVagasDeGaragem +
                ", numeroRegistroNoCartorio='" + numeroRegistroNoCartorio + '\'' +
                ", proprietarios=" + proprietarios +
                '}';
    }
}
