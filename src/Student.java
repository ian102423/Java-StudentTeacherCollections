public class Student {

    String firstNames;
    String lastNames;
    int ids;
    int grades;

    Student() {
    }

    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }


    @Override
    public String toString() {
        return String.format("\n%s:\n\tFirstName:%s\n\tLastName:%s\n\tID:%s\n\tGrade:%s", this.getClass().getName(), firstNames, lastNames, ids, grades);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getIds() != student.getIds()) return false;
        if (getGrades() != student.getGrades()) return false;
        if (!getFirstNames().equals(student.getFirstNames())) return false;
        return getLastNames().equals(student.getLastNames());
    }

    @Override
    public int hashCode() {
        int result = getFirstNames().hashCode();
        result = 31 * result + getLastNames().hashCode();
        result = 31 * result + getIds();
        result = 31 * result + getGrades();
        return result;
    }
}
