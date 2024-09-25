package Etapa01;

public class Pessoas {
    String nomeCompleto;
    double altura;
    String dataDeNascimento;
    String email;

    // Construtor que inicializa os campos e gera o email automaticamente
    public Pessoas(String nomeCompleto, double altura, String dataDeNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.altura = altura;
        this.dataDeNascimento = dataDeNascimento;
        this.email = formatoEmail();  // Chama o método para gerar o email
    }

    // Método para gerar o email automaticamente no formato "nome.sobrenome@dominio"
    private String formatoEmail() {
        String[] nomes = this.nomeCompleto.split(" ");
        return nomes[0] + "." + nomes[nomes.length - 1] + "@dominio"; // Corrigido: removido espaço extra
    }

    public static void main(String[] args) {
        // Criação do objeto da classe Pessoas
        Pessoas pessoa = new Pessoas("Jefferson Oliveira", 1.80, "07/12/2005");
        
        // Exibindo as informações da pessoa
        System.out.println("Nome completo: " + pessoa.nomeCompleto); // Exibe o nome completo
        System.out.println("Altura: " + pessoa.altura); // Mostra a altura
        System.out.println("Data de nascimento: " + pessoa.dataDeNascimento); // Mostra a data de nascimento
        System.out.println("Email: " + pessoa.email); // Exibe o email gerado
    }
}


//Crie uma classe para representar pessoas.
//O construtor da classe deve receber como parâmetros o nome completo, altura e a data de nascimento.
//Os objetos, logo após criados, devem criar automaticamente um email no formato nome.sobrenome@dominio