package model;

public class TipoSeguro {

    private long id;

    private String nome;

    public TipoSeguro() {
    }

    public TipoSeguro(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public TipoSeguro setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoSeguro setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TipoSeguro{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
