public class CourseTracker 
{
        
        public static void main(String[] args)
        {
    	Course course = new Course("Introduction to Computers", 250);
    	
    	course.addStudents("Ali Said");
    	course.addStudents("Wong Ken");
    	course.addStudents("Peter Lim");


    	System.out.println(course.toString() + "\n\nTotal fees collected : " + String.format("%.1f\n", course.calcFeesCollected()));
    	
    	String[] studList = course.getStudentNames();
    	
    	System.out.println("List of Student in the course: ");
    	
    	for(int i = 0; i < course.getNoOfStudents(); i++)
    		{
    		System.out.println( "      " + studList[i]);
    		}
    }
}
