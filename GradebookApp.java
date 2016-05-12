// GradebookApp.java v.20160502
// Edgar Last HM
class GradebookApp {
	
	public static void main(String[] args) {
		Student s = new Student("Edgar");
		s.getInfo();
		
		double highest = s.h_grades();
		System.out.println(highest+"\n\n");

		double lowest = s.l_grades();
		System.out.println(lowest+"\n\n");

		double average = s.ave_grade();
		System.out.println(average+"\n\n");

		char grade = s. get_final();
		System.out.println(grade+"\n\n");
	}
}

