
package pizzaria;

import PizzariaDao.DiaTrabalhoDao;
import PizzariaDao.PedidosDao;
import PizzariaDao.PizzaDao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Pizzaria {
        public static void main(String[] args) {
            PizzaDao pizzadao = new PizzaDao();
            PedidosDao pedidosdao = new PedidosDao();
            DiaTrabalhoDao diatrabalhodao = new DiaTrabalhoDao();
       
            
            //criar pizzas
            Pizza pizza1 = new PizzaCalabresa(5);
            Pizza pizza2 = new PizzaNapolitana(3);
                    
            pizzadao.adicionarPizza(pizza1);
            pizzadao.adicionarPizza(pizza2);
            
            System.out.println("***Cardápio de Pizzas:***\n" + pizzadao.listarTodasPizzas());
            /*
            //deletar pizzas
            System.out.println("***Exclua uma Pizza do Cardápio:***\n" + pizzadao.listarTodasPizzas());

            Pizza pizzasDE=pizzadao.listarPizza(2);
      
            if(pizzadao.deletarPizza(pizzasDE))
            System.out.println("Excluido com sucesso!");
            else 
            System.out.println("Exclusao nao realizada...");
            
            //atualizar pizzas
            System.out.println("***Atualize uma Pizza do Cardápio:***\n" + pizzadao.listarTodasPizzas());

            Pizza pizzaUP=new Pizza(1,"Pizza de Calabresa", "Molho de tomate, Mussarela, Calabresa e Cebola" , 30, 5);
            pizzadao.atualizaPizza(pizzaUP);
            System.out.println(pizzadao.listarTodasPizzas());
            */
            //criar cliente
            Cliente cliente1 = new Cliente(1, "Carlos");
            
            Cliente cliente2 = new Cliente(2, "Roberto");
            //pedidos
            Pedidos pedidos1 = new Pedidos(1);
            Pedidos pedidos2 = new Pedidos(2);
            
            //criar pedidos
            pedidos1.adicionarCliente(cliente1);
            pedidos1.adicionarPizza(pizza1);
            pedidos1.adicionarPizza(pizza1);
            pedidosdao.adicionarPedidos(pedidos1);
            
            pedidos2.adicionarCliente(cliente1);
            pedidos2.adicionarPizza(pizza2);
            pedidos2.adicionarPizza(pizza1);
            pedidosdao.adicionarPedidos(pedidos2);

            //listar pedidos
            System.out.println("***Lista de Pedidos:*** \n" + pedidosdao.listarTodasPedidos());
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
           
            //atualizar pedidos
            Pedidos pedidosUP = new Pedidos(1, pedidos2.getPizzas() , cliente2);
            pedidosdao.atualizaPedidos(pedidosUP);
            System.out.println("***Pedido atualizado:***\n" + pedidosdao.listarPedidos(1));
            */
            //cria um data
            //TEM QUE FAZER IGUAL AO DE ADICIONAR PEDIDOS - PRIMEIRO CRIA A DATA, E DEPOIS INCLUI O PEDIDO NA DATA
            //LocalDate novaData1 = LocalDate.of(2024, 11, 28);            

            
            DiaTrabalho diaTrabalho1 = new DiaTrabalho(20241128);
            
            
            diaTrabalho1.adicionarPedido(pedidos2);
            
             
            System.out.println("Pedidos do dia " + diaTrabalho1.getData() + ":");
                for (Pedidos pedido : diaTrabalho1.getPedidos()) {
                    System.out.println("Pedido ID: " + pedido.getId());
            }
             
        }
        
} 
