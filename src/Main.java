import br.com.dio.desafio.dominio.*;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Curso de Java");
        curso.setCargaHoraria(10);

        Curso curso1 = new Curso();
        curso1.setTitulo("Python");
        curso1.setDescricao("Aprenda a programar em Python!");
        curso1.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Ajuda para aprender Java!");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Aprenda a desenvolver em Java!");
        bootcamp1.getConteudos().add(curso);
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreveBootcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("Conteúdos Concluidos Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("XP adquirido: " + devLucas.calcularTotalXP());
        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos Lucas: " + devLucas.getConteudosInscritos());

        System.out.println("");

        Dev devCamila = new Dev();
        devCamila.inscreveBootcamp(bootcamp1);
        devCamila.setNome("Camila");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosInscritos());

        System.out.println("--------------");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());

    }
}