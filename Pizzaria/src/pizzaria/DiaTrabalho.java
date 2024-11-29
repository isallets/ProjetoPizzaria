
package pizzaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class DiaTrabalho {
    private int id;
    private LocalDate dia = LocalDate.of(2024, 11, 28);
    private List<Pedidos> pedidos;
    
    public DiaTrabalho(int id) {
        this.id = id;
        this.pedidos = new ArrayList<>();
    }
   
    public DiaTrabalho(int id, List<Pedidos> pedidos) {
        this.id = id;
        this.pedidos = pedidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }
    
    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }
    
    //PARA EU CONSEGUIR ADICIONAR O PEDIDO NA DATA
    public void adicionarPedido(Pedidos pedidos){
        
    }
    
    
}
