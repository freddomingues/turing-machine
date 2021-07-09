import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewClass1 {
    public static void main(String[] args) {
        List<Empregado> empregados = Arrays.asList(
        new Empregado("Plops", 3456.50),
        new Empregado("Xops", 5234.90),
        new Empregado("Bob", 7234.99)
    );
    List<Double> salarios = empregados.stream().map(x -> 
            x.getSalario()).collect(Collectors.toList());        
    Double soma = salarios.stream().reduce(0.0, (a, b) -> a + b);
    System.out.println("Soma: " + soma);
    }
    
    static class Empregado {
        public String nome;
        public Double salario;

        Empregado(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
        }
        
        public Double getSalario() {
            return salario;
        }     
    }
}
