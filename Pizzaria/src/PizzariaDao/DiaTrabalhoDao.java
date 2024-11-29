
package PizzariaDao;

import java.util.ArrayList;
import java.util.List;
import pizzaria.DiaTrabalho;


public class DiaTrabalhoDao {
    private List<DiaTrabalho> databaseDiaTrabalho=new ArrayList();
    
    public void adicionarDiaTrabalho(DiaTrabalho d){
        databaseDiaTrabalho.add(d);
    }
    
    public DiaTrabalho listarDiaTrabalho(int id){
        for(DiaTrabalho d : databaseDiaTrabalho){
            if(d.getId()==id)
                return d;
        }
        return null;
    }
    /*
    public boolean atualizaDiaTrabalho(DiaTrabalho d){
        DiaTrabalho existeD=listarDiaTrabalho(d.getId());
        if(existeD!=null){
            existeD.setPizzas(d.getPizzas());
            existeD.setCliente(d.getCliente());
            
            return true;
        }
        return false;
    }
    
    public boolean deletarDiaTrabalho(DiaTrabalho d){
        DiaTrabalho existeD=listarDiaTrabalho(d.getId());
        if(existeP!=null){
            databaseDiaTrabalho.remove(d);
            return true;
        }
        return false;
    }
   */ 
    public String listarTodasDiaTrabalho(){
        String report="";
        for(DiaTrabalho d: databaseDiaTrabalho){
            report+=d.getId()+"\n";
            report+=d.getDia()+"\n";
            report+=d.getPedidos()+"\n";
        }
        return report;
    }
}
