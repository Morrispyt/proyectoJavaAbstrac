package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.LicInformatica;
import Interface.Metodos;

public class ImpGenerica implements Metodos {

	List<Object> lista = new ArrayList<Object>();

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		lista.add(obj);

	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);

	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Object obj) {
		// TODO Auto-generated method stub
		lista.set(indice, obj);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	public void indiceDes() {
		System.out.println("Registros en la lista");
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getClass().equals(LicInformatica.class)) {
				LicInformatica informt = null;

				// Casteo
				informt = (LicInformatica) lista.get(i);
				System.out.println("[" + i + "]" + informt.getTitulo());
			}
		}

	}
}
