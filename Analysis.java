import java.util.*;
import java.io.*;
public class Analysis {

	public static void main(String[] args) {
		 
		Scanner gainedLost = null;
		Scanner hGained = null;
		Scanner hLost = null;
		Scanner whyGained = null;
		Scanner whyLost = null;
	
		
		try {
			gainedLost = new Scanner(new File("GainLost.txt"));
			hGained = new Scanner(new File("Hobbies Gained.txt"));
			hLost = new Scanner(new File("Hobbies Lost.txt"));
			whyGained = new Scanner(new File("WhyGained.txt"));
			whyLost = new Scanner(new File("WhyLost.txt"));
			
		} catch (FileNotFoundException e) {
			System.out.println("Somethings wrong");
			System.exit(-1);
		}
	
		int[] changeInHobbies = {0, 0, 0};
		
		while(gainedLost.hasNextLine()) {
			String line = gainedLost.nextLine();
			if(line.equals("Gained"))
				changeInHobbies[0]++;
			else if(line.equals("Lose"))
				changeInHobbies[1]++;
			else
				changeInHobbies[2]++;
		}
		
		System.out.println("The Number of People who Gained Hobbies is " + changeInHobbies[0] + ".");
		System.out.println("The Number of People who Lost Hobbies is " + changeInHobbies[1] + ".");
		System.out.println("The Number of People who neither gained nor lost hobbies is " + changeInHobbies[2] + ".");
	}

}
