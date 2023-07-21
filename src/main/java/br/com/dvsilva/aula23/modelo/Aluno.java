package br.com.dvsilva.aula23.modelo;

public class Aluno {

    private String nome;
    private Double nota;
    private char sexo;
    private int idade;
    private boolean ativo;

    public Aluno(String nome, Double nota, char sexo, int idade, boolean ativo) {
        this.nome = nome;
        this.nota = nota;
        this.sexo = sexo;
        this.idade = idade;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isInativo(){
        return !ativo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", sexo=" + sexo +
                ", idade=" + idade +
                ", ativo=" + ativo +
                '}';
    }
}
