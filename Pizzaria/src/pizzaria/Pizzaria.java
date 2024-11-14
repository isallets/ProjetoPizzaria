
package pizzaria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Pizzaria {
        public static void main(String[] args) {
            PizzaDao pizzadao = new PizzaDao();
            
            //criar pizzas
            Pizza pizza1 = new Pizza(1,"Napolitano", 20, " Molho de tomate, Mussarela de Bufala e Manjericao");
            Pizza pizza2 = new Pizza(2,"Calabresa", 15, " Molho de tomate, Mussarela, Calabresa e Cebola");
            Pizza pizza3 = new Pizza(3,"Frango c/ Catupiry", 30, " Molho de tomate, Mussarela, Frango e Catupiry");
                    
            pizzadao.adicionarPizza(pizza1);
            pizzadao.adicionarPizza(pizza2);
            pizzadao.adicionarPizza(pizza3);
            
            //deletar pizzas
            System.out.println();
            Pizza pizzasSD=pizzadao.listarPizza(2);
            
            if(pizzadao.deletarPizza(pizzasSD))
            System.out.println("Excluido com sucesso");
            else 
            System.out.println("Exclusao nao realizada");
            
            //atualizar pizzas
            System.out.println();
            Pizza pizzaUP=new Pizza(1,"Portuguesa", 20, " Molho de tomate, Mussarela de Bufala e Manjericao");
            pizzadao.atualizaPizza(pizzaUP);
            System.out.println(pizzadao.listarTodasPizzas());
            
            //pedidos 
            
            PedidosDao pedidosdao = new PedidosDao();
            
            //criar pedidos
            Pedidos pedido1 = new Pedidos (1, Arrays.asList(pizza1, pizza2), "Carlos");
            Pedidos pedido2 = new Pedidos (2, Arrays.asList(pizza2, pizza3), "Roberto");
            Pedidos pedido3 = new Pedidos (3, Arrays.asList(pizza1, pizza3), "Nicolas");
            pedidosdao.adicionarPedidos(pedido1);
            pedidosdao.adicionarPedidos(pedido2);
            pedidosdao.adicionarPedidos(pedido3);
            
            //listar pedidos
            System.out.println(pedidosdao.listarTodasPedidos());
            
            //deletar pedidos
            Pedidos pedidosSD=pedidosdao.listarPedidos(2);
            
            if(pedidosdao.deletarPedidos(pedidosSD)){
                System.out.println("Excluido com sucesso");
                System.out.println(pedidosdao.listarTodasPedidos());
            }
            else 
                System.out.println("Exclusao nao realizada");
            
            //atualizar pedidos
            System.out.println();
            Pedidos pedidosUP = new Pedidos (1, Arrays.asList(pizza1, pizza3), "Carlos");
            pedidosdao.atualizaPedidos(pedidosUP);
            System.out.println(pedidosdao.listarTodasPedidos());
                
        }
        
}
