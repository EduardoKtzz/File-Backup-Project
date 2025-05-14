package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Projeto {
	public static void main(String[] args) {
		
		System.out.println();
		Scanner sc = new Scanner(System.in);

		//Caminho dos arquivos
		String path = "C:\\Users\\Eduar\\Documentos\\Programação\\Java\\src\\model\\txt\\java.txt";
		String pathStr = "C:\\Users\\Eduar\\Documentos\\Programação\\Java\\src\\model\\txt\\ProjetoBackup.txt";

		List<String> arquivoLinha = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				arquivoLinha.add(line);
				line = br.readLine();
			}
		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathStr))) {
			for (String linhas : arquivoLinha) {
				bw.write(linhas);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
