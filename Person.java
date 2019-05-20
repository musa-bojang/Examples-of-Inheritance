import java.util.Scanner;
public class Person {

   String firstName;
   String lastName;
   int id;
   
   public Person(String firstName, String lastName, int id ){
	   this.firstName = firstName;
	   this.lastName= lastName;
	   this.id= id;
   }
   public void printPerson() {
	   System.out.println("Name: "+ this.firstName +" "+ this.lastName+" \n ID:"+ this.id);
   }
	  
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter firstName");
		String firstName = scan.nextLine();
		System.out.println("Enter Last name");
		String lastName = scan.nextLine();
		System.out.println("Enter Id No.");
		int id = scan.nextInt();
		System.out.println("How many scores do you have");
		int numScore= scan.nextInt();
		int scores[]=new int [numScore];
		for(int i=0; i<numScore;i++) {
			scores[i]=scan.nextInt();
		}
		
		
		Student me = new Student(firstName, lastName, id, scores);
        me.printPerson();
        System.out.println("Grades:" + me.calculate());
	}

}
