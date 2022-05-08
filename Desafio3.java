
import java.util.ArrayList;
import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva o valor que deseja comparar:");
		Integer numero = sc.nextInt();
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		boolean continuar;
		do {
			System.out.println("Informe o valor para adicionar a lista:");
			listaNumeros.add(sc.nextInt());
			System.out.println("deseja continuar?");
			System.out.println("1 - sim");
			System.out.println("2 - não");
			continuar = sc.nextInt() == 1;
		} while (continuar);
		Integer listaFuncao[] = new Integer[listaNumeros.size()];
		for (int i = 0; i < listaNumeros.size(); i++) {
			if (listaNumeros.get(i) < numero)
				listaFuncao[i] = listaNumeros.get(i);
		}
		
		calculo(numero, listaFuncao);
        sc.close();
	}

	public static void calculo(Integer numero, Integer[] listaNumero) {
		for (int i = 0; i < listaNumero.length - 1; i++) {
			for (int j = 0; j < listaNumero.length - 1 - i; j++) {
				if (listaNumero[j] < listaNumero[j + 1]) {
					int aux = listaNumero[j];
					listaNumero[j] = listaNumero[j + 1];
					listaNumero[j + 1] = aux;
				}
			}
		}
		ArrayList<Integer> numerosUsados = new ArrayList<>();
		boolean numeroCorreto = true;
		int index = 0;
		Integer total = 0;
		while (numeroCorreto) {
			if (total + listaNumero[index] <= numero) {
				total += listaNumero[index];
				numerosUsados.add(listaNumero[index]);
			} else
				index++;

			if (index == listaNumero.length - 1 && total + listaNumero[index] > numero) {
				numeroCorreto = false;
			}
		}

		System.out.println("valor somado:" + total);
		System.out.println("numeros utilizados na soma:");
		for (int i = 0; i < numerosUsados.size(); i++) {
			System.out.println("valor " + i + ": " + numerosUsados.get(i));
		}
	}
}

