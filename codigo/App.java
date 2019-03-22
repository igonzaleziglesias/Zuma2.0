package codigo;


import javax.swing.JOptionPane;

public class App {

    public static int controlador;

    public App() {//menu iniciar partida o no
        String[] inicio = {"INICIAR PARTIDA", "EXIT"};
        int iniciar = JOptionPane.showOptionDialog(
                null,
                "Elegir nivel",
                null,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                inicio,
                null
        );

        switch (iniciar) { //menu elegir nivel de dificultad
            case 0:

                break;
            default:
                break;
        }
    }

}
