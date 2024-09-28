import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Queue<String> cola = new LinkedList<>();
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar persona a la cola");
            System.out.println("2. Atender a la primera persona");
            System.out.println("3. Mostrar cola actual");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre de la persona: ");
                    String persona = scanner.nextLine();
                    cola.offer(persona);
                    System.out.println(persona + " ha sido agregada a la cola.");
                    break;

                case 2:
                    if (!cola.isEmpty()) {
                        System.out.println("Atendiendo a " + cola.poll());
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;

                case 3:
                    if (!cola.isEmpty()) {
                        System.out.println("Personas en la cola: " + cola);
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema.");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }
}