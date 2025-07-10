package corejavaproject;

abstract class User 
{
    private String name;
    private String email;
    private String userId;

    public User(String name, String email, String userId) 
    {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public String getName() 
    { 
    	return name;
    }
    public String getEmail() 
    { 
    	return email; 
    }
    public String getUserId() 
    { 
    	return userId; 
    }

    public void setName(String name) 
    { 
    	this.name = name; 
    }
    public void setEmail(String email) 
    { 
    	this.email = email; 
    }
    public void setUserId(String userId) 
    { 
    	this.userId = userId; 
    }

    public abstract void viewProfile();

    public final void displayWelcome() 
    {
        System.out.println("Welcome, " + name);
    }
}

interface ProgressTrackable 
{
    void trackProgress();
}

class Student extends User implements ProgressTrackable {
    private String enrolledCourse1;
    private String enrolledCourse2;

    public Student(String name, String email, String userId) 
    {
        super(name, email, userId);
    }

    public void enrollCourse(String courseName) {
        if (this.enrolledCourse1 == null) {
            this.enrolledCourse1 = courseName;
            System.out.println(getName() + " enrolled in " + courseName);
        } else if (this.enrolledCourse2 == null) {
            this.enrolledCourse2 = courseName;
            System.out.println(getName() + " enrolled in " + courseName);
        } else {
            System.out.println(getName() + " cannot enroll in more than 2 courses.");
        }
    }

    @Override
    public void viewProfile() {
        System.out.println("Student Profile: " + getName() + ", Email: " + getEmail() + ", UserID: " + getUserId());
        System.out.println("Enrolled Courses: " + (enrolledCourse1 != null ? enrolledCourse1 : "None") + ", " + (enrolledCourse2 != null ? enrolledCourse2 : "None"));
    }

    @Override
    public void trackProgress() {
        System.out.println(getName() + " is tracking progress in " + (enrolledCourse1 != null ? enrolledCourse1 : "No course") + " and " + (enrolledCourse2 != null ? enrolledCourse2 : "No course"));
    }
}

class Instructor extends User {
    private String createdCourse1;
    private String createdCourse2;

    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void createCourse(String courseName) {
        if (this.createdCourse1 == null) {
            this.createdCourse1 = courseName;
            System.out.println(getName() + " created course " + courseName);
        } else if (this.createdCourse2 == null) {
            this.createdCourse2 = courseName;
            System.out.println(getName() + " created course " + courseName);
        } else {
            System.out.println(getName() + " cannot create more than 2 courses.");
        }
    }

    @Override
    public void viewProfile() {
        System.out.println("Instructor Profile: " + getName() + ", Email: " + getEmail() + ", UserID: " + getUserId());
        System.out.println("Created Courses: " + (createdCourse1 != null ? createdCourse1 : "None") + ", " + (createdCourse2 != null ? createdCourse2 : "None"));
    }
}

class Admin extends User {
    public Admin(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void removeUser(User user) {
        System.out.println("Admin removed user: " + user.getName());
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin Profile: " + getName() + ", Email: " + getEmail() + ", UserID: " + getUserId());
    }
}

class Course {
    private String title;
    private int durationInHours;
    private final int maxStudents;

    public Course(String title, int durationInHours, int maxStudents) {
        this.title = title;
        this.durationInHours = durationInHours;
        this.maxStudents = maxStudents;
    }

    public Course(String title) {
        this(title, 0, 0);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + title + ", Duration: " + durationInHours + " hours, Max Students: " + maxStudents);
    }
}

public class EduSmart {
    public static void main(String[] args) {
        Student student1 = new Student("Preeti", "preeti@gmail.com", "S001");
        Student student2 = new Student("Vijay", "vijay@example.com", "S002");

        Instructor instructor1 = new Instructor("Uday", "uday@example.com", "I001");
        Instructor instructor2 = new Instructor("Prof. Prasanna", "prasanna@example.com", "I002");

        Admin admin = new Admin("Principal", "admin@example.com", "A001");

        instructor1.createCourse("Java Programming");
        instructor1.createCourse("Data Structures");
        instructor2.createCourse("Operating Systems");
        instructor2.createCourse("Database Systems");

        student1.enrollCourse("Java Programming");
        student1.enrollCourse("Data Structures");
        student2.enrollCourse("Operating Systems");
        student2.enrollCourse("Database Systems");

        student1.displayWelcome();
        student1.viewProfile();
        student2.displayWelcome();
        student2.viewProfile();

        instructor1.displayWelcome();
        instructor1.viewProfile();
        instructor2.displayWelcome();
        instructor2.viewProfile();

        admin.displayWelcome();
        admin.viewProfile();

        student1.trackProgress();
        student2.trackProgress();

        admin.removeUser(student2);

        Course course1 = new Course("Java Programming", 40, 30);
        Course course2 = new Course("Data Structures", 35, 25);
        course1.showCourseDetails();
        course2.showCourseDetails();
    }
}
