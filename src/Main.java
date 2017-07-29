import java.util.*;

public class Main {

    private static String[] firstNameList = {"Vasanta", "Chloris", "Proteus", "Vohu Manah", "Iovis", "Kadmos", "Zerachiel", "Sandhya", "Siegfried", "Papa", "Saturnus", "Angra Mainyu"
            , "Ilithyia", "Medraut", "Tanis"
    };
    private static String[] lastNameList = {"Zephyrus", "Jam", "Melia", "Izanagi", "Lycurgus", "Mahesha", "Bedwyr", "Nyx",
            "Nyyrikki", "Shakti", "Ismene", "Melete", "Anatu", "Mentor", "Medraut"
    };

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        List<Teacher> teacher = new ArrayList<>();

        Student firstGraders;

        for (int i = 0; i < firstNameList.length; i++) {
            firstGraders = new Student();

            firstGraders.setFirstName(firstNameList[i]);
            firstGraders.setLastName(lastNameList[i]);
            firstGraders.setGrade(1);
            firstGraders.setId(i);

            student.add(firstGraders);

        }

        Set<Student> studentSet1 = new HashSet<>();
        Set<Student> studentSet2 = new HashSet<>();
        Set<Student> studentSet3 = new HashSet<>();

        for (int i = 0; i < firstNameList.length; i++) {
            if (i < 5) {
                studentSet1.add(student.get(i));
            } else if (i < 10) {
                studentSet2.add(student.get(i));
            } else {
                studentSet3.add(student.get(i));
            }
        }

        Teacher firstGradeTeachers;
        Random random;

        for (int j = 0; j < 3; j++) {
            firstGradeTeachers = new Teacher();
            random = new Random();

            int max = 15;
            int result = random.nextInt(max);

            firstGradeTeachers.setFirstName(firstNameList[result]);
            firstGradeTeachers.setLastName(lastNameList[result]);
            firstGradeTeachers.setGrade(1);
            firstGradeTeachers.setId(j);

            teacher.add(firstGradeTeachers);

        }

        Map<Teacher, Set> englishClass = new HashMap<>();
        Map<Teacher, Set> mathClass = new HashMap<>();
        Map<Teacher, Set> artClass = new HashMap<>();

        for (int j = 0; j < 3; j++) {
            if (j == 0) {
                englishClass.put(teacher.get(j), studentSet1);
            } else if (j == 1) {
                mathClass.put(teacher.get(j), studentSet2);
            } else {
                artClass.put(teacher.get(j), studentSet3);
            }
        }

        System.out.println("Student size: " + student.size());
        System.out.println("Teacher size: " + teacher.size());

        System.out.println("English Class - keyset: " + englishClass.keySet());
        System.out.println("English Class - values: " + englishClass.values());
        System.out.println("English Class - toString: " + englishClass.toString());
        System.out.println("English Class - entrySet: " + englishClass.entrySet());
    }
}
