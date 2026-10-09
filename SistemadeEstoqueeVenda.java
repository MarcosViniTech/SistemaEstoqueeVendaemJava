import java.util.Scanner;

class Produto {
    private Long id;
    private String nome;
    private double precoUnitario;
    private int quantidadeEstoque;
    
    public Produto(Long id, String nome, double precoUnitario, int quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public double getPrecoUnitario() { return precoUnitario; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    
    public void setQuantidadeEstoque(int novaQuantidade) {
        this.quantidadeEstoque = novaQuantidade;
    }
}

class VendaService {
    
    public String realizarVenda(Produto produto, int quantidadeDesejada) {
        
        if (produto == null) {
            return "Erro: Produto não encontrado no sistema.";
        }
        
        if (produto.getQuantidadeEstoque() < quantidadeDesejada) {
            return "Erro: Estoque insuficiente. Restam apenas "
            + produto.getQuantidadeEstoque() + " unidades de " + produto.getNome() + ".";
        }
        
        double valorTotal = quantidadeDesejada * produto.getPrecoUnitario();
        
        int novoEstoque = produto.getQuantidadeEstoque() - quantidadeDesejada;
        produto.setQuantidadeEstoque(novoEstoque);
        
        return "Venda concluída com sucesso!"
        + "\nProduto: " + produto.getNome()
        + "\nQuantidade Vendida: " + quantidadeDesejada
        + "\nValor Total: R$ " + valorTotal
        + "\nEstoque Atualizado: " + produto.getQuantidadeEstoque() + " unidades.";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Produto notebook = new Produto(1L, "Notebook Dell", 3500.00, 10);
        VendaService vendaService = new VendaService();

        System.out.println("=== SISTEMA DE VENDAS E ESTOQUE ===");
        System.out.println("Produto: " + notebook.getNome());
        System.out.println("Preço: R$ " + notebook.getPrecoUnitario());
        System.out.println("Estoque atual: " + notebook.getQuantidadeEstoque() + " unidades\n");

        System.out.print("Digite a quantidade que deseja comprar: ");
        int quantidadeDigitada = scanner.nextInt();

        String resultado = vendaService.realizarVenda(notebook, quantidadeDigitada);
        
        System.out.println("\n--- RESULTADO DA OPERAÇÃO ---");
        System.out.println(resultado);

        scanner.close();
    }
}