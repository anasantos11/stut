
/**
 * @author Ana Paula dos Santos
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ArquivoTurma {

	public static String[] pegarDadosTurma() throws Exception {
		String dados = "";
		String filename = "turma.txt";
		try {
			FileReader fr = new FileReader("turma.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while (line != null) {
				dados = dados + line;
				line = in.readLine();
			}
			in.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo \"" + filename + "\" não existe.");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro na leitura do arquivo " + filename + ".");
		}

		String[] arquivo = dados.split("/");
		return arquivo;

	}

	public static void finalizarDados() throws Exception {
		try {
			File f = new File("text.txt");
			FileWriter fr = new FileWriter(f);
			PrintWriter out = new PrintWriter(fr);
			out.println();
			out.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erro ao escrever arquivo.");
		}
	}

}
