
package pizzaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class DiaTrabalho {
    private int id;
    private LocalDate data = LocalDate.of(2024, 11, 28);
    private List<Pedidos> pedidos;
    
    public DiaTrabalho(int id) {
        this.id = id;
        this.pedidos = new ArrayList<>();
    }
    /*
    public DiaTrabalho(int id, LocalDate data) {
        this.id = id;
        this.data = data;
    }
   */
    public DiaTrabalho(int id, List<Pedidos> pedidos) {
        this.id = id;
        this.pedidos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
    
    //PARA EU CONSEGUIR ADICIONAR O PEDIDO NA DATA
    public void adicionarPedido(Pedidos pedido) {
        this.pedidos.add(pedido); 
    }
    

    
    public LocalDate getDataDoPedido(Pedidos pedido) {
        this.pedidos.contains(pedido);
            return this.data; 
    }
    
}
