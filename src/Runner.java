
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Runner {
	public static Random  rnd = new Random();
	
	public static void main(String[] args) throws IOException   {
		RandomString name = new RandomString(11, false);
		RandomString address = new RandomString(69, true);
		RandomString description = new RandomString(47, true);
		final int employeeDataSize = 100000;
		final int projectDataSize = 80000;
		
		File file = new File("Employees2.txt");
		if(! file.exists()){
			BufferedWriter fw = new BufferedWriter(new FileWriter(file));
			for(int i = 0; i <employeeDataSize; i++){
				fw.write(randomInteger(7)+name.nextString()+" "+randomInteger(2)+randomInteger(9)+" "+address.nextString());
				fw.newLine();
			}
			fw.flush();
			fw.close();
		}
		file = new File("Project2.txt");
		if(! file.exists()){
			BufferedWriter fw = new BufferedWriter(new FileWriter(file));
			for(int i = 0; i <projectDataSize; i++){
				fw.write(randomInteger(7)+""+randomInteger(5)+" "+description.nextString());
				fw.newLine();
			}
			fw.flush();
			fw.close();
		}
	}
	
	public static int randomInteger(int digit){

		return (int) Math.pow(10, digit-1) + rnd.nextInt((int) Math.pow(10, digit-1) * 9);
	}
	
	

}
