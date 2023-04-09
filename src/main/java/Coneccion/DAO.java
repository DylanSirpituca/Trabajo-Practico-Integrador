package Coneccion;

import java.util.List;

public interface DAO<E, K> {

	E buscarPorClavePrimaria(K k); // String Integer

	boolean guardar(E e);

	boolean eliminar(E e);

	boolean mostrar(E e);

	List<E> listar();

}
