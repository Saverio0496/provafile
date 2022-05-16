package it.prova.provafile.test;

import java.io.*;

public class TestProvaFile {

	public static void main(String[] args) {
		String path = "C:\\Users\\savec\\ciao2.txt";
		try {
			File file = new File(path);
			if (file.exists())
				System.out.println("Il file " + path + " esiste");
			else if (file.createNewFile())
				System.out.println("Il file " + path + " è stato creato");
			else
				System.out.println("Il file " + path + " non può essere creato");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String path1 = "C:\\Users\\savec\\ciao2.txt";
		try {
			File file = new File(path1);
			FileWriter fw = new FileWriter(file);
			fw.write("Questo è il nostro primo file");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
