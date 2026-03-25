package ExercicioBasico.java;

public class Produto {

    private String produto;
    private double preco;

    public void setPreco(double p) {
        if (p < 0.00) {
            System.out.println("Valor inválido");
        }
            preco = p;
    }

    public double getPreco(){
        return preco;
    }

    public void setProduto(String nomeProduto){
        produto = nomeProduto;
    }

    public String getProduto() {
        return produto;
    }
}
