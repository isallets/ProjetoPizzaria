
package pizzaria;

import java.util.List;

public class Pedidos {
    private int id;
    private List<Pizza> pizzas;
    private String cliente;
    private double total;

    public Pedidos(int id, List<Pizza> pizzas, String cliente) {
        this.id = id;
        this.pizzas = pizzas;
        this.cliente = cliente;
        this.total = calcularTotal();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public final double calcularTotal(){
        return pizzas.stream().mapToDouble(Pizza::getPreco).sum();
    }
}
