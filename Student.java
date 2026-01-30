class Student {
    private String name;
    private int age;
    private double grade;

    public void setDetails(String n, int a, double g) {
        name = n;
        age = a;
        grade = g;
    }

    public String getName() {
        return name;
    }

    public boolean isPassed() {
        return grade >= 75;
    }

    public void displayInfo() {
        System.out.println("Student Information");
        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

        if (isPassed()) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    Student student1 = new Student();
    student1.setDetails("Clarence Artajo", 19, 85.5);

    Student student2 = new Student();
    student2.setDetails("Raikashi Tendo", 19, 74);

    Student student3 = new Student();
    student3.setDetails("Hiroshi Gyumie", 19, 90);

    student1.displayInfo();
    student2.displayInfo();
    student3.displayInfo();
}

}
