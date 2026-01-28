public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Java POO");
        curso.setDescricao("Aprendendo Programação Orientada a Objetos");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Tirando dúvidas sobre POO");

        Dev dev = new Dev();
        dev.setNome("Miguel");

        dev.concluirConteudo(curso);
        dev.concluirConteudo(mentoria);

        System.out.println("Dev: " + dev.getNome());
        System.out.println("XP Total: " + dev.calcularTotalXp());
    }
}
