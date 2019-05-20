
public class Student extends Person{

	int testScores[];
	
	public Student(String firstName, String lastName, int id, int []scores) {
		super(firstName, lastName, id);
		this.testScores= scores;
	
	}
	public char calculate() {
		 int hold=0;
	        for(int  i=0; i < this.testScores.length;i++){
	                hold = hold+testScores[i];
	        }
	        hold/=testScores.length;
	        if(hold>=90&& hold<=100){
	          return 'O';
	        }else if(hold>=80 && hold< 90){
	           return 'E';
	        }else if(hold>=70 & hold <80){
	          return 'A';
	        }else if(hold>= 55&& hold<70){
	        return 'P';
	        }else if(hold >=40 && hold<55){
	            return 'D';
	        }else{
	           return 'T';
	        }
	}

}
