import java.io.IOException;
import java.util.Scanner;

public class encaixaOuNao {
  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int N = leitor.nextInt();
    for (int i = 0; i < N; i++) {
      String A = leitor.next();
      String B = leitor.next();
      System.out.println((A.endsWith(B)) ? "encaixa" : "nao encaixa");
    }
  }
}