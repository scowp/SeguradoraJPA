package model;

import java.time.LocalDate;

public class Seguro {

    private long id;

    private LocalDate inicioVigencia;

    private LocalDate fimVigencia;

    private TipoSeguro tipo;

    private Contratante contratante;

    private Corretor corretor;

    public Seguro() {
    }

    public Seguro(long id, LocalDate inicioVigencia, LocalDate fimVigencia, TipoSeguro tipo, Contratante contratante, Corretor corretor) {
        this.id = id;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
        this.tipo = tipo;
        this.contratante = contratante;
        this.corretor = corretor;
    }


    public long getId() {
        return id;
    }

    public Seguro setId(long id) {
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

    public TipoSeguro getTipo() {
        return tipo;
    }

    public Seguro setTipo(TipoSeguro tipo) {
        this.tipo = tipo;
        return this;
    }

    public Contratante getContratante() {
        return contratante;
    }

    public Seguro setContratante(Contratante contratante) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Seguro{");
        sb.append("id=").append(id);
        sb.append(", inicioVigencia=").append(inicioVigencia);
        sb.append(", fimVigencia=").append(fimVigencia);
        sb.append(", tipo=").append(tipo);
        sb.append(", contratante=").append(contratante);
        sb.append(", corretor=").append(corretor);
        sb.append('}');
        return sb.toString();
    }
}
