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

            student.setFirstName(firstNameList[i]);
            student.setLastName(lastNameList[i]);
            student.setGrade(1);
            student.setId(i);

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

            firstGradeTeachers.setFirstName(firstNameList[result]);
            firstGradeTeachers.setLastName(lastNameList[result]);
            firstGradeTeachers.setGrade(1);
            firstGradeTeachers.setId(j);

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

        System.out.println("English Class - keyset: " + englishClass.keySet());
        System.out.println("Math Class - keyset: " + mathClass.keySet());
        System.out.println("Art Class - keyset: " + artClass.keySet());

        System.out.println("English Class - values: " + englishClass.values());
        System.out.println("English Class - toString: " + englishClass.toString());
        System.out.println("English Class - entrySet: " + englishClass.entrySet());
    }
}
