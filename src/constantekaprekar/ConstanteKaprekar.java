
package constantekaprekar;
import java.util.Arrays;
import java.util.Scanner;

//Algoritmo creado por Marcos Fernandez

public class ConstanteKaprekar {

    //Se declaran las variables necesarias
    private static String valor, variable1asc, variable2desc;
    private static int v1, v2, v3, v4, resultado2, intento = 0;
    
    
    public static void main(String[] args) {
     
        //Se setean los valores predeterminados
        valor = null;
        variable1asc = null;
        variable2desc = null;
        v1 = 0;
        v2 = 0;
        v3 = 0;
        v4 = 0;
        resultado2 = 0;
        intento = 0;
        
        //Se declara la variable de lectura
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Inserte un número de 4 dígitos: ");
        //Se toma el valor ingresado por el usuario
        valor = leer.next();
        
        //Validar cantidad de digitos ingresados
        if(valor.length() != 4){
            System.out.println("ERROR: solo se requieren 4 digitos");
            System.exit(0);
        }
        
        System.out.println("####### Operaciónes #######");
        
        //Se encierra en un try-catch para validar el formato ingresado
        try{
            
            
        //Se descompone el valor para reorganizarlo
        v1 = Integer.parseInt(Character.toString(valor.charAt(0)));
        v2 = Integer.parseInt(Character.toString(valor.charAt(1)));
        v3 = Integer.parseInt(Character.toString(valor.charAt(2)));
        v4 = Integer.parseInt(Character.toString(valor.charAt(3)));
        
       //Se organizan los valores independientes en una matriz unidimensional
        String[] valores = {Integer.toString(v1), Integer.toString(v2),
        Integer.toString(v3), Integer.toString(v4)};
        
        //Se reordenan los valores
        Arrays.sort(valores);
        
        //Los valores se ordenan de manera ascendente y descendente
        variable1asc = valores[0]+valores[1] + valores[2] + valores[3];
        variable2desc = valores[3]+valores[2] + valores[1] + valores[0];
        
        //Se ejecuta la operacion matematica
        resultado2 = Integer.parseInt(variable2desc) - Integer.parseInt(variable1asc);
        
        //Se repite la misma operacion las veces necesarias
        //para llegar al resultado necesario que es la constante de Kaprekar
        do{         
            //Se imprime el resultado actual
            System.out.println("El resultado actual es: " + resultado2);
            Ordenar();
            //Contador de intentos
            intento = intento + 1;            
        } while(resultado2 != 6174);
        
        //Se arroja el resultado final y la cantidad de intentos u operaciones realizados
        System.out.println("############################################");
        System.out.println("# El resultado final es: " + resultado2 + "              #");
        System.out.println("# Después de " + intento + " intentos.                   #");
        System.out.println("############################################");
        
            }catch(NumberFormatException ex){
                //Error al ingresar datos no numericos
                System.out.println("ERROR: solo se pueden ingresar datos numericos enteros" + ex);
                System.exit(0);
        }
    }
    //metodo el cual vuelve a realizar la misma operacion del principio
    //descompone el resulado, lo reordena y aplica su operacion matematica
    public static void Ordenar(){
        
        valor = Integer.toString(resultado2);
                
        v1 = Integer.parseInt(Character.toString(valor.charAt(0)));
        v2 = Integer.parseInt(Character.toString(valor.charAt(1)));
        v3 = Integer.parseInt(Character.toString(valor.charAt(2)));
        v4 = Integer.parseInt(Character.toString(valor.charAt(3)));
        
       
        String[] valores = {Integer.toString(v1), Integer.toString(v2),
        Integer.toString(v3), Integer.toString(v4)};
        
        Arrays.sort(valores);
        
        variable1asc = valores[0]+valores[1] + valores[2] + valores[3];
        variable2desc = valores[3]+valores[2] + valores[1] + valores[0];
        
        resultado2 = Integer.parseInt(variable2desc) - Integer.parseInt(variable1asc);
    }
    
}
