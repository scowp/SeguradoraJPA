package br.com.fiap.seguro.model;

import br.com.fiap.pessoa.model.Pessoa;

public class Corretor {

    private Long id;

    private String numeroSUSEP;

    private Pessoa pessoa;


    public Corretor() {
    }

    public Corretor(long id, String numeroSUSEP, Pessoa pessoa) {
        this.id = id;
        this.numeroSUSEP = numeroSUSEP;
        this.pessoa = pessoa;
    }

    public long getId() {
        return id;
    }

    public Corretor setId(long id) {
        this.id = id;
        return this;
    }

    public String getNumeroSUSEP() {
        return numeroSUSEP;
    }

    public Corretor setNumeroSUSEP(String numeroSUSEP) {
        this.numeroSUSEP = numeroSUSEP;
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Corretor setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Corretor{" +
                "id=" + id +
                ", numeroSUSEP='" + numeroSUSEP + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
