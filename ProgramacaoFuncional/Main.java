import java.util.Arrays;
import java.util.List;

public class Main { 
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(0, -2, 15, 34, -18, 22, -9); 

        int soma = lista.stream().filter(x -> x >= 0).reduce(0, Integer::sum);

        System.out.println("Soma dos positivos: " + soma); // Correção aqui
    }
}