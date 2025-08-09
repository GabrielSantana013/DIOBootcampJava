import domain.Bootcamp;
import domain.Curso;
import domain.Dev;
import domain.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso course = new Curso();
        course.setTitle("Curso Java");
        course.setDescription("Descrição Curso Java");
        course.setWorkLoad(10);

        Curso course2 = new Curso();
        course2.setTitle("Curso Python");
        course2.setDescription("Descrição Curso Python");
        course2.setWorkLoad(20);

        Mentoria mentoring = new Mentoria();
//      DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        mentoring.setTitle("Mentoria Java");
        mentoring.setDescription("Descrição Mentoria Java");
        mentoring.setDate(LocalDate.now());

        /*System.out.println(course);
        System.out.println(course2);
        System.out.println(mentoring);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Dev");
        bootcamp.setDescription("Descrição bootcamp Java");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev devGabriel = new Dev();
        devGabriel.setName("Gabriel");
        devGabriel.bootcampApply(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devGabriel.getSubscribedContents());
        System.out.println("-");
        devGabriel.progress();
        System.out.println("Conteúdos Inscritos: " + devGabriel.getSubscribedContents());
        System.out.println("Conteúdos Concluidos: " + devGabriel.getFinishedContents());
        System.out.println("XP: " + devGabriel.calcTotalXp());

        System.out.println("==========================");

        Dev devJoao = new Dev();
        devJoao.setName("Joao");
        devJoao.bootcampApply(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devJoao.getSubscribedContents());
        System.out.println("-");
        devJoao.progress();
        devJoao.progress();
        devJoao.progress();
        System.out.println("Conteúdos Inscritos: " + devJoao.getSubscribedContents());
        System.out.println("Conteúdos Concluidos: " + devJoao.getFinishedContents());
        System.out.println("XP: " + devJoao.calcTotalXp());


    }
}
