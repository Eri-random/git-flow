package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream impares = Stream.iterate(1, x -> x + 2).limit(10);

        impares.forEach(System.out::println);

        // Definir el BinaryOperator sum que referencia al método estático Integer::sum
        BinaryOperator<Integer> sum = Integer::sum;

        // Ejemplo de suma usando el BinaryOperator sum
        int num1 = 5;
        int num2 = 10;

        int resultado = sum.apply(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);

        List<String> ciudades = new ArrayList<>(){{
            add("Buenos Aires");
            add("Ciudad Evita");
            add("Brasilia");
        }};

      ciudades =  ciudades.stream().filter(c -> c.charAt(0) == 'B').collect(Collectors.toList());

      System.out.println(ciudades);

        /*List<String> lista = Arrays.asList("Taller", "Taller Lambdas y API Stream");
        //  Stream<Stream<String>>
        Stream stream = lista.stream()
                .map(s ->  s.split(" ")) // Stream<String[]>
                .flatMap(Arrays::stream) // Stream<String>
                .distinct(); //  Stream<String> de 5 elementos

        stream.forEach(System.out::println);*/

        List<String>  palabras = Arrays.asList("Java", "Lambdas",  "Stream", "API");

        Optional<String> alguno = palabras.stream().findAny();

        System.out.println(alguno.get());

        System.out.println("Hola mundo");


    }
}