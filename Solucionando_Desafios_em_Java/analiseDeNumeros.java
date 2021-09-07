import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class analiseDeNumeros {
    public static void main(String[] args) throws IOException {
        String linha;
        int Pos = 0, Neg = 0, Par = 0, Impar = 0, num = 0;
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            linha = buffer.readLine();
            num = Integer.parseInt(linha);
            

             if (num % 2 == 0) Par++; 
             else Impar++;
            
            if (num > 0) Pos++;
            if (num < 0) Neg++;
        }
        
        System.out.println("" + Par +" valor(es) par(es)");
        System.out.println("" + Impar + " valor(es) impar(es)");
        System.out.println("" + Pos + " valor(es) positivo(s)");
        System.out.println("" + Neg + " valor(es) negativo(s)");
    }
}
