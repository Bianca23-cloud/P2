package com.biotech.bianca;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFromDataMap {
	
	public void writeSymptomsToFile(Map<String, Integer> symptoms) {
		try {
			FileWriter writer = new FileWriter("output.txt");
			
			for (Map.Entry<String, Integer> e : symptoms.entrySet()) {
				
					writer.write(e.getKey() + " = " + e.getValue());
				
				writer.write(System.lineSeparator());
			}
		writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		
	}

}
