/* *Aluno: Ana Clara – Matrícula: 20220006250
   *Aluno: Gleice Heloise – Matrícula: 20220070860
 */

// Classe Imovel
public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Preço: R$" + preco);
    }
}

class Novo extends Imovel {
    private double adicional;

    public Novo(String endereco, double preco, double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Adicional: R$" + adicional);
    }
}

class Velho extends Imovel {
    private double desconto;

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Desconto: R$" + desconto);
    }
}

// classe de teste
class TesteImovel {
    public static void main(String[] args) {
        Imovel casa = new Imovel("Rua A, 123", 100000.0);
        Velho predio = new Velho("Rua B, 456", 80000.0, 5000.0);
        Novo ap = new Novo("Rua C, 789", 120000.0, 10000.0);

        casa.exibirInformacoes();
        predio.exibirInformacoes();
        ap.exibirInformacoes();
    }
}
