package Main;

import java.util.Scanner;

import Dominio.LicInformatica;
import Implementacion.ImpInformatica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = null;

		// Atributos
		Long cedula;
		String titulo;
		String pc;
		String lenguajesProg;
		LicInformatica informatica = null;

		int menuPrin, menuInfo, subMenu, indice;

		// Implementacion de clase
		ImpInformatica inform = new ImpInformatica();

		do {
			System.out.println("Menu principal");
			System.out.println("1 - crud de lic. Informatica");
			System.out.println("2 - salir");
			lectura = new Scanner(System.in);
			menuPrin = lectura.nextInt();

			switch (menuPrin) {
			case 1: // -- crud informatica
				do {
					System.out.println("Menu informatica");
					System.out.println("1 - Alta");
					System.out.println("2 - Mostrar");
					System.out.println("3 - Buscar");
					System.out.println("4 - Editar");
					System.out.println("5 - Eliminar");
					System.out.println("salir");
					lectura = new Scanner(System.in);
					menuInfo = lectura.nextInt();
					switch (menuInfo) {
					case 1:
						System.out.println("Ingresar cedula ");
						lectura = new Scanner(System.in);
						cedula = lectura.nextLong();

						System.out.println("Ingresar Titulo");
						lectura = new Scanner(System.in);
						titulo = lectura.nextLine();

						System.out.println("Ingresar tipo de pc");
						lectura = new Scanner(System.in);
						pc = lectura.nextLine();

						System.out.println("Ingresar lenguaje de programación");
						lectura = new Scanner(System.in);
						lenguajesProg = lectura.nextLine();

						// Objeto
						informatica = new LicInformatica(cedula, titulo, pc, lenguajesProg);

						// Guardar
						inform.guardar(informatica);
						System.out.println("Se gurdo");

						break;
					case 2:
						inform.mostrar();
						break;
					case 3:
						inform.indiceDes();

						System.out.println("Ingrese el indice a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar
						informatica = (LicInformatica) inform.buscar(indice);
						System.out.println("Se encontro " + informatica);
						break;
					case 4:
						inform.indiceDes();

						System.out.println("Ingrese el indice a Editar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Buscar
						informatica = (LicInformatica) inform.buscar(indice);
						System.out.println("Se encontro " + informatica.getTitulo());

						// Editar -- cedula y pc
						do {
							System.out.println("Submenu editar");
							System.out.println("1 - Editar cedula");
							System.out.println("2 - editar pc");
							System.out.println("Regresar al menu informatica");
							lectura = new Scanner(System.in);
							subMenu = lectura.nextInt();

							switch (subMenu) {
							case 1:
								System.out.println("Ingrese la nueva cedula");
								lectura = new Scanner(System.in);
								cedula = lectura.nextLong();

								// Actualizar
								informatica.setCedula(cedula);
								inform.editar(indice, informatica);
								System.out.println("Se edito");
								break;
							case 2:
								System.out.println("Ingrese la nueva pc");
								lectura = new Scanner(System.in);
								pc = lectura.nextLine();

								// Actualizar
								informatica.setPc(pc);
								inform.editar(indice, informatica);
								System.out.println("Se edito");
								break;
							case 3:

								break;
							}
						} while (subMenu < 3);
						break;
					case 5:
						inform.indiceDes();

						System.out.println("Ingrese el indice a eliminar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// Eliminar
						inform.eliminar(indice);
						System.out.println("Se elimino");
						break;
					case 6:

						break;

					}
				} while (menuInfo < 6);
				break;

			case 2: // -- Salir
				break;
			}
		} while (menuPrin < 2);
	}

}
