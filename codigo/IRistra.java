package codigo;

import bola.Bola;
import java.util.ArrayList;

public interface IRistra {//metodos esenciales de la ristra
   public abstract void nuevaBola(Bola bola);
   public abstract void mostrarConFormato(ArrayList<Bola> bola);
   public abstract ArrayList<Bola> disparar(Bola bola,int pos);
   public abstract void explotar(int posicion, int acumulador, int acumulador2);
   public abstract int puntuacion(int bolasJuntas);
   public abstract int puntuacionConcatenacion();
  
}
