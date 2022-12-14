package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\Usuário\\eclipse-workspace\\FindingMax\\in.txt";
		
		List<Product> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			System.out.println("Most expensive value: ");
			System.out.println(CalculationService.max(list));
			
		}
		catch(IOException e) {
	
		}
		
		finally {
			sc.close();
		}
	}
}
