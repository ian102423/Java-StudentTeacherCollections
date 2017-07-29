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

        Set<Student> studentSet = new HashSet<>();
        for (int i = 0; i < firstNameList.length; i++) {
            if (i < 5) {
                studentSet.add(student.get(i));
            } else if (i < 10) {
                studentSet.add(student.get(i));
            } else {
                studentSet.add(student.get(i));
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

        Set<Teacher> teacherSet = new HashSet<>();

        for (int j = 0; j < 3; j++) {
            if (j == 0) {
                teacherSet.add(teacher.get(j));
            } else if (j == 1) {
                teacherSet.add(teacher.get(j));
            } else {
                teacherSet.add(teacher.get(j));
            }
        }

        System.out.println(student.size());
        System.out.println(teacher.size());

    }
}
