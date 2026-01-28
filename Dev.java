import java.util.HashSet;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosConcluidos = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void concluirConteudo(Conteudo conteudo) {
        conteudosConcluidos.add(conteudo);
    }

    public double calcularTotalXp() {
        return conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }
}
