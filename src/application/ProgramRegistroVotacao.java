package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProgramRegistroVotacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> rv = new TreeMap<>(); // tree map ordena

		System.out.print("Enter file full path: ");
		System.out.println();

		//c:\temp\registroVotacao.txt
		String path = "c:\\temp\\registroVotacao.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(","); // separando a string em campos delimitado por espaço
				String candidato = fields[0];
				int votos = Integer.parseInt(fields[1]);

				if (rv.containsKey(candidato)) {
					int votosDoCandidato = rv.get(candidato);
					// operacao aritimetica com MAP
					rv.put(fields[0], votos + votosDoCandidato);
				} else {
					rv.put(fields[0], votos);
				}

				line = br.readLine();
			}

			for (String key : rv.keySet()) {
				System.out.println(key + ": " + rv.get(key));
//				System.out.println("O candidato " + key + " tem um total de" + rv.get(key) + " votos");
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
