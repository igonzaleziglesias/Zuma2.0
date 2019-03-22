package bola;

import utilidades.DarColores;

public class Bola {

    private int color;
    private String bolita;

    public Bola() {//crear una bola de un color asignado a un valor numerico genereado aleatoriamente
        DarColores color = new DarColores();
        int n = ((int) (Math.random() * 5) + 1);
        switch (n) {
            case 1:
                this.color = n;
                this.bolita = color.DarColores(n);
                break;
            case 2:
                this.color = n;
                this.bolita = color.DarColores(n);
                break;
            case 3:
                this.color = n;
                this.bolita = color.DarColores(n);
                break;
//            case 4:
//                this.color = n;
//                this.bolita = color.DarColores(n);
//                break;
//            case 5:
//                this.color = n;
//                this.bolita = color.DarColores(n);
//                break;
            default:
                break;
        }
    }

    public int getColor() {//obtener el color, usamos el valor del string y no el numerico para hacer las comparaciones
        return color;
    }

    @Override
    public String toString() {//imprimir la bola de color
        return bolita;
    }
}
