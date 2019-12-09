public class Student {
    protected String studentId;
    protected String StudentName;
    protected String faculty;
    protected String major;
    
    public void enrollment(){
        System.out.println("enrollment");
    }
    public void payment(){
        System.out.println("payment");
    }
    public void addCourse(){
        System.out.println("addCourse");
    }
    public void dropCourse(){
        System.out.println("dropcourse");
    }
    
    public void showdata(){
        System.out.println("ID :"+studentId);
        System.out.println("Name :"+StudentName);
        System.out.println("Major : "+major);
        System.out.println("Faculty : "+faculty);
               
                
    }
    
    public static void main(String[] args){
        Student supansa = new Student();
        System.out.println("Object ="+supansa);
        supansa.studentId = "614234022";
        supansa.major = "CS";
        supansa.faculty = "Science and Technology";
    }
}//end class
    