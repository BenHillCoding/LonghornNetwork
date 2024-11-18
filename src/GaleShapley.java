import java.util.*;

/**
 * GaleShapley is a utility class that assigns roommates to students based on their preferences using the GaleShapley algorithm
 */
public class GaleShapley {
    private static Map<UniversityStudent, UniversityStudent> roommates = new HashMap<UniversityStudent, UniversityStudent>();
    /**
     * Assigns roommates to students based on their preferences using the GaleShapley algorithm
     * @param students the list of students which have to be assigned
     */
    public static void assignRoommates(List<UniversityStudent> students) {

    }

    /**
     * Checks if two students are roommates
     * @param firstStudent first student
     * @param secondStudent second student
     * @return true if the students are roommates, false otherwise
     */
    public static boolean isRoommates(UniversityStudent firstStudent, UniversityStudent secondStudent) {
        return roommates.get(firstStudent).equals(secondStudent);
    }
}
