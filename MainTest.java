import java.io.File;
import java.util.Map;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void main() {
        Factory<String,String> imp = new Factory<String,String>();
        Map almacen;
        Map milista;

        int res = 1; //Valor que se debe cambiar para pobar con los diferentes MAPS
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

        //Prueba 5
        Object[] todo = almacen.entrySet().toArray();
        for(int i=0; i<=700; i++){
            System.out.println(todo[i]);
        }
        /*
        //Prueba 6
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
        */
    }
}