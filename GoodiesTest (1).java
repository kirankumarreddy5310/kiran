/**
 * 
 */
package org.oar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class GoodiesTest {

	public static void main(String[] args) throws IOException {
		
		PrintWriter writer = new PrintWriter("Sample_output.txt");
		String [] names = new String [10];
		int [] price = new int[10];
		BufferedReader reader = new BufferedReader(new FileReader("Sample_input.txt"));
		int count = 0;
		String line = reader.readLine();
		while(line != null) {
		String[] str = line.split(":");
		names[count] = str[0];
		price[count] = Integer.parseInt(str[1]);
		count++;
		line = reader.readLine();
		}
		
		
		System.out.println("Enter number of employee: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		writer.println("number of employee: " + num);
		Integer [] emp = new Integer[num];
		
		for(int i = 0 ; i < emp.length ; i++)
		{
			emp[i] = price[i];
		}
		
		Arrays.sort(emp);
		
		writer.println("Here the goodies that are selected for distribution are:");
		
		for(int i = 0 ; i < emp.length ; i++)
		{
			for(int j = 0 ; j < emp.length ; j++)
			{
				writer.println(names[i] + ":" + emp[i]);
				break;
			}
			System.out.println();
		}
		
		int diff = emp[emp.length - 1] - emp[0];
		writer.println("And the difference between the chosen goodie with highest price and the lowest price is " + diff);
		writer.flush();
		writer.close();
		System.out.println("pass");
	}

}


















