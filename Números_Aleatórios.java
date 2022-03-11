import java.util.Random;

public class Números_Aleatórios 
{

    public static void main(String[] args) 
    {
        Random gerar = new Random();
        
        // Imprime um número aleatório entre 0 e 9
        System.out.println(gerar.nextInt(10));
        
        // Imprime um número aleatório entre 1 e 9
        System.out.println(gerar.nextInt(10)+1);
        
        // Imprime um número aleatório entre 5 e 500
        System.out.println(gerar.nextInt(500)+100);

    }
    
}
