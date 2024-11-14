
package pizzaria;

import java.util.ArrayList;
import java.util.List;

public class PizzaDao{
    private List<Pizza> databasePizza=new ArrayList();
    
    public void adicionarPizza(Pizza p){
        databasePizza.add(p);
    }

    public List<Pizza> getDatabasePizza() {
        return databasePizza;
    }

    public void setDatabasePizza(List<Pizza> databasePizza) {
        this.databasePizza = databasePizza;
    }
    
    public Pizza listarPizza(int id){
        for(Pizza p : databasePizza){
            if(p.getId()==id)
                return p;
        }
        return null;
    }
    
    public boolean atualizaPizza(Pizza p){
        Pizza existeP=listarPizza(p.getId());
        if(existeP!=null){
            existeP.setSabor(p.getSabor());
            existeP.setPreco(p.getPreco());
            existeP.setDescricao(p.getDescricao());
            return true;
        }
        return false;
    }
    
    public boolean deletarPizza(Pizza p){
        Pizza existeP=listarPizza(p.getId());
        if(existeP!=null){
            databasePizza.remove(p);
            return true;
        }
        return false;
    }
    
    public String listarTodasPizzas(){
        String report="";
        for(Pizza p: databasePizza){
            report+=p.getId()+"\n";
            report+=p.getSabor()+"\n";
            report+=p.getPreco()+"\n";
            report+=p.getDescricao()+"\n";
        }
        return report;
    }
    
  

}
