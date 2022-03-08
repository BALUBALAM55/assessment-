import java.io.*;

public class Main {
	public static void main(String[]args){
		
		
		
		
		string file = "src\\details.csv";
		BufferedReader reader = null;
		string line = "";
		
		try{
			reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) !=null){
				
				string[] row = line.split(",");
				for(string index : row){
					System.out.printf("%-10s",index);
				}
				Sytem.out.println();
				
			}
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} 
			catch (IOException e){
				e.printStackTrace();
			}
		}
	}