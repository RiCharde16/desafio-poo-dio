import java.time.LocalDate;
import java.time.Year;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
       
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Descriçâo curso java");
        curso1.setCargaHoraria(8);
       
        Curso curso2 = new Curso();
        curso2.setTitulo("curso Javadcript");
        curso2.setDescricao("Descriçâo curso javascript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println("\n"+curso1);
        System.out.println("\n"+curso2);
        System.out.println("\n"+mentoria);
        
    }
}
