// Student.java v.20160502

// Edgar Larios 
//Homework 19 2016 final HM
class Student {
	double [] grades = new double[10];
	String name;
	
	public Student(String n){ 
			name = n;
		
			for(int index = 0; index <grades.length; index++){
			grades[index] = (Math.random()*100 + 1);		
		}
	}
	public void getInfo(){
		System.out.print(name+"\n\n");
		for(int i = 0; i < grades.length; i++){
		System.out.println(grades[i]);		
		}
	
	}
	public double h_grades(){
		double max = grades[0];
		for(int i = 0; i < grades.length; i++){
			if(grades[i] > max){
				max = grades[i];
			}	
		}
			return max;
	}
	
	public double l_grades(){
		double low = grades[0];
		for(int i = 0; i < grades.length; i++){
			if(grades[i] < low){
				low = grades[i];
			}	
		}
		return low;
	}
	public double ave_grade(){
		double sum = 0;
		for(int i = 0; i < grades.length; i++){
			sum = grades[i] + sum;
		}
		double avg = sum / grades.length;
		return avg;
	}
	public char get_final(){
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char d = 'D';
		char f = 'F';

		double sum = 0;

		for(int i = 0; i < grades.length; i++){
			sum = grades[i] + sum;
		}
		double avg = sum / grades.length;

		if ( avg >= 90 && avg <= 100){
			return a;	 
		}
		else if ( avg >= 80 && avg <= 89.99){
			return b;
		}
		else if (avg >= 70 && avg <= 79.99){
			return c;
		}
		else if(avg >= 60 && avg <= 69.99){
			return d;
		}
		else{
			return f;
		}
		

	}
}

