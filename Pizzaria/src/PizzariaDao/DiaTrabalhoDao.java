
package PizzariaDao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import pizzaria.DiaTrabalho;


public class DiaTrabalhoDao {
    private List<DiaTrabalho> databaseDiaTrabalho=new ArrayList();
    
    public void adicionarDiaTrabalho(DiaTrabalho d){
        databaseDiaTrabalho.add(d);
    }
    /*
    public String listarDatas() {
        for (DiaTrabalho dia : databaseDiaTrabalho) {
            System.out.println("Data: " + dia.getData());
        }
        return null;
    }
    */
    public List<LocalDate> listarDatas() {
        List<LocalDate> datas = new ArrayList<>();
        
        for (DiaTrabalho data : databaseDiaTrabalho) {
            datas.add(data.getData());
        }
        return datas;
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

    
    public boolean deletarDiaTrabalho(DiaTrabalho d) {
    return databaseDiaTrabalho.removeIf(dia -> dia.getId() == d.getId());
    }
   */
    public String listarTodosDiaTrabalho(){
        String report="";
        for(DiaTrabalho d: databaseDiaTrabalho){
            report+=d.getData()+"\n";
        }
        return report;
    }
    
}
