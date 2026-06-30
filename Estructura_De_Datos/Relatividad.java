 import java.util.List;

import javax.swing.JOptionPane;

public class Relatividad {
    // conteo con recursividad 
  /*   public static int contElementos(List<Integer> lista, int index) {
        if (index == lista.size()) {
            return 0;
        } else {
            return 1 + contElementos(lista, index + 1);
        }
    }

    // conteo con iteración 
    public static int contElementosIte(List<Integer> lista) {
        int count = 0;
        for (int i = 0; i < lista.size(); i++) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6);

        int countRecursivo = contElementos(numeros, 0);
        int countIterativo = contElementosIte(numeros);

        System.out.println("Conteo recursivo: " + countRecursivo);
        System.out.println("Conteo iterativo: " + countIterativo);
    }
   // Practic 1
   //Suma de elementos de una lista con recursividad
   public static int sumaElementosLis(List<Integer>lista, int index){
      if (index==lista.size()){
         return 0;// caso base, cuando se llega al final de la lista, se retorna 0 para no afectar la suma
      }else{

      return lista.get(index) + sumaElementosLis(lista, index +1 );// se suma el elemento actual con la suma de los elementos restantes

    }

   }
    // Encontrar el número máximo en una lista con recursividad
    public static int encontrarNumeMaximo(List<Integer> Lista1, int index){ // el index se utiliza para recorrer la lista de manera recursiva 
        if (index== Lista1.size()){ // la condición de parada es cuando el index alcanza el tamaño de la lista, lo que significa
        //  que se ha recorrido toda la lista
            return Integer.MIN_VALUE;// caso base, cuando se llega al final de la lista, se retorna el valor mínimo posible para asegurar que cualquier número
            //  en la lista será mayor
            // Integer.MIN_VALUE es una constante en Java que representa el valor mínimo que un entero puede tener,
            //  lo que garantiza que cualquier número en la lista será mayor y no afectará el resultado final al comparar con otros números.
        }else{
            int maxRestante = encontrarNumeMaximo(Lista1, index +1);// se encuentra el número máximo en los elementos restantes de la lista
            return Math.max (Lista1.get(index), maxRestante);// se compara el elemento actual con el número máximo encontrado en los elementos restantes y
            //  se retorna el mayor de los dos 
            // Math.max es una función que devuelve el valor máximo entre dos números, en este caso, entre el elemento actual de la lista
            //  y el número máximo encontrado en los elementos restantes.
        }
    }

    //Contar elementos en una lista recursiva
    public static int contElementosR(List<Integer>Lista2, int index){
        if (index==Lista2.size()){
            return 0;
        }else{
            return 1 + contElementosR(Lista2, index +1 );// se cuenta el elemento actual y se suma con el conteo de los elementos restantes de la lista
            // se retorna 1 para contar el elemento actual y se llama recursivamente a la función para contar los elementos restantes,
            //  sumando ambos resultados para obtener el conteo total
        }
    }
*/
    // Semana 004 Introduccion a Pilas
    // Son datos abstratos que siguen el principio de LIFO (Last In, First Out), lo que significa que el último elemento agregado a la pila 
    // es el primero en ser removido.
    //ejemplo se puede comportar como un pila de platos, donde el último plato colocado en la pila es el primero que se retira.

    // Una pila puede manejar difererntes tipos de datos, como enteros, cadenas, objetos, etc.

    // ejemplo practico 
    /*Pila push(Pila p, Elemento e)
         si p.estaLlena()
            Lanzar error "Desbordameinto"
            Fin Si
            p.agregar(e)
            Retornar p;
    Fin
    
    Elememto pop(Pila p)
       Si P.estaVacia()
          Lanzar error "SubDesbordamiento"
        Fin Si
        Retornar p.eliminarUltimo()
    Fin*/
    
    /*Funciones de una pila:
     push(): Añade un elemento a la pila
     pop(): Elimina y devuelve el elemento superior de la pila
     peek(): Devuelve el elemento superior de la pila sin eliminarlo
     isEmpty(): Verifica si la pila está vacía
     isFull(): Verifica si la pila está llena
     size(): Devuelve el número de elementos en la pila
     */ 
// Practica de 30 dias en java 

// 1 - 5 Dias 
/*Tipo de datos y variables
Entradas y salidas
problemas promedio de notas conversion de unidadades calculo de areas*/

/*Variables: son espacios en memoria que se utilizan para almacenar datos.
Cada variable tiene un nombre y un tipo de dato asociado, como int, double, String, etc. Las variables pueden ser modificadas durante la ejecución del programa.*/

/*public class Variables {
    public static void main (String[] args){
        int edad = 25; // variable de tipo entero
        double altura = 1.75; // variable de tipo double
        String nombre = "Jesus";// variable de tipo String
        //salida de datos
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + edad);
        System.out.println("Altura:" + altura); 
    }
   }
// Problemas promedio de notas, conversion de unidades, calculo de areas
/*class Problemas {
    public static void main(String[] args){
        // Promedio de notas
        double notaPrimerMes = 90.5;
        double notaSegundoMes =90.5;
        double notaTercerMes = 80.5;
        int promedio = (int) ((notaPrimerMes + notaSegundoMes + notaTercerMes) / 3);  // se calcula el promedio sumando las notas y dividiendo por el número de notas
        System.out.println("La nota de su promedio es:" +promedio); //,luego se convierte a entero utilizando un cast (int) para obtener un resultado sin decimales
    }   

    public static void conversionUnidades(double metros){
        double centimetros = metros * 100; // se multiplica por 100 para convertir metros a centímetros
        System.out.println(metros + " metros son " + centimetros + " centímetros.");
    }

    public static void calculoAreaCirculo(double radio){
        double area = Math.PI * Math.pow(radio, 2); // se utiliza la fórmula del área del círculo: A = πr^2, donde Math.PI es una constante que representa el valor de π y Math.pow(radio, 2) calcula el radio elevado al cuadrado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);

    }*/
  /* }
   public class EstructuraDeDatos{
        public static void main(String[] args){
            // Ejemplo de uso de la función de conversión de unidades
            conversionUnidades(2.5); // Convierte 2.5 metros a centímetros
    
            // Ejemplo de uso de la función de cálculo del área del círculo
            calculoAreaCirculo(3.0); // Calcula el área de un círculo con radio 3.0
        }
        public static void conversionUnidades(double metros){
            double centimetros = metros * 100; // se multiplica por 100 para convertir metros a centímetros
            System.out.println(metros + " metros son " + centimetros + " centímetros.");
        }
    
        public static void calculoAreaCirculo(double radio){
            double area = Math.PI * Math.pow(radio, 2); // se utiliza la fórmula del área del círculo: A = πr^2, donde Math.PI es una constante que representa el valor de π y Math.pow(radio, 2) calcula el radio elevado al cuadrado
            System.out.println("El área del círculo con radio " + radio + " es: " + area);
   }
} 
*/
// RESUMEN

// "La clase Nodo define la estructura de cada elemento de la cola, almacenando un valor y una referencia al siguiente nodo.
//  La clase Cola administra esos nodos y mantiene las referencias necesarias para implementar la cola, 
//  permitiendo agregar elementos al final (enqueue) y eliminar elementos del frente (dequeue)."

