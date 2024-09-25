package Etapa01;

public class Produto {
    String modelo;
    String marca;
    double precoDeCusto;
    double precoDeVenda;

    // Construtor
    public Produto(String modelo, String marca, double precoDeCusto, double precoDeVenda) {
        this.modelo = modelo;
        this.marca = marca;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
    }

    // Vai servir para calcular o lucro
    public double calcularLucro() {
        return precoDeVenda - precoDeCusto;
    }

    public static void main(String[] args) {
        // cria os objetos do produto 
        Produto produto = new Produto("Computador", "Acer", 1000.00, 1700.00);
        
        // Calcula o lucro
        double lucro = produto.calcularLucro();
        
        System.out.println("O Produto é " + produto.modelo); // Aqui fala qual é o produto
        System.out.println("A marca é " + produto.marca); // A marca do produto
        System.out.println("O Preço de Custo é " + produto.precoDeCusto); // O preco de custo do produto
        System.out.println("O Preço de Venda é " + produto.precoDeVenda); // O preco de venda do produto
        System.out.println("O Lucro do " + produto.modelo + " é: " + lucro); // O resultado do Lucro
    }
}
