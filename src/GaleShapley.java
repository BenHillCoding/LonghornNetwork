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
        List<UniversityStudent> freeStudents = new ArrayList<>(students);
        while (!freeStudents.isEmpty()) {
            UniversityStudent student = freeStudents.get(0);
            UniversityStudent preferredRoommate = student.getPreferredRoommate();
            if (roommates.get(preferredRoommate) == null) {
                roommates.put(student, preferredRoommate);
                roommates.put(preferredRoommate, student);
                freeStudents.remove(student);
                freeStudents.remove(preferredRoommate);
            } else {
                UniversityStudent currentRoommate = roommates.get(preferredRoommate);
                if (preferredRoommate.getPreference(currentRoommate) > preferredRoommate.getPreference(student)) {
                    roommates.put(student, preferredRoommate);
                    roommates.put(preferredRoommate, student);
                    freeStudents.remove(student);
                    freeStudents.add(currentRoommate);
                }
            }
        }
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
