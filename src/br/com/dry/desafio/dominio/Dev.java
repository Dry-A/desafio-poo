package br.com.dry.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;

    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>() ;
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); //uma unica vez de inscrição

    public void inscreverBootcamp(Bootcamp bootcamp){

        this.conteudosInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void  progredir(){

        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();//quero pegar em ordem

        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
            }else{
            System.err.println("Você não está matriculado em nenhum conteudo!!! MATRICULE-SE");
        }
        System.out.println("--- progrediu! ");
    }

    public double calcularTotalXP(){

        return this.conteudosConcluidos.stream().mapToDouble(conteudo-> conteudo.calcularXp()).sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudosInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudosInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscrito, dev.conteudosInscrito) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscrito, conteudosConcluidos);
    }
}
