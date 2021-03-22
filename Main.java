
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedWriter;
class Main {
  public static void main(String[]args){
    Factory<String,String> imp = new Factory<String,String>();
    try{
          File file = new File("cards_desc.txt");
          // Si el archivo no existe es creado
          if (!file.exists()) {
              file.createNewFile();
        }
    }catch (Exception e) {
              e.printStackTrace();
    }
    int res = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("\t Bienvenido lector de cartas ");
    System.out.println("\t Seleccione la implementacion que desea utizar para el stack: ");
    System.out.println("\n\t\t [ 1 ] HashMap.");
    System.out.println("\t\t [ 2 ] TreeMap.");
    System.out.println("\t\t [ 3 ] LinkedHashMap.");

    while(true){
      try{
          res = s.nextInt();
          
          if(res>=1 && res<=3){
              break;
          }else{
              System.out.println("\n\t Ingrese valores entre 1 y 3 !");
          }
      }catch(Exception e){
          System.out.println("\n\t Ingrese valores numericos ! ! !");
      }
    }

    if(res == 1){
      HashMap almacen = imp.getStack(res);
      
      boolean salir = false;

      while(!salir){
        System.out.println("Escriba el numero de la opción que desee \t");

        System.out.println("1. Agregar una carta a la colección del usuario");
        System.out.println("2. Mostrar el tipo de una carta especifica");
        System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección.");
        System.out.println("4. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección, ordenadas por tipo.");
        System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
        System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
        System.out.println("7. Salir");


        opcion = s.nextInt();
        switch (opcion){
          case 1:
            break;
          case 2:
            break;
          case 3:
            break;
          case 4:
            break;
          case 5:
            break;
          case 6:
            break;
          case 7:
            salir = true;
            break;
          default:
            System.out.println("Solo numeros entre 1 y 7")          
        }
      }
      
    }

    else if(res == 2){
      boolean salir = false;

      while(!salir){
        System.out.println("Escriba el numero de la opción que desee \t");

        System.out.println("1. Agregar una carta a la colección del usuario");
        System.out.println("2. Mostrar el tipo de una carta especifica");
        System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección.");
        System.out.println("4. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección, ordenadas por tipo.");
        System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
        System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
        System.out.println("7. Salir");


        opcion = s.nextInt();
        switch (opcion){
          case 1:
            break;
          case 2:
            break;
          case 3:
            break;
          case 4:
            break;
          case 5:
            break;
          case 6:
            break;
          case 7:
            salir = true;
            break;
          default:
            System.out.println("Solo numeros entre 1 y 7")          
        }
      }
      
    }

    else if(res == 3){
      boolean salir = false;

      while(!salir){
        System.out.println("Escriba el numero de la opción que desee \t");

        System.out.println("1. Agregar una carta a la colección del usuario");
        System.out.println("2. Mostrar el tipo de una carta especifica");
        System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección.");
        System.out.println("4. Mostrar el nombre, tipo y cantidad de cada carta que el usuario tiene en su colección, ordenadas por tipo.");
        System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
        System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
        System.out.println("7. Salir");


        opcion = s.nextInt();
        switch (opcion){
          case 1:
            break;
          case 2:
            break;
          case 3:
            break;
          case 4:
            break;
          case 5:
            break;
          case 6:
            break;
          case 7:
            salir = true;
            break;
          default:
            System.out.println("Solo numeros entre 1 y 7")          
        }
      }
      
    }
  }
}
