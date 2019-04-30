package collectionFramework;
import java.io.*;


class Employee {
	int id;
	String name;
	
	Employee(int i, String n){
		
		this.id = i;
		this.name  = n;
	}
	void displayHeader() {
		
		System.out.println(id+"\t"+name);
	}
}
public class Group {

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Employee emp[] = new Employee[2];
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("Enter ID");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Enter Name of the employee");
			String name = br.readLine();
			
			emp[i] = new Employee(id,name);
		}
		System.out.println("The employee Data is ");
		
		for(int i=0;i<emp.length;i++) {
			emp[i].displayHeader();
		}
	}
}
