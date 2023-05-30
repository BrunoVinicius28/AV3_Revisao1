package org.example;

public class Jogo implements Comparable<Jogo> {

    // Atributos do funcionário
    private String nome;
    private Double preco;
    private String genero;

    // Getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(Jogo o) {
        if(this.preco < o.preco)
            return -1;
        else if (this.preco > o.preco)
            return 1;
        else
            return 0;
    }
}
