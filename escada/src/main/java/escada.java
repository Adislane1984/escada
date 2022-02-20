import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class escada {

    static Scanner entrada = new Scanner(System.in);
    static List<String> degraus = new ArrayList<>();

    public static void main(String[] args) {

System.out.print("Digite a quantidade de vezes: ");
    int qtdDegraus = entrada.nextInt();


for(int i = 0; i < qtdDegraus; i++) {
        degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
    }

for (String d : degraus ) {
    System.out.println(d);
        }
    }
}
