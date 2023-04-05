package model;

public class Corretor {

    private long id;

    private String nome;

    private String numeroSUSEP;


    public Corretor() {
    }

    public Corretor(long id, String nome, String numeroSUSEP) {
        this.id = id;
        this.nome = nome;
        this.numeroSUSEP = numeroSUSEP;
    }

    public long getId() {
        return id;
    }

    public Corretor setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Corretor setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumeroSUSEP() {
        return numeroSUSEP;
    }

    public Corretor setNumeroSUSEP(String numeroSUSEP) {
        this.numeroSUSEP = numeroSUSEP;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Corretor{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", numeroSUSEP='").append(numeroSUSEP).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
