import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHorario(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucia = new Dev();
        devLucia.setNome("Lucia");
        devLucia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devLucia.getConteudosInscritos());
        devLucia.progredir();
        devLucia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devLucia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devLucia.getConteudosConcluidos());
        System.out.println("XP!" + devLucia.calcularTotalXp());

        System.out.println("-------");

        Dev devDanilo = new Dev();
        devDanilo.inscreverBootcamp(bootcamp);
        devDanilo.setNome("Danilo");
        System.out.println("Conteudos Inscritos" + devDanilo.getConteudosInscritos());
        devDanilo.progredir();
        devDanilo.progredir();
        devDanilo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devDanilo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devDanilo.getConteudosConcluidos());

        System.out.println("XP!" + devDanilo.calcularTotalXp());



    }

    }



