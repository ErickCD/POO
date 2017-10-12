package Demo_01_Herencia;

import java.util.Scanner;

public class AppTest {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        
        System.out.println("Desea ingresar informacion de un alumno o de un maestro?\nAlumno = 1\nMaestro = 2");
        
        do {
            System.out.print("Inserte la opcion: ");
            x = entrada.nextInt();
            
            if (x == 1) {
                proceso1();
            }
            if (x == 2) {
                proceso2();
            } 
            if (x == 3){
                System.out.println("Adios");
                break;
            }
            if (x != 1 && x != 2 && x != 3){
                System.err.println("Opcion no valida!!!!!!!!!");
            }
            
        } while (x != 1 || x != 2 || x != 3);
    }

    public static void proceso1() {
        Scanner entrada = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        System.out.print("Cuantos alumnos quiere registrar: ");
        int n = entrada.nextInt();

        Alumno arreglo[] = new Alumno[n];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new Alumno();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("\nAlumno: %d\n", (i + 1));
            System.out.print("En que semestre se encuentra el alumno(a)?: ");
            int semestre = entrada.nextInt();
            System.out.print("Nombre(s) del alumno(a): ");
            String nombre = texto.nextLine();
            System.out.print("Apellido paterno del alumno(a): ");
            String apellidop = texto.nextLine();
            System.out.print("Apellido materno del alumno(a): ");
            String apellidom = texto.nextLine();
            System.out.print("Ingrese la curp del alumno(a): ");
            String curp = texto.nextLine();
            System.out.print("Que edad tiene el alumno(a)?: ");
            int edad = entrada.nextInt();
            System.out.print("Ingrese el sexo del alumno(a): ");
            String sexo = texto.nextLine();

            arreglo[i].setSemestre(semestre);
            arreglo[i].setNombre(nombre);
            arreglo[i].setApePaterno(apellidop);
            arreglo[i].setApeMaterno(apellidom);
            arreglo[i].setCurp(curp);
            arreglo[i].setEdad(edad);
            arreglo[i].setSexo(sexo);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("\nAlumno: %d\n", (i + 1));
            System.out.printf("Nombre: %s\n", arreglo[i].toString());
            /**System.out.printf("Apellidos: %s %s\n", arreglo[i].getApeMaterno(), arreglo[i].getApePaterno());
            System.out.printf("Curp: %s\n", arreglo[i].getCurp());
            System.out.printf("Edad: %s\n", arreglo[i].getEdad());
            System.out.printf("Sexo: %s\n", arreglo[i].getSexo());
            * */
        }
    }

    public static void proceso2() {
        Scanner entrada = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);

        System.out.print("Cuantos maestros quiere registrar: ");
        int n = entrada.nextInt();

        Profesor arreglo[] = new Profesor[n];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new Profesor();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("\nProfesor: %d\n", (i + 1));
            System.out.print("Nombre(s) del Profesor(a): ");
            String nombre = texto.nextLine();
            System.out.print("Apellido paterno del Profesor(a): ");
            String apellidop = texto.nextLine();
            System.out.print("Apellido materno del Profesor(a) ");
            String apellidom = texto.nextLine();
            System.out.print("Ingrese la curp del Profesor(a): ");
            String curp = texto.nextLine();
            System.out.print("Que edad tiene el Profesor(a)?: ");
            int edad = entrada.nextInt();
            System.out.print("Ingrese el sexo del Profesor(a): ");
            String sexo = texto.nextLine();
            System.out.print("Ingrese el salio del Profesor(a): ");
            float salario = entrada.nextFloat();
            System.out.print("Ingrese la Cedula del Profesor(a): ");
            String cedula = texto.nextLine();

            arreglo[i].setNombre(nombre);
            arreglo[i].setApePaterno(apellidop);
            arreglo[i].setApeMaterno(apellidom);
            arreglo[i].setCurp(curp);
            arreglo[i].setEdad(edad);
            arreglo[i].setSexo(sexo);
            arreglo[i].setSalario(salario);
            arreglo[i].setCedula(cedula);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("\nProfesor: %d\n", (i + 1));
            System.out.printf("Nombre: %s\n", arreglo[i].getNombre());
            System.out.printf("Apellidos: %s %s\n", arreglo[i].getApeMaterno(), arreglo[i].getApePaterno());
            System.out.printf("Curp: %s\n", arreglo[i].getCurp());
            System.out.printf("Edad: %s\n", arreglo[i].getEdad());
            System.out.printf("Sexo: %s\n", arreglo[i].getSexo());
            System.out.printf("Salario: %s\n", arreglo[i].getSalario());
            System.out.printf("Cedula: %s\n", arreglo[i].getCedula());
        }
    }
}
