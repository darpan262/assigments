package assig;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;

public class fileread {

	public static void main(String[] args) throws IOException
	{
		File f= new File("../assigments/dar1.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter br=new BufferedWriter(fw);
		for(int i=1;i<=3;i++)
		{
			
	
	br.write("welcome to you");
	br.newLine();
		}
	br.close();
	}
	}


