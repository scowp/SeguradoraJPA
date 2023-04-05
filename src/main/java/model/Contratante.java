package model;

public class Contratante {

    private long id;

    private String nome;

    private String docReceitaFederal;

    public Contratante() {
    }

    public Contratante(long id, String nome, String docReceitaFederal) {
        this.id = id;
        this.nome = nome;
        this.docReceitaFederal = docReceitaFederal;
    }

    public long getId() {
        return id;
    }

    public Contratante setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Contratante setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDocReceitaFederal() {
        return docReceitaFederal;
    }

    public Contratante setDocReceitaFederal(String docReceitaFederal) {
        this.docReceitaFederal = docReceitaFederal;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contratante{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", docReceitaFederal='").append(docReceitaFederal).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
