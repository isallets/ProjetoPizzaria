
package pizzaria;

public class Pizza {
    private int id;
    private String sabor;
    private double preco;
    private String descricao;

    public Pizza(int id, String sabor, double preco, String descricao) {
        this.id = id;
        this.sabor = sabor;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
}
