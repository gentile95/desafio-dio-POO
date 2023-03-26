import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Linguagem de Programação Orientada a Objetos");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Linguagem multiparadigma");
        curso2.setCargaHoraria(8);

        System.out.println(curso1);
        System.out.println(curso2);


    }
}