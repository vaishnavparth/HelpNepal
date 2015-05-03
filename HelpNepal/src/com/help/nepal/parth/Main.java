package com.help.nepal.parth;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Joiner;

/**
 * 
 * @author pvaishnav
 *
 */
public class Main {

	public static void main(String args[]) throws IOException {
		if (args == null || args.length != 2) {
			System.out
					.println("Usage: java main inputJsonFilePath outputCsvFilePath");
			return;
		}
		// Open output file for writing
		PrintWriter out = new PrintWriter(new FileWriter(args[1]));
		try {
			// Read input file
			String inputText = new String(
					Files.readAllBytes(Paths.get(args[0])),
					StandardCharsets.US_ASCII);
			// Escape file idiosyncracies
			inputText = inputText.replace("\\", "");
			inputText = inputText.replace("class", "clasz");
			// Parse the input
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(
					DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

			FeatureCollection featureCollection = objectMapper.readValue(
					inputText, FeatureCollection.class);
			String header = Joiner.on(",").join("Feature_Type", "Id", "Name",
					"Link", "Category", "Color", "Icon", "Thumb", "TimeStamp",
					"Count", "Class", "Title", "FeatureId", "Description",
					"StrokeColor", "Geometry_Type", "Coordinates");
			out.write(header + "\n");
			out.write(featureCollection.toString());
		} catch (Exception e) {
			System.out.println("Exception encountered ");
			e.printStackTrace();
		} finally {
			out.close();
		}
		System.out.println("Exit: good bye!");
	}
}
