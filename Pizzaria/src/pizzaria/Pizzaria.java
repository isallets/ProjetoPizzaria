
package pizzaria;

import PizzariaDao.PedidosDao;
import PizzariaDao.PizzaDao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Pizzaria {
        public static void main(String[] args) {
            PizzaDao pizzadao = new PizzaDao();
            PedidosDao pedidosdao = new PedidosDao();
       
            
            //criar pizzas
            Pizza pizza1 = new PizzaCalabresa(2);
            Pizza pizza2 = new PizzaNapolitana(3);
                    
            pizzadao.adicionarPizza(pizza1);
            pizzadao.adicionarPizza(pizza2);
            
            System.out.println("Lista de Pizzas: \n" + pizzadao.listarTodasPizzas());
            /*
            //deletar pizzas
            System.out.println(pizzadao.listarTodasPizzas());

            Pizza pizzasSD=pizzadao.listarPizza(2);
      
            if(pizzadao.deletarPizza(pizzasSD))
            System.out.println("Excluido com sucesso");
            else 
            System.out.println("Exclusao nao realizada");
            
            //atualizar pizzas
            System.out.println(pizzadao.listarTodasPizzas());

            Pizza pizzaUP=new Pizza(1,"Pizza de Calabreza", "Molho de tomate, Mussarela, Calabresa e Cebola" , 15, 5);
            pizzadao.atualizaPizza(pizzaUP);
            System.out.println(pizzadao.listarTodasPizzas());
            */
            //criar cliente
            Cliente cliente1 = new Cliente(1, "Carlos");
            
            Cliente cliente2 = new Cliente(2, "Roberto");
            //pedidos
            Pedidos pedidos1 = new Pedidos(1);    
            
            //criar pedidos
            pedidos1.adicionarCliente(cliente1);
            pedidos1.adicionarPizza(pizza1);
            pedidos1.adicionarPizza(pizza1);
            pedidosdao.adicionarPedidos(pedidos1);

            //listar pedidos
            System.out.println("Lista de Pedidos: \n" + pedidosdao.listarTodasPedidos());
            /*
            //deletar pedidos
            Pedidos pedidosSD=pedidosdao.listarPedidos(1);
            
            if(pedidosdao.deletarPedidos(pedidosSD)){
                System.out.println("Excluido com sucesso");
                System.out.println(pedidosdao.listarTodasPedidos());
            }
            else 
                System.out.println("Exclusao nao realizada");
            
            System.out.println("...."+ pedidosdao.listarTodasPedidos());
            */
            //atualizar pedidos
            Pedidos pedidosUP = new Pedidos(1, pedidos1.getPizzas() , cliente2);
            pedidosdao.atualizaPedidos(pedidosUP);
            System.out.println(pedidosdao.listarTodasPedidos());

                
        }
        
} 
