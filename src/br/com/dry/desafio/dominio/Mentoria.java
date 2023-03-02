package br.com.dry.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

   private LocalDate data;

   public Mentoria(){

   }

   //é obrigatorio a implementação do metodo da classe abstrata (Sobrescrita)
    @Override
    public double calcularXp() {

        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +  //acessandro ao atributo pelo metodo
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
