package exerciciosLivro;

import javax.swing.JOptionPane;

public class GeraArray {

	public static void insereQuantidade(int numero) {

		// Definindo inicialmente o array com 0 posições
		int[] inteiro = new int[0];

		do {

			try {

				// Verificação da entrada de um valor.
				numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina o tamanho do Array : "));

				// Caso o número seja negativo ou igual a 0, gera uma mensagem no Prompt.
				if (numero <= 0) {

					JOptionPane.showMessageDialog(null, "Um array não pode ter um tamanho negativo ou igual a zero!!");

				} else {

					// Caso contrário , inicializa o tamanho do array com o valor fornecido
					inteiro = new int[numero];

					// Itera e atribui valores aleatorios como foi proposto pelo exercício.
					for (int i = 0; i < inteiro.length; i++) {

						inteiro[i] = (int) (Math.random() * 1000);
					}

					// Mostra no console os valores atribuidos e seu respectivo tamanho.
					for (int i = 0; i < inteiro.length; i++) {

						System.out.print(inteiro[i] + " ");
					}

				}

				// Captura do erro, caso o programa seja fechado ou valores inválidos sejam
				// disponbilizados!
			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null, "Você inseriu dados inválidos ou fechou o programa incorretamente");

			}

			// Mensagem final, mostra o tamanho do array fornecido pelo usuário
			JOptionPane.showMessageDialog(null, "Tamanho do Array = " + inteiro.length);

		} while (numero > 0);

	}

}
