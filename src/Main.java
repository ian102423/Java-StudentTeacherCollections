import java.util.*;

public class Main {

    private static String[] firstNameList = {"Vasanta", "Chloris", "Proteus", "Vohu Manah", "Iovis", "Kadmos", "Zerachiel", "Sandhya", "Siegfried", "Papa", "Saturnus", "Angra Mainyu"
            , "Ilithyia", "Medraut", "Tanis"
    };
    private static String[] lastNameList = {"Zephyrus", "Jam", "Melia", "Izanagi", "Lycurgus", "Mahesha", "Bedwyr", "Nyx",
            "Nyyrikki", "Shakti", "Ismene", "Melete", "Anatu", "Mentor", "Medraut"
    };

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        Student student;

        for (int i = 0; i < firstNameList.length; i++) {
            student = new Student();

            student.setFirstNames(firstNameList[i]);
            student.setLastNames(lastNameList[i]);
            student.setGrades(1);
            student.setIds(i);

            students.add(student);

        }

        Set<Student> studentSet1 = new HashSet<>();
        Set<Student> studentSet2 = new HashSet<>();
        Set<Student> studentSet3 = new HashSet<>();

        for (int i = 0; i < firstNameList.length; i++) {
            if (i < 5) {
                studentSet1.add(students.get(i));
            } else if (i < 10) {
                studentSet2.add(students.get(i));
            } else {
                studentSet3.add(students.get(i));
            }
        }

        Teacher firstGradeTeachers;
        Random random = new Random();

        for (int j = 0; j < 3; j++) {
            firstGradeTeachers = new Teacher();

            int max = 15;
            int result = random.nextInt(max);

            firstGradeTeachers.setFirstNames(firstNameList[result]);
            firstGradeTeachers.setLastNames(lastNameList[result]);
            firstGradeTeachers.setGrades(1);
            firstGradeTeachers.setIds(j);

            teachers.add(firstGradeTeachers);

        }

        Map<Teacher, Set> englishClass = new HashMap<>();
        Map<Teacher, Set> mathClass = new HashMap<>();
        Map<Teacher, Set> artClass = new HashMap<>();


        englishClass.put(teachers.get(0), studentSet1);
        mathClass.put(teachers.get(1), studentSet2);
        artClass.put(teachers.get(2), studentSet3);


        System.out.println("Student size: " + students.size());
        System.out.println("Teacher size: " + teachers.size());

        for (Teacher t : teachers) {
            System.out.println(t);
        }

        for (Student s : students) {
            System.out.println(s);
        }

        Map<Teacher, Set> firstGradeClasses = new HashMap<>();
        for (int i = 0; i < teachers.size(); i++) {
            if (i == 0) {
                firstGradeClasses.put(teachers.get(i), studentSet1);
            } else if (i == 1) {
                firstGradeClasses.put(teachers.get(i), studentSet2);
            } else {
                firstGradeClasses.put(teachers.get(i), studentSet3);
            }
        }

        System.out.println("********** KeySet, Values, EntrySet *********\n");
        System.out.println(firstGradeClasses.keySet());
        System.out.println(firstGradeClasses.values());
        System.out.println(firstGradeClasses.entrySet());
    }
}
