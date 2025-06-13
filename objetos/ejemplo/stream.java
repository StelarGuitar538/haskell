package ejemplo;

import java.util.List;
import java.util.stream.Collectors;

public class stream {
    List<Integer> originales = List.of(1,2,3,4,5);

    List<Integer> resultado = originales.stream()
        .filter(n -> n % 2 != 0)
        .map(n-> n * 2)
        .toList();

    System.out.println(resultado);


    List<String> palabras = List.of("juan","","hola","jose", "");

    List<String> res = palabras.stream()
    .filter(n -> !n.trim().isEmpty())
    .map(String::length)
    .collect(Collectors.toList());
    
}

