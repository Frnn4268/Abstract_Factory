package Abstract_Factory;

import java.util.Scanner;

public class Main {
    
    public static Scanner sc = new Scanner(System.in);
    public static Factory_Personaje Fabrica;
    public static String op;
    
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("Elija una opción");
        System.out.println("1. Heroe");
        System.out.println("2. Villano");
        op = sc.nextLine();
        
        if (op.equals("1")){
            System.out.println("Ingrese el tipo de franquicia del heroe que desea (1. Marvel/2. DC Comics/3. Nintendo)");
            op = sc.nextLine();
            
            if(op.equals("1")){
                Fabrica = new Heroe();
                System.out.println("Ha elegido al heroe de Marvel");
                System.out.println("El personaje es " + Fabrica.getMarvel().getNombre().toString());
                
            } else if (op.equals("2")){
                Fabrica = new Heroe();
                System.out.println("Ha elegido al heroe de DC Comics");
                System.out.println("El personaje es " + Fabrica.getDC_Comics().getNombre().toString());
                
            } else if (op.equals("3")){
                Fabrica = new Heroe();
                System.out.println("Ha elegido al heroe de Nintendo");
                System.out.println("El personaje es " + Fabrica.getNintendo().getNombre().toString());
            }
        
        } else if (op.equals("2")){
            System.out.println("Ingrese el tipo de franquicia del villano que desea (1. Marvel/2. DC Comics/3. Nintendo)");
            op = sc.nextLine();
            
            if(op.equals("1")){
                Fabrica = new Villano();
                System.out.println("Ha elegido al villano de Marvel");
                System.out.println("El personaje es " + Fabrica.getMarvel().getNombre().toString());
                
            } else if (op.equals("2")){
                Fabrica = new Villano();
                System.out.println("Ha elegido al villano de DC Comics");
                System.out.println("El personaje es " + Fabrica.getDC_Comics().getNombre().toString());
                
            } else if (op.equals("3")){
                Fabrica = new Villano();
                System.out.println("Ha elegido al villano de Nintendo");
                System.out.println("El personaje es " + Fabrica.getNintendo().getNombre().toString());
            }
        }
    }
}