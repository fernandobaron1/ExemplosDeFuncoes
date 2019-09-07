
package exemplodefuncoes;


public class ExemploDeFuncoes {

   
    public static void main(String[] args) {
        
        //Potenciação
        double base = 3;
        double expoente = 3;
        double resultado = Math.pow(base, expoente);
        System.out.println(resultado);
        
        //Raiz quadrada
        double raiz = Math.sqrt(4);
        System.out.println(raiz);
        
        //Número PI
        double pi = Math.PI;
        System.out.println(pi);
        
        // Descobre o maior e menor valor 
        double numero1 = 10;
        double numero2 = 50;
        
        System.out.println(Math.max(numero1,numero2));
        System.out.println(Math.min(numero1,numero2));

        //Faz o arredondamento para um número mais próximo
        double numero = 7.7;
        System.out.println (Math.round(numero));
        
        //Torna o número positivo
        numero = -8;
        System.out.println(Math.abs(numero));
        
        //Faz o arredondamento para um número maior
        double numero3 = 8.1;
        System.out.print(Math.ceil(numero3));
        
        //Math. Exemplos de Funções
    }
    
}
