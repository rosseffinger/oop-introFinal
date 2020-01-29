package oopIntro;

public class Course {
    int id;
    int code;
    String name;
    String description;
    int credit;
    public Integer getID(){
        return id;
    }
    public Course(int id, int code, String name, String description, int credit){
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.credit = credit;


    }
    public int getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getCredit(){
        return credit;
    }

    public static void main(String[] args) {
        Course cs222 = new Course(0,12,"cs222","advanced programming", 3);
        Course cs224 = new Course(1,14,"cs224","algorithms",3);
        Course chem111 = new Course(2,14,"chem111", "its chem", 4);
        Student me = new Student(0,"Ross");
        me.enrollCourse(cs224);
        me.enrollCourse(cs222);
        me.enrollCourse(chem111);
        me.displayCourses();

    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", credit=" + credit +
                '}';
    }
}
