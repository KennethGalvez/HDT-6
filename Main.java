
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.*;
import java.io.BufferedWriter;

class Main {
  public static void main(String[]args){
    Factory<String,String> imp = new Factory<String,String>();
    Map almacen;
    Map milista;


    int res = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Bienvenido lector de cartas ");
    System.out.println("Seleccione la implementacion que desea utizar para el stack: ");
    System.out.println("[ 1 ] HashMap.");
    System.out.println("[ 2 ] TreeMap.");
    System.out.println("[ 3 ] LinkedHashMap.");

    while(true){
      try{
          res = s.nextInt();
          
          if(res>=1 && res<=3){
              break;
          }else{
              System.out.println("Ingrese valores entre 1 y 3 !");
          }
      }catch(Exception e){
          System.out.println("Ingrese valores numericos ! ! !");
      }
    }


    almacen = imp.getStack(res);
    milista = imp.getStack(res);



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
      System.out.println(" ");
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
          s.nextLine();
          System.out.println("Ingrese el nombre de la carta:");
          try{
            llave=s.nextLine();
          }catch(Exception e){
            System.out.println("\n\t Ingrese valores aceptables ! ! !");
          }

          if (almacen.containsKey(llave)) {
            if(milista.containsKey(llave)){

              int num = (int) milista.get(llave);
              num+=1;

              milista.put(llave,num);

            }else{
              milista.put(llave,1);
            }
          }else{
            System.out.println("La carta ingresada no existe");
          }

          break;
        case 2:
          String llave2="";
          s.nextLine();
          System.out.println("Ingrese el nombre de la carta a ver:");
          try{
            llave2=s.nextLine();
          }catch(Exception e){
            System.out.println("\n\t Ingrese valores aceptables ! ! !");
          }

          if(almacen.containsKey(llave2)){
            System.out.println("La carta "+llave2+" es de tipo: "+almacen.get(llave2));
          }
          else{
            System.out.println("No existe esa carta");
          }
          break;
        case 3:
          Object[] todo3 = milista.entrySet().toArray();
          for(int i=0; i<=todo3.length-1; i++){
            String[] temp = todo3[i].toString().split("=");
            System.out.println("Hay "+temp[1]+" carta "+temp[0]+" de tipo "+almacen.get(temp[0]));
          }

          break;
        case 4:
          Object[] todo4 = milista.entrySet().toArray();
          for(int i=0; i<=todo4.length-1; i++){
            String[] temp = todo4[i].toString().split("=");
            if((almacen.get(temp[0]).equals("Hechizo"))){
              System.out.println("Hay "+temp[1]+" carta "+temp[0]+" de tipo "+almacen.get(temp[0]));
            }
          }
          for(int i=0; i<=todo4.length-1; i++){
            String[] temp = todo4[i].toString().split("=");
            if((almacen.get(temp[0]).equals("Monstruo"))){
              System.out.println("Hay "+temp[1]+" carta "+temp[0]+" de tipo "+almacen.get(temp[0]));
            }
          }
          for(int i=0; i<=todo4.length-1; i++){
            String[] temp = todo4[i].toString().split("=");
            if((almacen.get(temp[0]).equals("Trampa"))){
              System.out.println("Hay "+temp[1]+" carta "+temp[0]+" de tipo "+almacen.get(temp[0]));
            }
          }

          break;
        case 5:
          Object[] todo = almacen.entrySet().toArray();
          for(int i=0; i<=todo.length-1; i++){
            System.out.println(todo[i]);
          }
          break;
        case 6:
          Object[] todo6 = almacen.entrySet().toArray();
          for(int i=0; i<= todo6.length-1; i++){
            String[] temp = todo6[i].toString().split("=");
            if(temp[1].equals("Hechizo")){
              System.out.println(todo6[i]);
            }
          }
          for(int i=0; i<= todo6.length-1; i++){
            String[] temp = todo6[i].toString().split("=");
            if(temp[1].equals("Monstruo")){
              System.out.println(todo6[i]);
            }
          }
          for(int i=0; i<= todo6.length-1; i++){
            String[] temp = todo6[i].toString().split("=");
            if(temp[1].equals("Trampa")){
              System.out.println(todo6[i]);
            }
          }
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
