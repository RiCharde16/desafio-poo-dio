import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
       
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descriçâo curso java");
        curso1.setCargaHoraria(8);
       
        Curso curso2 = new Curso();
        curso2.setTitulo("curso Javascript");
        curso2.setDescricao("Descriçâo curso javascript");
        curso2.setCargaHoraria(10);

        // Polimorfismo
        // Conteudo conteudo = new Curso(); // Tudo que tem em conteudo tem em curso
        // MAS nem tudo que tem em curso tem em conteudo;

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println("\n"+curso1);
        // System.out.println("\n"+curso2);
        // System.out.println("\n"+mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRichard = new Dev();
        devRichard.setNome("Richard");
        devRichard.inscreverBootcamp(bootcamp);
        System.out.println("\nContéudos Inscritos Richard: "+ devRichard.getConteudosInscritos());
        devRichard.progredir();
        devRichard.progredir();
        System.out.println("-");
        System.out.println("\nContéudos Concluidos Richard: "+ devRichard.getConteudosConcluidos());
        System.out.println("\nContéudos Inscritos Richard: "+ devRichard.getConteudosInscritos());
        System.out.println("XP: "+ devRichard.calcularTotalXp());
        
        System.out.println("-------------------------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\nContéudos Inscritos João: "+ devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("\nContéudos Concluidos João: "+ devJoao.getConteudosConcluidos());
        System.out.println("\nContéudos Inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("XP: "+ devJoao.calcularTotalXp());
        
        
    }
}
