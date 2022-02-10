package com.biotech.bianca;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {


	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		// Lecture du fichier
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptoms = reader.getSymptoms();
		
		// Comptage des symptomes
		CountSymptoms counter = new CountSymptoms();
		Map<String, Integer> countedSymptoms = counter.countSymptoms(symptoms);
		
		// Ecriture des symptomes dans le fichier de sortie
		WriteFromDataMap writer = new WriteFromDataMap();
		writer.writeSymptomsToFile(countedSymptoms);
		
	}


}