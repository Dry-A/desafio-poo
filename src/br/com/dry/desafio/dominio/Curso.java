package br.com.dry.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){

    }

    public int getCargaHoroaria() {
        return cargaHoraria;
    }

    public void setCargaHoroaria(int cargaHoroaria) {
        this.cargaHoraria = cargaHoroaria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoroaria=" + cargaHoraria +
                '}';
    }
}
