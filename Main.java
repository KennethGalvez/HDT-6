
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;
import java.io.BufferedWriter;

class Main {
  public static void main(String[]args){
    Factory<String,String> imp = new Factory<String,String>();
    Map almacen;


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

    if(res==1){
      almacen = imp.getStack(res);

    }else if(res==2){
      almacen = imp.getStack(res);

    }else{
      almacen = imp.getStack(res);

    }

    try{
      File file = new File("cards_desc.txt");
      Scanner input = new Scanner (file);
      while(input.hasNextLine()){
        String dato = input.nextLine();
        String[] partes = dato.split("\\|");
        String llave = partes[0];
        String valor = partes[1];
        almacen.put(llave,valor);

      }

    }catch (Exception e) {
      e.printStackTrace();
    }

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


      int opcion = s.nextInt();
      switch (opcion){
        case 1:
          String llave="";
          String valor="";
          System.out.println("Ingrese el nombre de la carta:");
          try{
            llave=s.nextLine();
          }catch(Exception e){
            System.out.println("\n\t Ingrese valores aceptables ! ! !");
          }


          System.out.println("Ingrese el tipo de la carta:");
          try{
            valor=s.nextLine();
          }catch(Exception e){
            System.out.println("\n\t Ingrese valores aceptables ! ! !");
          }


          almacen.put(llave,valor);
          break;
        case 2:
          String llave2="";
          System.out.println("Ingrese el nombre de la carta a ver:");
          try{
            llave2=s.nextLine();
          }catch(Exception e){
            System.out.println("\n\t Ingrese valores aceptables ! ! !");
          }

          if(almacen.containsKey(llave2)){
            System.out.println(almacen.get(llave2));
          }
          else{
            System.out.println("No existe esa carta");
          }

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
          System.out.println("Solo numeros entre 1 y 7");
      }
    }

  }
}
