package br.com.fiap.seguro.model;

import br.com.fiap.pessoa.model.Pessoa;

import java.time.LocalDate;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Seguro {

    private Long id;
    private LocalDate inicioVigencia;
    private LocalDate fimVigencia;
    private Pessoa contratante;
    private Corretor corretor;

    private Set<Pessoa> beneficiarios = new LinkedHashSet<>();

    public Seguro() {
    }

    public Seguro(Long id, LocalDate inicioVigencia, LocalDate fimVigencia, Pessoa contratante, Corretor corretor) {
        this.id = id;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
        this.contratante = contratante;
        this.corretor = corretor;
    }


    public Long getId() {
        return id;
    }

    public Seguro setId(Long id) {
        this.id = id;
        return this;
    }

    public LocalDate getInicioVigencia() {
        return inicioVigencia;
    }

    public Seguro setInicioVigencia(LocalDate inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
        return this;
    }

    public LocalDate getFimVigencia() {
        return fimVigencia;
    }

    public Seguro setFimVigencia(LocalDate fimVigencia) {
        this.fimVigencia = fimVigencia;
        return this;
    }

    public Pessoa getContratante() {
        return contratante;
    }

    public Seguro setContratante(Pessoa contratante) {
        this.contratante = contratante;
        return this;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public Seguro setCorretor(Corretor corretor) {
        this.corretor = corretor;
        return this;
    }


    public Set<Pessoa> getBeneficiarios() {
        return Collections.unmodifiableSet(beneficiarios);
    }

    public Seguro addBeneficiario(Pessoa pessoa) {
        this.beneficiarios.add(pessoa);
        return this;
    }

    public Seguro removeBeneficiario(Pessoa pessoa) {
        this.beneficiarios.remove(pessoa);
        return this;
    }


    @Override
    public String toString() {
        return "Seguro{" +
                "id=" + id +
                ", inicioVigencia=" + inicioVigencia +
                ", fimVigencia=" + fimVigencia +
                ", contratante=" + contratante +
                ", corretor=" + corretor +
                ", beneficiarios=" + beneficiarios +
                '}';
    }
}
