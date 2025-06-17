import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtrar {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList(); 
        nomes.add("Ana Julia Vieira Machado"); 
        nomes.add("Ananda Eduarda Figueiredo Ferreira Santos"); 
        nomes.add("Anibal Soares Neto"); 
        nomes.add("Armando Alves De Oliveira Braga"); 
        nomes.add("Danilo Augusto Salvego Dos Santos"); 
        nomes.add("Diego Souza Vieira"); 
        nomes.add("Eduardo Alves Calza"); 
        nomes.add("Gabriel Witor Rodrigues De Almeida"); 
        nomes.add("Giovana Ribeiro dos Santos"); 
        nomes.add("Gustav Adolf Lutz Keller"); 
        nomes.add("Isabela Stefanuto Ribeiro Ferreira"); 
        nomes.add("João Cláudio Fernandes Michelato Colaço"); 
        nomes.add("Joao Henrique Meneguel De Oliveira"); 
        nomes.add("Juliana Góes Bello"); 
        nomes.add("Leandro De Freitas Neto"); 
        nomes.add("Matheus De Lima Benini"); 
        nomes.add("Miguel Valentim De Almeida"); 
        nomes.add("Ozeias da Rocha Moreira Junior"); 
        nomes.add("Paulo Vitor Da Luz Codognotto"); 
        nomes.add("Pedro Henrique De Oliveira"); 
        nomes.add("Rafael Tomaz Graciano"); 
        nomes.add("Vitor Hiroshi Higuchi"); 
        nomes.add("Vitor Hiroshi Higuchi"); 

        String filtro = "Henrique";

        List<String> nomesFiltrados = nomes.stream().filter(nome -> nome.toLowerCase().contains(filtro.toLowerCase())).collect(Collectors.toList());

        nomesFiltrados.forEach(System.out::println);
    }
}