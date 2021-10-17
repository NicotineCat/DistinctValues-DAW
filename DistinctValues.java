import javax.lang.model.util.ElementScanner14;

public class DistinctValues{
    public static void main(String[] args){
        // Parseo los args a ints
        int numero1 = Integer.parseInt(args[0]);
        int numero2 = Integer.parseInt(args[1]);
        int numero3 = Integer.parseInt(args[2]);
        //Se compara que n1 = n2 o n1 = n3
        if(numero1 == numero2 && numero1 == numero3)
            System.out.println("1");
        //Se compara que n1 = n2 o n1 a n3 o n2 a n3
        else if(numero1 == numero2 || numero2 == numero3 || numero1 == numero3)
            System.out.println("2");
        //y si no pues ya lo que quede
        else
            System.out.println("3");
    }
}