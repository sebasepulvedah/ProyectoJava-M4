package com.alkemyf20260206;
import java.util.Scanner;


public class AlumnosNotas {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int alumnos = 14;
	        int notas = 7;

	        double[][] matriz = new double[alumnos][notas];

	        // Cargar notas con validación
	        for (int i = 0; i < 1; i++) {
	            System.out.println("Alumno " + (i + 1));

	            for (int n = 0; n < notas; n++) {
	                double nota;

	                while (true) {
	                    System.out.print("Ingrese nota " + (n + 1) + " (1.0 a 7.0, 0 = no rinde): ");
	                    nota = sc.nextDouble();

	                    if (nota == 0.0 || (nota >= 1.0 && nota <= 7.0)) {
	                        break;
	                    } else {
	                        System.out.println("❌ Nota inválida. Intente nuevamente.");
	                    }
	                }

	                matriz[i][n] = nota;
	            }
	            System.out.println();
	        }

	        // Calcular promedios
	        double sumaCurso = 0.0;
	        int totalNotas = 0;
	        int numeroAlumno = 1;

	        for (double[] fila : matriz) { // for-each
	            double sumaAlumno = 0.0;
	            int cantidadNotasValidas = 0;

	            for (double nota : fila) {
	                if (nota != 0.0) { // el 0 no afecta
	                    sumaAlumno += nota;
	                    cantidadNotasValidas++;
	                }
	            }

	            if (cantidadNotasValidas > 0) {
	                double promedioAlumno = sumaAlumno / cantidadNotasValidas;
	                System.out.println("Promedio Alumno " + numeroAlumno + ": " + promedioAlumno);

	                sumaCurso += sumaAlumno;
	                totalNotas += cantidadNotasValidas;
	            } else {
	                System.out.println("Alumno " + numeroAlumno + " sin notas válidas");
	            }

	            numeroAlumno++;
	        }

	        double promedioCurso = sumaCurso / totalNotas;
	        System.out.println("\nPromedio general del curso: " + promedioCurso);

	        sc.close();
	    }
	}
