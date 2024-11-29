
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
            
            System.out.println("***Cardápio de Pizzas***\n" + pizzadao.listarTodasPizzas());
            /*
            //deletar pizzas
            System.out.println("***Exclua uma Pizza do Cardápio***\n" + pizzadao.listarTodasPizzas());

            Pizza pizzasDE=pizzadao.listarPizza(2);
      
            if(pizzadao.deletarPizza(pizzasDE))
            System.out.println("Excluido com sucesso!");
            else 
            System.out.println("Exclusao nao realizada...");
            
            //atualizar pizzas
            System.out.println("***Atualize uma Pizza do Cardápio***\n" + pizzadao.listarTodasPizzas());

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
            
            pedidos2.adicionarCliente(cliente2);
            pedidos2.adicionarPizza(pizza2);
            pedidos2.adicionarPizza(pizza1);
            pedidosdao.adicionarPedidos(pedidos2);

            //listar pedidos
            System.out.println("***Lista de Pedidos:*** \n" + pedidosdao.listarTodasPedidos());
            /*
            //deletar pedidos
            Pedidos pedidosDE=pedidosdao.listarPedidos(1);
            
            if(pedidosdao.deletarPedidos(pedidosDE)){
                System.out.println("Excluido com sucesso");
                System.out.println(pedidosdao.listarTodasPedidos());
            }
            else 
                System.out.println("Exclusao nao realizada");
            
            System.out.println("...."+ pedidosdao.listarTodasPedidos());
           
            //atualizar pedidos
            Pedidos pedidosUP = new Pedidos(1, pedidos2.getPizzas() , cliente2);
            pedidosdao.atualizaPedidos(pedidosUP);
            System.out.println("***Pedido atualizado***\n" + pedidosdao.listarPedidos(1));
            */
            //cria um data
            //TEM QUE FAZER IGUAL AO DE ADICIONAR PEDIDOS - PRIMEIRO CRIA A DATA, E DEPOIS INCLUI O PEDIDO NA DATA           
            LocalDate novaData1 = LocalDate.of(2024, 11, 28);
            LocalDate novaData2 = LocalDate.of(2024, 11, 29);

            
            DiaTrabalho diaTrabalho1 = new DiaTrabalho(20241128, novaData1);
            DiaTrabalho diaTrabalho2 = new DiaTrabalho(20241129, novaData2);

            //adiciona os pedidos na datas
            diaTrabalho1.adicionarPedido(pedidos2);
            diatrabalhodao.adicionarDiaTrabalho(diaTrabalho1);
            diaTrabalho2.adicionarPedido(pedidos2);
            diaTrabalho2.adicionarPedido(pedidos1);
            diatrabalhodao.adicionarDiaTrabalho(diaTrabalho2);
            
            //lista os pedidos de um dia específico
            System.out.println("***Pedidos do dia***\n" + diaTrabalho2.getData() + ":\n");
                for (Pedidos pedido : diaTrabalho2.getPedidos()) {
                    System.out.println("\nPedidos Completos: \n" + pedido.getId() + "," + pedido.getPizzas() + "Cliente:" + pedido.getCliente());
            }
            
            //listar as datas -- TENTAR SIMPLIFICAR ISSO
            System.out.println("***Datas com Pedidos***");
            
            List<LocalDate> datas = diatrabalhodao.listarDatas();
            
            for (LocalDate data : datas) {
                System.out.println("Data: " + data);       
            }
    }
        
} 





