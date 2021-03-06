package program.jav.lockers;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Project {
	Set<String> fileDirectory= new TreeSet<String>();
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int input =7, input2;
		Project p= new Project();
		p.initialDisplay();
		while(true){
			System.out.println();
			System.out.println("Press 1 for: To get the file names in ascending order");
			System.out.println("Press 2 for: To perform other options");
			System.out.println("Press 0 for: To exit or close the application");
			try{
				input=sc.nextInt();
			}
			catch(Exception e){
				System.out.println("Please enter valid input. Restart your code.");
				break;
			}
			if(input==0){
				System.out.println("You have chosen to close the program.");
				break;
			}
			switch(input){
			case 1:
				p.display();
				break;
			case 2:
				p.otherOptions();
				try{
					input2=sc.nextInt();
				}
				catch(Exception e){
					System.out.println("Please enter valid input.");
					break;
				}
				
				switch(input2){
				case 3:
					System.out.println("You have pressed 3");
					p.addFile(sc);
					break;
				case 4:
					System.out.println("You have pressed 4");
					p.deleteFile(sc);
					break;
				case 5:
					System.out.println("You have pressed 5");
					p.searchFile(sc);
					break;
				case 6:
					System.out.println("You have pressed 6");
					break;
				default:
					System.out.println("You have entered wrong input.");
					break;
				}
				break;
			default:
				System.out.println("You have entered wrong input.");
				break;
			}
			
		}	
	}
	
	public void initialDisplay(){
		System.out.println("LockedMe.com");
		System.out.println("Lockers Pvt. Ltd.");
		System.out.println("You have following options to do operations: ");
	}
	
	public void otherOptions(){
		System.out.println("Press 3 for: To add a file to the user directory");
		System.out.println("Press 4 for: To delete a file from user directory");
		System.out.println("Press 5 for: To search for a file name in user directory");
		System.out.println("Press 6 for: To go back to main context");
	}
	
	public void addFile(Scanner sc){
		String str;
		System.out.println("Enter the file name: ");
		str=sc.next();
		fileDirectory.add(str);
		
	}
	
	public void deleteFile(Scanner sc){
		String str;
		System.out.println("Enter the file name to delete: ");
		str=sc.next();
		if(fileDirectory.contains(str)){
			fileDirectory.remove(str);
			System.out.println("File Deleted successfully.");
		}
		else{
			System.out.println("File not Found");
		}
	}
	
	public void searchFile(Scanner sc){
		String str;
		System.out.println("Enter the file name you want to search in directory: ");
		str=sc.next();
		if(fileDirectory.contains(str)){
			System.out.println("File found in the directory.");
		}
		else{
			System.out.println("File does not found in the directory");
		}
		
	}
	
	public void display(){
		if(fileDirectory.size()==0){
			System.out.println("File directory is empty.");
		}
		else{
			System.out.println(fileDirectory);
		}
		
	}

}
