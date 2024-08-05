package collections_exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> candidateVotes = new HashMap<>();
		
		System.out.print("Enter file full path: ");
		String stringPath = sc.nextLine();
		File filePath = new File(stringPath);
		
		// Read the file pointed to by the user:
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
		
			String line = bufferedReader.readLine();
			int lineNumber = 1;

			while (line != null) {

				String[] lineFields = line.split(",");
				String lineCandidateName = lineFields[0];
				int lineCandidateVotes = Integer.parseInt(lineFields[1]);
				
				if (candidateVotes.containsKey(lineCandidateName)) {
					
					int votesSoFar = candidateVotes.get(lineCandidateName);
					candidateVotes.put(lineCandidateName, lineCandidateVotes + votesSoFar);
					
				}
				else {

					candidateVotes.put(lineCandidateName, lineCandidateVotes);
					
				}
				
				System.out.println(lineNumber + ": " + line);
				lineNumber++;
				line = bufferedReader.readLine();
				
			}
			
		} catch (IOException e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
		System.out.println();
		System.out.println(candidateVotes.toString());

		sc.close();

	}

}
