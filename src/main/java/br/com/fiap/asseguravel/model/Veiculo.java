package br.com.fiap.asseguravel.model;

import br.com.fiap.pessoa.model.Pessoa;

public class Veiculo {

    private Long id;

    private String chassis;

    private String placa;

    private String modelo;

    private int anoDeFabricacao;

    private String fabricante;

    private Pessoa proprietario;

    public Veiculo() {
    }

    public Veiculo(Long id, String chassis, String placa, String modelo, int anoDeFabricacao, String fabricante, Pessoa proprietario) {
        this.id = id;
        this.chassis = chassis;
        this.placa = placa;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.fabricante = fabricante;
        this.proprietario = proprietario;
    }

    public String getChassis() {
        return chassis;
    }

    public Veiculo setChassis(String chassis) {
        this.chassis = chassis;
        return this;
    }

    public String getPlaca() {
        return placa;
    }

    public Veiculo setPlaca(String placa) {
        this.placa = placa;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public Veiculo setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
        return this;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Veiculo setFabricante(String fabricante) {
        this.fabricante = fabricante;
        return this;
    }


    public Pessoa getProprietario() {
        return proprietario;
    }

    public Veiculo setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Veiculo setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", chassis='" + chassis + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoDeFabricacao=" + anoDeFabricacao +
                ", fabricante='" + fabricante + '\'' +
                ", proprietario=" + proprietario +
                '}';
    }
}
