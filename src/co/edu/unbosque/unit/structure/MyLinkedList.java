package co.edu.unbosque.unit.structure;

import java.io.Serializable;

import co.edu.unbosque.model.Vuelo;

public class MyLinkedList<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    public class Node implements Serializable {
        private static final long serialVersionUID = 1L;
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size = 0;

    // Método recursivo para agregar un elemento a la lista
    public void add(T data) {
        head = addRecur(head, data);
        size++;
    }
    public Node getHead() {
        return head;
    }

    private Node addRecur(Node current, T data) {
        if (current == null) return new Node(data);
        current.next = addRecur(current.next, data);
        return current;
    }

    // Método recursivo para obtener un elemento de la lista
    public T get(int index) {
        return getRecursively(head, index, 0);
    }

    private T getRecursively(Node current, int index, int counter) {
        if (current == null) throw new IndexOutOfBoundsException("Índice fuera de rango");
        return (index == counter) ? current.data : getRecursively(current.next, index, counter + 1);
    }

    public int size() {
        return size;
    }

    // Métodos específicos para manejar objetos de tipo Viajero
    public void agregar(T viajero) {
        head = agregarRecursivo(head, viajero);
        size++;
    }

    private Node agregarRecursivo(Node nodo, T data) {
        if (nodo == null) return new Node(data);
        nodo.next = agregarRecursivo(nodo.next, data);
        return nodo;
    }


    public void mostrar() {
        mostrarRecursivo(head);
    }

    private void mostrarRecursivo(Node nodo) {
        if (nodo == null) return;
        System.out.println(nodo.data.toString());
        mostrarRecursivo(nodo.next);
    }
    public MyLinkedList<T> getRest() {
        MyLinkedList<T> rest = new MyLinkedList<>();
        rest.head = head != null ? head.next : null;
        return rest;
    }
    public T getHeadData() {
        return head != null ? head.data : null;
    }
}
