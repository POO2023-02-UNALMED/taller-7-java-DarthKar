
package comunicacion;


public class Alfabeto extends Pictograma{
   
    private String[] letras; 
    private String interpretacion;
 
    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras=letras;
        this.interpretacion=interpretacion;
        
    }
    
    public int cantidadLetras(){
        if (letras!=null){
            return  letras.length;
        }else{
            return 0;
        }
    }
    @Override
    public String interpretacion(){
        return interpretacion;
    }
    @Override
    public String toString(){
        if(letras!=null){
            return String.join(", ",letras);
        }else{
            return"";
        }
    }
     public String[] getLetras() {
        return letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
       public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
    
}
