package addressbook.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;

import addressbook.model.Contacts;

public class JSONFile {

	static File file = new File("AddressBook.json");
	
	//create
	public void createFile() {
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//write
	public void writeFile(Contacts contacts) {
		Gson gson = new Gson();
		String jsonData = gson.toJson(contacts);
		System.out.println(jsonData);
		try {
		FileWriter fileWriter = new FileWriter(file,true);
		fileWriter.write(jsonData);
		System.out.println("JSON updated");
		fileWriter.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//read file
		public void readFile() {
			try {
				Scanner readFile = new Scanner(file);
				while(readFile.hasNextLine()) {
					String readLine = readFile.nextLine();
					System.out.println(readLine);
				}
				readFile.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

}
