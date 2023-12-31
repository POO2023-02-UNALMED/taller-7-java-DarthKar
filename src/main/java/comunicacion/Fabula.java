
package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;
    
    
    
    public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion){
           super(origen,titulo,autor,paginas);
           this.ensenanza=ensenanza;
           this.interpretacion=interpretacion;
                           
    }
    
    
        
    @Override
    public int palabrasTotales(int num){
        return this.getPaginas()*num;
        
    }
    
    @Override
    public int getPaginas(){
        return super.getPaginas();
    }
    
    @Override
    public String interpretacion(){
        return interpretacion;
    }
      @Override
    public String toString(){
        return this.getOrigen()+"\n" + 
               this.getTitulo()+"\n" + 
               this.getAutor()+"\n" + 
               this.getPaginas()+"\n" + 
               this.getEnsenanza();
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
    
    
    
    
}
