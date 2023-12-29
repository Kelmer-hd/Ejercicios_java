public class ListaSimpleEnlazada {
    private Nodo cabeza;

    public ListaSimpleEnlazada() {
        this.cabeza = null;
    }

    public void agregarAlInicio(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    public void agregarAlFinal(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }

        Nodo ultimo = cabeza;
        while (ultimo.siguiente != null) {
            ultimo = ultimo.siguiente;
        }

        ultimo.siguiente = nuevoNodo;
    }

    public void imprimirLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaSimpleEnlazada lista = new ListaSimpleEnlazada();

        lista.agregarAlInicio(3);
        lista.agregarAlInicio(2);
        lista.agregarAlInicio(1);

        lista.imprimirLista(); // Salida: 1 2 3

        lista.agregarAlFinal(4);
        lista.agregarAlFinal(5);

        lista.imprimirLista(); // Salida: 1 2 3 4 5
    }
}
