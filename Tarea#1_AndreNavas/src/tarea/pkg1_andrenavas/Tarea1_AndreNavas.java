/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg1_andrenavas;
import  java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Tarea1_AndreNavas {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int menu = 0; //iniializo el menu en 0 para el menu y poder salirse
        while(menu==0){
        System.out.println("Bienvenido a mi programa");
        System.out.println("A continuacion puede eligir una de las siguientes opciones para continuar");
        System.out.println("1. seleccione 1 para saber ¿Cuántos números pares e impares hay entre este rango?");
        System.out.println("2. Seleccione 2 para saber Triángulos y más Triángulos");
        System.out.println("3. Anita lava la tina");
        System.out.println("4. Codigos secretos");
        System.out.println("5. Opcion para salirse");
        int option_primermenu = entrada.nextInt();
        //Practicamente lo que hago es crear un menu donde le doy al usuario 5 opciones, la última opción a elegir es
        //para salir del programa y la leo como option_primermenu
        entrada.nextLine();
        // sirve para hacer un salto de linea y asi de esa manera mas adelante no se me arrine el lea que utilizo para el string
        // sirve para leer un entero y darle la option al usuario
        //de ingresar un numero
        switch(option_primermenu){ //practicamente le digo al programa que haga si option y le pongo las opciones posibles que son 5 sino pongo un default
            //para que deje de inventar
            case 1:
                System.out.println("Ingrese un numero cualquiera: ");
                int numero_ele = entrada.nextInt();
                entrada.nextLine();
                
                int numeros_par = 0;
                int numeros_impar = 0;
                int contador = 0;
                //declaro 3 cosas el contador para ir sumandole de 2 en la parte del par y despues reinicio el contador y utilizo otro metodo
                //pero al final sera el mismo resultado lo pongo afuera de las llaves del if para que sume de 1 pero el ul resultado es el mismo
                System.out.print("Entre 0 y " + numero_ele + " existen " +(numero_ele/2 +1)+ " numeros pares y estos son "); //hago el print pongo el numero elegido y hago una concatenación en el mismo,
                //En la parte donde pongo (numero?ele/2 +1) eso lo hago para sacar el resultado, en otras palabras solo le digo que si dividimos por 2 y le sumamos 1 vamos ha tener la cantidad
                //exacta de cuantas veces se puede dividir un numero par
                while (contador <= numero_ele) { //primer ciclo que se va repetir hasta que sea mayour o igual que el contador
                    if (contador % 2 == 0) { //primera condicion que va ser par siempre y cuando el numero elegido sea igual que 0 cuando sea dividio por 2
                        System.out.print(contador + ",");
                        numeros_par=numeros_par+1; //este es otro metodo que utilizo para sacar la cantidad de veces que el numero es divido este solo se 
                        //agrega cada vez que se repite el ciclo
                        contador=contador+2; //sumamos el contador a dos 2 y el contador practicamente dira los numeros pares
                    }
                }
                System.out.println();
                // lo imprimo afuera para que no se repita todo el mensaje 
                contador = 0; //contador lo inicializo en 0 para que no salga el resultado de par
                System.out.print("Entre 0 y " + numero_ele + " existen "+(numero_ele/2)+ " numeros impares y estos son "); 
                while (contador <= numero_ele) { 
                    if (contador % 2 != 0) { //hago lo mismo pero esta vez cuando contador divido entre 2 no sea igual que 0
                        System.out.print(contador + ","); //pongo la coma para que no salga pegado
                        numeros_impar++;  //agrego la misma cantidad de 1
                    }
                    contador++; //esta vez la inicializo desde afuera del if para que se sume 1 y comience desde 1 no desde 0
                }
                System.out.println();

                System.out.println("Total de números pares: " + numeros_par);  
                System.out.println("Total de números impares: " + numeros_impar);
                //print para ambas cantidades tanto de par y impar
                menu++;
                break;
                //cierro el ciclo
            case 2:
        
                    System.out.println("Bienvenido al programa de dibujo de triángulos.");
                    System.out.println("Por favor, seleccione una opción:");
                    System.out.println("1. Dibujar un triángulo rectángulo.");
                    System.out.println("2. Dibujar un triángulo equilátero.");
                    //sub menu lo creo
                    int opcion = entrada.nextInt();
                    // Consumir el salto de línea
                    entrada.nextLine();
    
                    if (opcion == 1) {
                        System.out.println("Por favor, introduzca la altura del triángulo rectángulo:");
                        int altura = entrada.nextInt();
                        entrada.nextLine();
                        //salto de linea para que me lea el string
                        for (int cont = 1; cont <= altura; cont++) { //primera vez que utilizo for.
                            //Este es el bucle externo que controla el número de filas en el triángulo. L
                            //La variable cont se inicializa en 1 y se incrementa en cada iteración hasta que alcanza o iguala el valor de altura.
                            for (int messi = 1; messi <= cont; messi++) {
                                System.out.print("*");
                            }
                            //Este es el bucle interno que controla el número de asteriscos en 
                            //cada fila del triángulo. La variable messi se inicializa en 1 y se incrementa en cada iteración hasta que alcanza o iguala el valor de i.
                            System.out.println();
                        }
                    } else if (opcion == 2) {
                        System.out.println("Por favor, introduzca la altura del triángulo equilátero:");
                        int altura = entrada.nextInt();
                        entrada.nextLine();

                        for (int cont = 1; cont <= altura; cont++) {
                            //Este es el bucle externo que controla el número de filas en la pirámide invertida. 
                            //La variable cont se inicializa en 1 y se incrementa en cada iteración hasta que alcanza o iguala el valor de altura.
                            for (int messi = 1; messi <= altura - cont; messi++) {
                                System.out.print(" ");
                            }
                            //Este es un bucle interno utilizado para imprimir 
                            //espacios en blanco antes de cada fila de asteriscos. La variable messi se inicializa en 1 y se incrementa en cada 
                            //iteración hasta que alcanza o iguala el valor de altura - cont. Esto asegura que haya una 
                            //cantidad decreciente de espacios en blanco en cada fila.
                            for (int messi = 1; messi <= cont; messi++) {
                                System.out.print("*");
                            }
                            // Este es otro bucle interno que controla el número de asteriscos en cada fila de la pirámide invertida. 
                            //La variable j se inicializa en 1 y se incrementa en cada iteración hasta que alcanza o iguala el valor de cont. 
                            //Esto asegura que haya un número creciente de asteriscos en cada fila.
                            System.out.println();
                        }
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    menu++;
                    break;
            case 3:                
                        System.out.print("Ingresa una palabra: ");
                        String palabra = entrada.nextLine();
                        // Eliminar espacios y convertir a minúsculas
                        palabra = palabra.replaceAll("\\s+", "").toLowerCase();
                        //Utiliza el método replaceAll() de la clase String para reemplazar todos los espacios en blanco en la cadena palabra. 
                        //La expresión regular "\\s+" busca uno o más espacios en blanco y los reemplaza por una cadena vacía, eliminándolos de la palabra.
                        boolean esPalindroma = true;
                        int longitud = palabra.length();
                        for (int cont = 0; cont < longitud / 2; cont++) { //Este es un bucle for que itera desde i = 0 hasta i < longitud / 2. La variable i 
                            //representa el índice de los caracteres en la palabra. 
                            //La condición longitud / 2 asegura que solo se compare hasta la mitad de la palabra, 
                            //ya que los caracteres opuestos en una palabra palíndroma deben ser iguales.
                            if (palabra.charAt(cont) != palabra.charAt(longitud - cont - 1)) {
                                esPalindroma = false;
                                break;
                            }
                        }

                        if (esPalindroma) {
                            System.out.println(palabra + " es una palabra palíndroma.");
                        } else {
                            System.out.println(palabra + " no es una palabra palíndroma.");
                        }
                        menu++;
                        break;
            case 4:
                    System.out.print("Ingresa la cadena de entrada (recuerde que debe ser en el formato Letra#Letra# y así sucesivamente): ");
                    String cadena = entrada.nextLine();
                    // lo declaramos como string porque son oraciones es lo quedebe ingresar al usuario
                    String nuevaPalabra = ""; // el espacio en blanco
                    int cont = 0;

                    while (cont < cadena.length()) { // se va cumplir la condición si y solo si cont es menor que tamaño de cadena
                        char letra = cadena.charAt(cont); //le pedimos que busque en la posicón de cont en cadena
                        int cantidad = Integer.parseInt(String.valueOf(cadena.charAt(cont + 1)));  //ocupamos poner tambien numero entonces cambiamos cadena
                        // a interger.parseInt para volverlo entero y asi poder poner numeros
                        //Utiliza el método valueOf() de la clase String para convertir el carácter obtenido en el paso anterior en una cadena. 
                        //Esto es necesario porque el método parseInt() espera una cadena como argumento.
                        int messi = 0;
                        while (messi < cantidad) {
                            nuevaPalabra += letra;
                            messi++;
                        }

                        cont += 2;
                    }

                    System.out.println("Salida esperada: " + nuevaPalabra);
                    menu++;
                    break; //termianamos ciclo
            case 5: //caso 5 es para salirse del menu
                 System.out.print("¿Desea continuar? (s/n): ");
                char continuar = entrada.next().charAt(0);

                if (continuar == 's') {
                    System.out.println("Saliendo del programa.");
                    menu = 0;
                    // Si el usuario ingresa 's', el programa continuará ejecutándose.
                } else {
                    System.out.println("Saliendo del programa.");
                    menu = 1;
                    // Si el usuario ingresa 'n', el programa finalizará.
                    break;
                }
                }
        }
      }    
    }
    
