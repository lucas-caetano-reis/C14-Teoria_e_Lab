package br.inatel;

public class Jogos {
    private String nome;
    private String dataLancamento;
    private String genero;
    private int duracao;

    public Jogos(String nome, String dataLancamento, String genero, int duracao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
