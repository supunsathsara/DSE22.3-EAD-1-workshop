class School{
    private String name;
    private String town;

    School(String name,String town){
        this.name = name;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    
}


class Student {
    String name;
    School school;

    Student(String name,School school){
        this.name = name;
        this.school = school;
    }
    
    public void printDetails(){
        System.out.println("Name: "+ this.getName());
        System.out.println("School Name: "+ school.getName());

    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }  
}

class President extends Student{
    int duration;

    President(String name,School school,int duration){
        super(name,school);
        this.duration = duration;
        super.name =  name;
    }

    @Override
    public void printDetails() {
        System.out.println("this is child class");
    }

    public void printDetails00() {
        this.printDetails();
        super.printDetails();
    }
}

public class M2 {
    public static void main(String[] args) {
        School s = new School("DPS","Delhi");
        Student st = new Student("Ravi",s);
        st.printDetails();

        System.out.println("School Name: "+ st.getSchool().getName());
    }
}
