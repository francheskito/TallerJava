package co.sofka.java;

import co.sofka.java.Controladores.ControladorPersona;
import co.sofka.java.Series.Series;
import co.sofka.java.Series.Videojuego;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String seguir;
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            System.out.print("Ingresar ejercicio: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1(2, 3);
                    break;
                case 2:
                    ejer2(sc);
                    break;
                case 3:
                    ejer3(sc);
                    break;
                case 4:
                    ejer4(sc);
                    break;
                case 5:
                    ejer5();
                    break;
                case 6:
                    ejer6();
                    break;
                case 7:
                    ejer7();
                    break;
                case 8:
                    ejer8();
                    break;
                case 9:
                    ejer9();
                    break;
                case 10:
                    ejer10();
                    break;
                case 11:
                    ejer11();
                    break;
                case 12:
                    ejer12();
                    break;
                case 13:
                    ejer13();
                    break;
                case 14:
                    ejer14();
                    break;
                case 15:
                    ejer15();
                    break;
                case 16:
                    ejer16();
                    break;
                case 17:
                    ejer17();
                    break;
                case 18:
                    ejer18();
                    break;
                default:
                    opcion = 1;
            }
        } while (opcion != 0);
    }

    public static void ejercicio1(int valor1, int valor2) {
        if (valor1 > valor2) {
            System.out.println("el " + valor1 + " es mayor que " + valor2);
        } else if (valor1 < valor2) {
            System.out.println("el " + valor2 + " es mayor que " + valor1);
        } else {
            System.out.println("el " + valor1 + " y " + valor2 + " son iguales");
        }

    }

    public static void ejer2(Scanner sc) {
        System.out.println("ingrese valor 1: ");
        int valor1 = sc.nextInt();
        System.out.println("ingrese valor 2: ");
        int valor2 = sc.nextInt();
        ejercicio1(valor1, valor2);
    }

    public static void ejer3(Scanner sc) {
        System.out.println("ingrese el Radio de un circulo: ");
        double valor = sc.nextDouble();
        double areaDelCirculo = Math.PI * Math.pow(valor, 2);
        System.out.println("El area del circulo es:" + areaDelCirculo + " cm cuadrados");
    }

    public static void ejer4(Scanner sc) {
        System.out.println("ingrese el precio de un producto: ");
        final float IVA = 21;
        float precio = sc.nextFloat();
        float preciofinal = ((21 * precio) / 100) + precio;
        System.out.println("El precio final del producto es $" + preciofinal);
    }

    public static void ejer5() {
        int valor = 1;
        while (valor < 101) {
            if (valor % 2 == 0) {
                System.out.println(valor + " es par");
            } else {
                System.out.println(valor + " es impar");
            }
            valor++;
        }

    }

    public static void ejer6() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }

        }
    }

    public static void ejer7() {
        Scanner sc = new Scanner(System.in);
        int numero = -1;
        do {
            System.out.println("Porfavor, ingrese un numero mayor o igual a 0");
            numero = sc.nextInt();
        } while (numero < 0);
        System.out.println("numero ingresado: " + numero);
    }

    public static void ejer8() {
        Scanner sc = new Scanner(System.in);
        String dia;
        System.out.println("ingrese un dia de la semana para saber si es laborable o no: Lunes, Martes,Miercoles,Jueves, Viernes, Sabado, Domingo");
        dia = sc.nextLine();
        switch (dia) {
            case "Lunes":
                System.out.println("Es un dia laboral");
                break;
            case "Martes":
                System.out.println("Es un dia laboral");
                break;
            case "Miercoles":
                System.out.println("Es un dia laboral");
                break;
            case "Jueves":
                System.out.println("Es un dia laboral");
                break;
            case "Viernes":
                System.out.println("Es un dia laboral");
                break;
            case "Sabado":
                System.out.println("Es un dia no laboral");
                break;
            case "Domingo":
                System.out.println("Es un dia no laboral");
                break;
            default:
                System.out.println("Ingrese un dia de forma correcta.");
        }
    }

    public static void ejer9() {
        String texto = "La sonrisa sera la mejor arma contra la tristeza ";
        System.out.println(texto);
        String remplazado = texto.replace("a", "e");
        System.out.print("Ingrese una frase para concatenar: ");
        Scanner sc = new Scanner(System.in);
        String textoparaanidar = sc.nextLine();
        System.out.println("Frase final " + remplazado.concat(textoparaanidar));
    }

    public static void ejer10() {
        String texto, sinespacios;
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese un texto");
        texto = sc.nextLine();
        sinespacios = texto.replace(" ", "");
        System.out.println("el texto sin espacios es: " + sinespacios);
    }

    public static void ejer11() {
        String texto, sinespacios;
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese una frase");
        texto = sc.nextLine();
        int largo = texto.length();
        int cantidadVocales = 0;
        for (int x = 0; x < texto.length(); x++) {
            if ((texto.charAt(x) == 'a') || (texto.charAt(x) == 'e') || (texto.charAt(x) == 'i') || (texto.charAt(x) == 'o') || (texto.charAt(x) == 'u')) {
                cantidadVocales++;
            }
        }
        System.out.println("La frase contiene: " + cantidadVocales + " vocales" + " y el largo de la frase es: " + largo);
    }

    public static void ejer12() {
        String texto1, texto2;
        Scanner sc = new Scanner(System.in);
        int largoCadena1 = 0;
        int largoCadena2 = 0;
        System.out.println("Porfavor ingrese dos frases, para ver si son iguales o sus diferencias");
        System.out.print("texto 1:");
        texto1 = sc.nextLine();
        System.out.print("texto 2:");
        texto2 = sc.nextLine();
        largoCadena1 = texto1.length();
        largoCadena2 = texto2.length();

        if (largoCadena1 != largoCadena2) {
            System.out.println("las cadenas son distintas, veamos sus diferencias");
            if (largoCadena1 < largoCadena2) {
                int i;
                for (i = 0; i < largoCadena1; i++) { //recorro el hasta que termine el texto 1
                    System.out.println("cadena 1 y 2 posicion " + i + " caracter:" + texto1.charAt(i) + "  " + texto2.charAt(i));
                }
                System.out.println("el contenido del string 1 termino en la posicion " + largoCadena1);
                System.out.println("por lo que no son iguales");

            } else if (largoCadena1 > largoCadena2) {
                int i;
                for (i = 0; i < largoCadena2; i++) { //recorro el hasta que termine el texto 1
                    System.out.println("cadena 1 y 2 posicion " + i + " caracter:" + texto1.charAt(i) + "  " + texto2.charAt(i));
                }
                System.out.println("el contenido del string 2 termino en la posicion " + largoCadena2);
                System.out.println("por lo que no son iguales");
            }

        } else {
            boolean soniguales = true;
            for (int i = 0; i < largoCadena1; i++) {
                if (texto1.charAt(i) != texto2.charAt(i)) {
                    soniguales = false;
                }
            }
            if (soniguales) {
                System.out.println("son iguales las frases ingresadas");
            } else {
                System.out.println("son distintas las frases ingresadas:");
                int i;
                for (i = 0; i < largoCadena2; i++) { //recorro el hasta que termine el texto 1
                    System.out.println("cadena 1 y 2 posicion " + i + " caracter:" + texto1.charAt(i) + "  " + texto2.charAt(i));
                }
            }
        }
    }

    public static void ejer13() {
        Date fecha = Calendar.getInstance().getTime();
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("fecha actual: " + dateformat.format(fecha));
    }

    public static void ejer14() {
        Scanner sc = new Scanner(System.in);
        int numeroingresado;
        System.out.println("ingrese un numero para contar hasta el 1000:");
        numeroingresado = sc.nextInt();
        for (int i = numeroingresado; i <= 1000; i += 2) {
            System.out.println(i);
        }
    }

    public static void ejer15() {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        String menu = ("****** GESTION CINEMATOGRÁFICA ********\n" +
                "   1-NUEVO ACTOR\n" +
                "   2-BUSCAR ACTOR\n" +
                "   3-ELIMINAR ACTOR\n" +
                "   4-MODIFICAR ACTOR\n" +
                "   5-VER TODOS LOS ACTORES\n" +
                "   6- VER PELICULAS DE LOS ACTORES\n" +
                "   7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "   8-SALIR");
        int opcion = 0;
        System.out.println(menu);
        do {

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Usted salio del menu");
                    seguir = false;
                    break;
                default:

                    System.out.println("OPCION INCORRECTO");
                    System.out.println(menu);
                    break;
            }
        } while (seguir);
    }

    public static void ejer16() {
        ControladorPersona ctrlPer = new ControladorPersona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese sexo: M o H");
        char generochar = sc.next().charAt(0);
        System.out.println("Ingrese edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese el peso");
        int peso = sc.nextInt();
        System.out.println("Ingrese altura en metros");
        double altura = sc.nextDouble();
        Persona persona = new Persona(nombre, edad, generochar, peso, altura);
        Persona persona2 = new Persona(nombre, edad, generochar);
        Persona persona3 = new Persona();
        persona3.setNombre("Antonio Banderas");
        persona3.setEdad(94);
        persona3.setAlturacm(4.98);
        persona3.setPeso(400);
        persona3.setGenero('H');

        ctrlPer.comprobarPesoYEdad(persona);
        ctrlPer.comprobarPesoYEdad(persona2);
        ctrlPer.comprobarPesoYEdad(persona3);

        System.out.println(persona.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }

    public static void ejer17() {
        //int precio_base, String color, char consumo_energetico, int peso, int carga
        Electrodomesticos[] electrodomesticos = new Electrodomesticos[10];
        electrodomesticos[0] = new Lavadora(100, "azul", 'A', 19, 5000);
        electrodomesticos[1] = new Lavadora(100, "blanco", 'F', 2000, 5000);
        electrodomesticos[2] = new Lavadora(100, "GRIS", 'C', 2000, 5000);
        electrodomesticos[3] = new Lavadora(100, "ROJO", 'E', 2000, 5000);
        electrodomesticos[4] = new Electrodomesticos(10000, "rojo", 'F', 2000);
        electrodomesticos[5] = new Television(100, "negro", 'B', 2000, 5000, true);
        electrodomesticos[6] = new Television(100, "negro", 'B', 2000, 5000, true);
        electrodomesticos[7] = new Television(100, "negro", 'B', 2000, 5000, true);
        electrodomesticos[8] = new Television(100, "rojo", 'B', 2000, 5000, true);
        electrodomesticos[9] = new Television(100, "morado", 'B', 2000, 5000, true);


        for (Electrodomesticos x : electrodomesticos) {
            x.preciofinal();
        }
        int preciotvs = 0;
        int preciolavas = 0;
        int preciototal = 0;
        for (Electrodomesticos x : electrodomesticos) {
            if (x instanceof Television) {
                preciotvs += x.getPrecio_base();
            } else if (x instanceof Lavadora) {
                preciolavas += x.getPrecio_base();
            }

            preciototal += x.getPrecio_base();

        }

        System.out.println("el precio de los televisores es $"
                + preciotvs
                + "\n el precio de los lavaropa es $"
                + preciolavas +
                "\n el precio total es$" + preciototal);

    }

    public static void ejer18() {
        Series series[] = new Series[5];
        Videojuego juegos[] = new Videojuego[5];

        series[0] = new Series();
        series[1] = new Series();
        series[2] = new Series("Arrow", "DC");
        series[3] = new Series("Hawkeye", "Marvel");
        //String titulo, int numero_de_temporadas, String genero, String creador
        series[4] = new Series("Loki", 1, "Ciencia Ficcion", "Marvel");

        juegos[0] = new Videojuego("CS GO", 1000);
        juegos[1] = new Videojuego("Minecraft", 60);
        juegos[2] = new Videojuego();
        juegos[3] = new Videojuego();
        juegos[4] = new Videojuego("God Of War", 60000, "Accion", "Sony");

        juegos[2].entregar();
        juegos[3].entregar();
        series[4].entregar();
        series[0].entregar();
        System.out.println("Series entregadas:" + contarEntregasSeries(series));
        System.out.println("Juegos entregados:" + contarEntregasJuegos(juegos));
        videojuegoConMasHoras(juegos);
        serieMasLarga(series);

    }

    public static int contarEntregasJuegos(Videojuego juegos[]) {
        int total = 0;
        for (Videojuego juego : juegos) {
            if (juego.isEntregado()) {
                total++;
                System.out.println(juego.getTitulo() + " Juego Entregado");
            }
        }
        return total;
    }

    public static int contarEntregasSeries(Series series[]) {
        int total = 0;
        for (Series serie : series) {
            if (serie.isEntregado()) {
                total++;
                System.out.println(serie.getTitulo() + " Serie Entregada");
            }
        }
        return total;
    }

    public static void videojuegoConMasHoras(Videojuego juegos[]) {
        Videojuego juegomayor = new Videojuego();
        juegomayor.setHorasestimadas(0);
        for (Videojuego juego : juegos) {
            juegomayor = (Videojuego) juegomayor.compareTo(juego);
        }
        System.out.println("el juego mas largo es " + juegomayor.toString());
    }

    public static void serieMasLarga(Series series[]) {
        Series serielarga = new Series();
        serielarga.setNumero_de_temporadas(0);
        for (Series serie : series) {
            serielarga = (Series) serielarga.compareTo(serie);
        }
        System.out.println("la serie mas larga es " + serielarga.toString());
    }

}