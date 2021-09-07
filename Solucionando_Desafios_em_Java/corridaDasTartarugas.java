import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class corridaDasTartarugas {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);


        //continue a solucao de acordo com o solicitado

        int maior = 0;
        int atual = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int velocidade = 0;
        int nivel = 0;
        int tentativas = 3;
            while (tentativas>0) {
                int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        arrayList.add(sc.nextInt());
                        atual = arrayList.get(i);
                            if (atual > maior) {
                                maior = atual;
                                velocidade = atual;
                                if (velocidade < 10) {
                                    nivel = 1;
                                } else if (velocidade >= 10 && velocidade < 20) {
                                    nivel = 2;
                                } else if (velocidade >= 20) {
                                    nivel = 3;
                                }
                            }
                    }
                    maior = 0;
                    arrayList.clear();
                    tentativas--;
                    System.out.println(nivel);
            }
    }
}