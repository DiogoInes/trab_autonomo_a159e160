
package m17b_trab_autonomo_a159e160;
/**
 * 
 * @author Diogo Inês
 */
public class Main {
    /**
     * Não são usados parâmetros em main().
     * @param args não se aplica.
     */
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(5,7);
        Ponto2D p2 = new Ponto2D(2,8);
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p2.distancia(p1));

    }
    
}
