package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import co.edu.unbosque.model.Viajero;
import co.edu.unbosque.unit.structure.MyLinkedList;

public class ViajeroDAO {
    private static final String FILE_NAME = "viajeros.txt";

    public void guardarViajeros(MyLinkedList<Viajero> viajeros) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(viajeros);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
	public MyLinkedList<Viajero> cargarViajeros() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (MyLinkedList<Viajero>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new MyLinkedList<>();
        }
    }
}