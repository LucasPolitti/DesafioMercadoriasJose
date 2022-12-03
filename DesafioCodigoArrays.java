import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class DesafioCodigoArrays {
    public static void main(String[] args) {
        
    List<Integer> mercadoriasJose = Arrays.asList (2, 3, 5, 7, 13, 18, 34);

    List<Integer> mercadoriasJoseUrgentes = mercadoriasJose.stream()
    .filter(i -> (i % 2 == 0))
    .collect(Collectors.toList());

    mercadoriasJoseUrgentes.forEach(System.out::println);




    }


}