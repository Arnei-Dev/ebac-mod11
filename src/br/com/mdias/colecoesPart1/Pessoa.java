package br.com.mdias.colecoesPart1;

abstract class Pessoa {
    private String nome;
    private Character sexo;

//    public Pessoa(String nome, Character sexo) {
//        this.nome = nome;
//        this.sexo = sexo;
//    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

//    public void filtrarPessoa(){
//        if (this.getSexo().equals('M')){
//
//        }
//    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                '}'+"\n";
    }
}
