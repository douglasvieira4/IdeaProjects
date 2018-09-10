package br.com.fatec.time;

public class Jogador {

    private int id;
    private String nome;
    private int idade;
    private double peso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void pesquisar(){
        System.out.println("************");
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Idade do jogador: " + idade);
        System.out.println("Peso do jogador " + peso);
        System.out.println("************");
    }

}
