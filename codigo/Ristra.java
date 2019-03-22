package codigo;

import bola.Bola;
import excepciones.FueraDeRango;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static utilidades.Constantes.PUNTOSCONCA;

public class Ristra implements IRistra {
    int control = 0;
    private int puntuacion;
    private ArrayList<Bola> ristraBolas = new ArrayList<Bola>();

    @Override
    public void nuevaBola(Bola bola) {
        ristraBolas.add(bola);
    }

    public int longitud() {//Obtener el tamaño de la ristra de bolas
        return ristraBolas.size();
    }

    public int getPuntuacion() {//metodo par obtener la puntuacion de la partida
        return puntuacion;
    }

    public void mostrarAñadiendoDerecha() {//mostrar ristra bolas sin formato
        System.out.println("");
        for (Bola ele : ristraBolas) {
            System.out.print(ele.toString());
        }
    }

    public ArrayList<Bola> invertir() {//dar formato a la ristra(invirtiendo el orden en el que se muestra
        ArrayList<Bola> reverse;

        if (ristraBolas != null) {
            reverse = new ArrayList<>();
            for (int i = ristraBolas.size() - 1; i >= 0; i--) {
                reverse.add(ristraBolas.get(i));
            }
        } else {
            reverse = null;
        }
        return reverse;
    }

    @Override
    public void mostrarConFormato(ArrayList<Bola> bola) {
        System.out.println("");
        System.out.println("Ristra: ");
        System.out.println("");
        System.out.print("  ");
        for (int i = longitud(); i >= 1; i--) {
            System.out.printf("%4d", i);
        }
        System.out.println("");

        System.out.print("==");
        for (Bola ele : bola) {
            System.out.printf("%3s", "");
            System.out.print(ele.toString());
        }
        System.out.println("");
        System.out.println("\nPuntuacion: " + puntuacion + "\n");
    }

    public void dispararRistraVacia(Bola bola, int pos, MetodosAuxiliares ayuda,int acumulador,int acumulador2,int bolasJuntas) {
       ristraBolas.add(bola); 
    }

    public void dispararRistraFinal(Bola bola, int pos) {
        ristraBolas.add(bola);
    }

    public void dispararRistra(Bola bola, int pos) {

    }

    @Override
    public ArrayList<Bola> disparar(Bola bola, int posicionConcatena) {
        MetodosAuxiliares ayuda = new MetodosAuxiliares();

        int posicion = 0;
        if (control == 0) {
            try {
                posicion = ayuda.pedirPosicion(longitud());
            } catch (FueraDeRango ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            posicion = posicionConcatena;
        }
        
        int acumulador = 1, acumulador2 = 1, controlador = 0/*necesario?*/, bolasJuntas = 0, longitud = longitud();

        
        
        
        return ristraBolas;
    }

    @Override
    public void explotar(int posicion, int acumulador, int acumulador2) {
        if (ristraBolas.isEmpty()) {
//            throw new ListaVacia("Lista Vacia");
        }
        ristraBolas.remove(posicion);//elimina la bola insertada
        acumulador = acumulador - 1;//quitamos la posicion en la que introducimos que ya la eliminamos
        acumulador2 = acumulador2 - 1;//quitamos la posicion en la que introducimos 

        while (acumulador != 0) {//borra las bolas iguales a la de la posicion que estaban situdas detras de la que disparamos
            if (ristraBolas.isEmpty()) {
//                throw new ListaVacia("Lista Vacia");
            }
            ristraBolas.remove(posicion);
            acumulador--;
        }
        int i = 1;
        while (acumulador2 != 0) {//borra las bolas iguales a la de la posicion que estaban situadas por delante de la que disparamos
            if (ristraBolas.isEmpty()) {
//                throw new ListaVacia("Lista Vacia");
            }
            ristraBolas.remove(posicion - i);
            i++;
            acumulador2--;
        }
//        SonidoExplotar sonido = new SonidoExplotar();
    }

    @Override
    public int puntuacion(int bolasJuntas) {
        int puntos = 1;
        if (bolasJuntas > 3) {
            for (int i = 4; i <= bolasJuntas; i++) {
                puntos++;
                puntos++;
            }
        }

        return puntos;
    }

    @Override
    public int puntuacionConcatenacion() {
        return PUNTOSCONCA;
    }

}
