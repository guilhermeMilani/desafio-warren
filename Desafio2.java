import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chegadaNormal = 0;        
        System.out.println("Limite de alunos presentes no horario: ");
        int x = sc.nextInt();
        System.out.println("Quantidade de alunos:");
        int n = sc.nextInt();
        System.out.println("Escreva o tempo de chegada dos alunos:");
        int[] vect = new int[n];
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (vect[i] <= 0) {
                chegadaNormal++;
            }
        }
        if (chegadaNormal >= x) {
            System.out.println("Aula normal");
        } else {
            System.out.println("Aula cancelada");
        }
        sc.close();
    }
    
}