 /*public class Nodo{
    String solicitudCliente;
    String nombreCliente;
    Nodo siguiente;

    public Nodo (String nombreCliente, String solicitudCliente){
        this.nombreCliente = nombreCliente;
        this.solicitudCliente = solicitudCliente;
        this.siguiente = null;
    }
  } 
 /*public class Cola{
    private Nodo inicio;
    private Nodo fin;
    private int tamano;

    public Cola(){
        this.inicio = null;
        this.fin = null;
        this.tamano = 0;
    }*/
/* 
    public void agregarCliente(String nombreCliente, String solicitudCliente){
        Nodo nuevoNodo = new Nodo(nombreCliente, solicitudCliente);
        if (fin == null){
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else{
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
         tamano ++;
    }*/
    /*public void mostrarSolicitudes(){
        Nodo actual = inicio;
        while (actual != null){
            System.out.println("Cliente: " + actual.nombreCliente + 
            "\nSolicitud: " + actual.solicitudCliente);
            actual = actual.siguiente;
        }
    } */
    /*public void eliminarCliente(){
        if(inicio != null){
            inicio = inicio.siguiente; // se mueve el inicio al siguiente nodo, eliminando efectivamente el primer nodo de la cola
            tamano --; // se decrementa el tamaño de la cola para reflejar la eliminación de un elemento

            if (inicio == null){ // si la cola queda vacía después de eliminar el primer nodo, se actualiza la referencia al último nodo a null
                fin = null; // esto asegura que la cola esté correctamente representada como vacía
            }
        }
    }
    public void  mostrarTamano(){
        System.out.println("El tamaño de la cola es:" + tamano);
    }*/
/* 
    public void peek(){ // Me muetra el primer cliente en la cola sin eliminarlo, con su nombre y solicitud.
        if(inicio != null){
            System.out.println("Primer cliente en la cola:");
            System.out.println("Nombre:" + inicio.nombreCliente);
            System.out.println("Solicitud: " + inicio.solicitudCliente);
        }else{
            System.out.println("La cola está vacía.");
        }
    }
}*/
// Hacer login  
/*public class Usuasrio{
    String username ;
    String password;

    public void Usuario(String username, String password){
        this.username = username;
        this.password = password;

    }

}*/


// crear login con joptionPane


    static String usuarioGuardado = "";
    static String contraGuardada = "";

    public static void main(String[] args) {
        logearse();
    }

    // Crear cuenta
    public static void creacionCuenta() {

        String usuario = JOptionPane.showInputDialog("Ingrese un nombre de usuario");
        String contrasena = JOptionPane.showInputDialog("Ingrese una contraseña");

        if (usuario.isEmpty() || contrasena.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar los datos solicitados");
            return;
        }

        usuarioGuardado = usuario;
        contraGuardada = contrasena;

        JOptionPane.showMessageDialog(null, "Cuenta creada correctamente");
    }

    // Iniciar sesión
    public static void iniciarSesion() {

        if (usuarioGuardado.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Primero debe crear una cuenta.");
            return;
        }

        String usuarioLogin = JOptionPane.showInputDialog("Ingrese su usuario");
        String contraLogin = JOptionPane.showInputDialog("Ingrese su contraseña");

        if (usuarioLogin.equals(usuarioGuardado) && contraLogin.equals(contraGuardada)) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nombre o contraseña incorrecta");
        }
    }

    public static void logearse() {

        int opcion1 = 0;

        do {
            try {

                opcion1 = Integer.parseInt(JOptionPane.showInputDialog(
                        "===== Inicio de Sesión =====\n"
                        + "1. Crear cuenta\n"
                        + "2. Iniciar Sesión\n"
                        + "3. Salir"));

                switch (opcion1) {

                    case 1:
                        creacionCuenta();
                        break;

                    case 2:
                        iniciarSesion();   // <-- Aquí llamas al método
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Saliendo");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número");
            }

        } while (opcion1 != 3);
    }
}



