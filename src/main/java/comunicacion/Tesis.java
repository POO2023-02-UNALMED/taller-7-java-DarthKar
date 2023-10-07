
package comunicacion;


public class Tesis extends Escrito{
    
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;
    
    
       
    public Tesis(String origen, String titulo, String autor, int paginas,String idea,String[] argumentos, String conclusion,String referencias,String interpretacion){
           super(origen,titulo,autor,paginas);
           this.idea=idea;
           this.argumentos=argumentos;
           this.conclusion=conclusion;
           this.referencias=referencias;
           this.interpretacion=interpretacion;
                           
    }
    
    @Override
    public int palabrasTotales(int num){
        return this.getPaginas()*5*num;
        
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
               this.getIdea()+"\n"+
               this.getArgumentos().length+"\n"+
               this.getConclusion()+"\n"+
               this.getReferencias();
                     
    }

    public String getIdea() {
        return idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
}
