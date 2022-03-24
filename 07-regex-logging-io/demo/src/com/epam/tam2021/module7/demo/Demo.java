package com.epam.tam2021.module7.demo;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	// Our shiny new logger, defined for 'Demo' class
	// (in this example the default configuration will be used)
	private static final Logger LOG = Logger.getLogger(Demo.class.getName());

	// This is how the "old" java.io works:
	private static String readFileWithIO(String fileName) throws IOException {
		String content = "";

		int c; // buffer variable to read file content character-by-character
		try (FileReader reader = new FileReader(fileName)) {
			while ((c = reader.read()) != -1) {
				content += (char) c;
			}
		} catch (Exception e) {
			// System.out.println(" :( "); <- old way, without a logger
			LOG.log(Level.SEVERE, " :( ");
		}

		return content;
	}

	// ...and this is the new one ("Files" and "Paths" classes):
	private static String readFileWithNIO(String fileName) throws IOException {
		byte[] bytes = Files.readAllBytes(Paths.get(fileName));
		String content = new String(bytes);

		// Another solution with java.nio:
		// List<String> content = Files.readAllLines(Paths.get("demo.txt"));

		return content;
	}

	// Our "main" method to demonstrate how the newly learned stuffs are working
	public static void main(String[] args) throws Exception {
		// Old way to send messages to the output:
		// System.out.println("with java.io: " + readFileIO("demo.txt"));
		// System.out.println("with java.nio: " + readFileNIO("demo.txt"));

		// ...and with a logger:
		LOG.log(Level.INFO, "File reading with java.io: " + readFileWithIO("demo.txt"));
		LOG.log(Level.INFO, "File reading with java.nio: " + readFileWithNIO("demo.txt"));

		// Let's extract the year and module info from demo.txt with a regex
		String fileContent = readFileWithNIO("demo.txt");

		Pattern regexPattern = Pattern.compile(".*([0-9]{4}).*(module #[0-9]+).*"); // regex
		Matcher regexMatcher = regexPattern.matcher(fileContent); // apply regex on the input

		if (regexMatcher.matches()) {
			String year = regexMatcher.group(1);
			String moduleInfo = regexMatcher.group(2);

			LOG.log(Level.INFO, "Year: " + year);
			LOG.log(Level.INFO, "Module info: " + moduleInfo);
		}
	}

}
