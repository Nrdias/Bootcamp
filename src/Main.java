import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Dev;
import br.com.dio.challenge.domain.Mentoring;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Dev devNatan = new Dev();
        devNatan.setName("Natan");

        Dev devDias = new Dev();
        devDias.setName("Dias");


        Course poo = new Course();
        poo.setTitle("Programação Orientada a Objetos");
        poo.setDescription("Aprenda a como programar em Java");
        poo.setWorkload(20);

        Course collections = new Course();
        collections.setTitle("Framework Collections");
        collections.setDescription("Aprenda a utilizar o framework Collections");
        collections.setWorkload(15);

        Mentoring linkedin = new Mentoring();
        linkedin.setTitle("Melhorando seu Linkedin");
        linkedin.setDate(LocalDate.now());
        linkedin.setDescription("Aprenda a como tornar seu Linkedin mais atrativo");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setTitle("Formação Java Iniciante");
        bootcamp.setDescription("Aprenda Orientação a Objetos com Java");
        bootcamp.getContents().add(poo);
        bootcamp.getContents().add(collections);
        bootcamp.getContents().add(linkedin);
        devDias.bootcampSubscribe(bootcamp);
        devNatan.bootcampSubscribe(bootcamp);

        System.out.println("Conteúdos de Natan: " + devNatan.getSubscribedContents());
        System.out.println("Conteúdos finalizados de Natan: " + devNatan.getFinishedContents());
        System.out.println(devNatan.xpCalculateTotal());
        System.out.println("--");
        System.out.println("Conteúdos de Dias: " + devDias.getSubscribedContents());
        System.out.println("Conteúdos finalizados de Dias: " + devDias.getFinishedContents());
        System.out.println(devDias.xpCalculateTotal());
        System.out.println("--");
        devNatan.progress();
        devDias.progress();
        System.out.println("Conteúdos de Natan: " + devNatan.getSubscribedContents());
        System.out.println("Conteúdos finalizados de Natan: " + devNatan.getFinishedContents());
        System.out.println(devNatan.xpCalculateTotal());
        System.out.println("--");
        System.out.println("Conteúdos de Dias: " + devDias.getSubscribedContents());
        System.out.println("Conteúdos finalizados de Dias: " + devDias.getFinishedContents());
        System.out.println(devDias.xpCalculateTotal());
        System.out.println("--");
        devNatan.progress();
        devDias.progress();
        System.out.println("Conteúdos de Natan: " + devNatan.getSubscribedContents());
        System.out.println("Conteúdos finalizados de Natan: " + devNatan.getFinishedContents());
        System.out.println(devNatan.xpCalculateTotal());
        System.out.println("--");
        System.out.println("Conteúdos de Dias: " + devDias.getSubscribedContents());
        System.out.println("Conteúdos finalizados de Dias: " + devDias.getFinishedContents());
        System.out.println(devDias.xpCalculateTotal());
        System.out.println("--");
        devNatan.progress();
        devDias.progress();
        System.out.println("Conteúdos de Natan: " + devNatan.getSubscribedContents());
        System.out.println("Conteúdos finalizados de Natan: " + devNatan.getFinishedContents());
        System.out.println(devNatan.xpCalculateTotal());
        System.out.println("--");
        System.out.println("Conteúdos de Dias: " + devDias.getSubscribedContents());
        System.out.println("Conteúdos finalizados de Dias: " + devDias.getFinishedContents());
        System.out.println(devDias.xpCalculateTotal());





    }
}