import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Creacion clase serie
public class Serie { 
    
    //Se almacena la secuencia Fibonacci
    private Map<Integer, Long> valorList = new HashMap(); 
    
    //Constructor
    public Serie() { 
    }
    
    //Calcula y devuelve el valor del fibonacci
    public long getFibonacci(int position) {    
        if (position != 0 && position != 1) {
            if (this.valorList.containsKey(position)) {
                return (Long)this.valorList.get(position);
            } else {
                long resultado = this.getFibonacci(position - 1) + this.getFibonacci(position - 2);
                this.valorList.put(position, resultado);
                return resultado;
            }
        } else {
            return 1;
        }
    }
    
    //Get y Set
    public Map<Integer, Long> getValorList() { //Permiete establecer ValorList
        return this.valorList;
    }
  
    public void setValorList(Map<Integer, Long> valorList) {
        this.valorList = valorList;
    }
    
    //constructor
    private void printValorList() {
        StringBuilder builder = new StringBuilder();
        //Imprime el valor de la cadena
        Map.Entry entry;
        for(Iterator var2 = this.valorList.entrySet().iterator(); var2.hasNext(); builder.append(entry.getValue())) {
            entry = (Map.Entry)var2.next();
            if (builder.length() > 0) {
                builder.append(" , ");
            }
        }

        System.out.println(builder.toString());
    }
    //toString imprime los valores de valorList
    public String toString() {
        return "Serie: " + this.valorList.toString();
    }
}

