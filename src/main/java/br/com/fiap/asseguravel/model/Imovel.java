package br.com.fiap.asseguravel.model;

import br.com.fiap.pessoa.model.Pessoa;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Imovel {


    private Long id;

    private int qtdQuartos;

    private int qtdBanheiros;

    private int qtdVagasDeGaragem;

    private String numeroRegistroNoCartorio;

    protected Set<Pessoa> proprietarios = new LinkedHashSet<>();


    public Imovel() {
    }


    public Imovel(Long id, int qtdQuartos, int qtdBanheiros, int qtdVagasDeGaragem, String numeroRegistroNoCartorio, Set<Pessoa> proprietarios) {
        this.id = id;
        this.qtdQuartos = qtdQuartos;
        this.qtdBanheiros = qtdBanheiros;
        this.qtdVagasDeGaragem = qtdVagasDeGaragem;
        this.numeroRegistroNoCartorio = numeroRegistroNoCartorio;
        this.proprietarios = proprietarios;
    }

    public Long getId() {
        return id;
    }

    public Imovel setId(Long id) {
        this.id = id;
        return this;
    }

    public int getQtdVagasDeGaragem() {
        return qtdVagasDeGaragem;
    }

    public Imovel setQtdVagasDeGaragem(int qtdVagasDeGaragem) {
        this.qtdVagasDeGaragem = qtdVagasDeGaragem;
        return this;
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
                "id=" + id +
                ", qtdQuartos=" + qtdQuartos +
                ", qtdBanheiros=" + qtdBanheiros +
                ", qtdVagasDeGaragem=" + qtdVagasDeGaragem +
                ", numeroRegistroNoCartorio='" + numeroRegistroNoCartorio + '\'' +
                ", proprietarios=" + proprietarios +
                '}';
    }
}
