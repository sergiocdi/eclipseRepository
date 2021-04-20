package pila;

public class PilaVaciaException extends Exception {

    public PilaVaciaException(String mensaje) {
        super("Problema:" + mensaje);
    }

}
