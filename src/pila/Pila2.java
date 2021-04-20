package pila;

public class Pila2 {

    class Nodo {
        int info;
        Nodo sig;
    }

    private Nodo raiz;

    public Pila2() {
        raiz = null;
    }

    public void insertar(int x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.sig = null;
            raiz = nuevo;
        } else {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public int extraer() {
        
            int informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
       
    }

    public boolean vacia() {
        return raiz == null;
    }

    public static void main(String[] ar) {
        Pila2 pila1 = new Pila2();
        pila1.insertar(10);
        pila1.insertar(40);
        pila1.insertar(3);
   
            while (!pila1.vacia())
                System.out.println("Extraemos de la pila:" + pila1.extraer());
            System.out.println("Extraemos de la pila:" + pila1.extraer());
        
    }
}