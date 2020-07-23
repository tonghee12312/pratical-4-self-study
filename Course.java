/**
 * @(#)Course.java
 *
 *
 * @author 
 * @version 1.00 2020/7/23
 */

public class Course 
	{
    private String courseTitle;
	private double feesPerStudent;
	private int noOfStudents;
	private String[] studentNames = new String[100];
	private static int courseCount = 0;


    public Course(String courseTitle, double feesPerStudent)
    	{
    	this.courseTitle = courseTitle;
    	this.feesPerStudent = feesPerStudent;
    	courseCount++;
        }
    
   
    public void setCourseTitle(String courseTitle)
    	{
    	this.courseTitle = courseTitle;
        }
    public void setFeesPerStudent(double feesPerStudent)
    	{
    	this.feesPerStudent = feesPerStudent;
        }
    public void setNoOfStudents(int noOfStudents)
    	{
    	this.noOfStudents = noOfStudents;
        }
    public static void setCourseCount(int courseCount)
    	{
    	Course.courseCount = courseCount;
        }
    
    public String getCourseTitle()
    	{
    	return courseTitle;
        }
    public double getFeesPerStudent()
    	{
    	return feesPerStudent;
        }
    public int getNoOfStudents()
    	{
    	return noOfStudents;
        }
    public String[] getStudentNames()
    	{
    	return studentNames;
        }
    public static int getCourseCount()
    	{
    	return courseCount;
        }
    
    public double calcFeesCollected()
    	{
    	return feesPerStudent * noOfStudents;
        }
    public void addStudents(String studName)
    	{
    	studentNames[noOfStudents++] = studName;
        }
    
    public String toString()
    	{
    	return "\nCourse Title : " + courseTitle + "\nFees : " +String.format("%.1f", feesPerStudent) + "\nNo. Of students : " + noOfStudents;
        }
}
