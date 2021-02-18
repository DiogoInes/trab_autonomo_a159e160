package m17b_trab_autonomo_a159e160;
/** Classe Ponto2D, para instanciar objectos-Ponto2D
 * @version 1, 18.fev.2021
 * @author Diogo Inês
 */
public class Ponto2D {
    /** Coordenada da abscissa*/
    private int x;
    
    /** Coordenada da ordenada*/
    private int y;
    
    /**
    * Construtor sem parâmetros, que inicializa os atributos
    * com valores predefinidos conhecidos.
    */
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    
    /**
    * Construtor  que inicializa os atributos
    * com os parametros x, y.
    * @param x abscissa
    * @param y ordenada
    */
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    /**
    * 
    * @param a valor da abscissa e da ordenada
    * @return distância entre dois objectos
    */
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((x-a.x),2)+Math.pow((y-a.y),2)));
    }
    
    
    /**
    * 
    * @return x valor da abscissa
    */
    public int getX() {
        return x;
    }
    
    
    /**
    * 
    * @param x valor da abscissa
    */
    public void setX(int x) {
        this.x = x;
    }
    
    
    /**
    * 
    * @return y valor da ordenada 
    */
    public int getY() {
        return y;
    }
    
    /**
    * 
    * @param y valor da ordenada 
    */
 
    public void setY(int y) {
        this.y = y;
    }
    
    /**
    * 
    * @return valor da abscissa e ordenada
    */
    @Override
    public String toString() {
        return "Ponto2D{" + "x=" + x + ", y=" + y + '}';
    }
}
