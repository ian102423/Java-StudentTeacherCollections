public class Student {

    String firstName;
    String lastName;
    int id;
    int grade;

    Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

//    public static String

    @Override
    public String toString() {
        return String.format("\n%s:\n\tFirstName:%s\n\tLastName:%s\n\tID:%s\n\tGrade:%s", this.getClass().getName(), firstName, lastName, id, grade);

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getId() != student.getId()) return false;
        if (getGrade() != student.getGrade()) return false;
        if (!getFirstName().equals(student.getFirstName())) return false;
        return getLastName().equals(student.getLastName());
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getLastName().hashCode();
        result = 31 * result + getId();
        result = 31 * result + getGrade();
        return result;
    }
}
