
package main11;


public abstract class Carnivoros implements Animal{

    private String nombre;
    private String comidaFavorita;
    private String juega;
    
   
        public void Canivoros(){
            
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setComidaFavorita(String comidaFavorita){
            this.comidaFavorita= comidaFavorita;
        }

        public String getComidaFavorita() {
            return comidaFavorita;
        }
        
        
        
        public void setJuega(String juega){
            this.juega= juega;
        }

        public String getJuega() {
            return juega;
        }
        ///////////////////////////////////////////
        
        public void comer() {
            System.out.println("El"+getNombre()+"come"+getComidaFavorita());
        }


        public void jugar() {
            System.out.println("El"+getNombre()+"juega"+getJuega());
        }
    
        
        
        
}
