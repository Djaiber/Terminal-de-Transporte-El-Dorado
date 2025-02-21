package co.edu.unbosque.model.persistence;

import java.io.*;

import co.edu.unbosque.model.Vuelo;
import co.edu.unbosque.unit.structure.MyLinkedList;

public class VueloDAO {
    private static final String FILE_NAME = "vuelos.txt";

    public void guardarVuelos(MyLinkedList<Vuelo> vuelos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(vuelos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public MyLinkedList<Vuelo> cargarVuelos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (MyLinkedList<Vuelo>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new MyLinkedList<>();
        }
    }
}
