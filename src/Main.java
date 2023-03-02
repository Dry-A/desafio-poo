import br.com.dry.desafio.dominio.*;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //herança
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoroaria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Python");
        curso2.setDescricao("descrição curso Python");
        curso2.setCargaHoroaria(40);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria para Java");
        mentoria1.setDescricao("Descrição da Mentoria para Java");
        mentoria1.setData(LocalDate.now());

        //polimorfismo
        Conteudo conteudo = new Curso();
        Conteudo conteudo2 = new Mentoria();

        //List<String> palavras = new ArrayList<>();

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Java Developer");
        bootcamp1.setDescricao("Descrição do bootcamp Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Audrey");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Audrey "+ dev1.getConteudoInscrito());


        dev1.progredir();
        System.out.println("Conteudos Inscritos Audrey "+ dev1.getConteudoInscrito());

        dev1.progredir();
        System.out.println("Conteudos Inscritos Audrey "+ dev1.getConteudoInscrito());

        System.out.println("**********************");
        System.out.println("Conteudos concluidos Audrey "+ dev1.getConteudosConcluidos());
        System.out.println("**********************");
        System.out.println("conteudos inscritos Audrey "+ dev1.getConteudoInscrito());
        System.out.println("Total XP Audrey -> "+ dev1.calcularTotalXP());



        Dev dev2 = new Dev();
        dev2.setNome("Helena");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Helena "+ dev2.getConteudoInscrito());
        System.out.println("Conteudos concluidos Helena "+ dev2.getConteudosConcluidos());
        System.out.println("Total XP -> "+ dev2.calcularTotalXP());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.calcularTotalXP();
        System.out.println("Total XP Helena -> "+ dev2.calcularTotalXP());
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/
    }


}