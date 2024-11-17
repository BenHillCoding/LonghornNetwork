import java.util.*;

/**
 * A class that represents a student and stores information about that student
 */
public abstract class Student {
    protected String name;
    protected int age;
    protected String gender;
    protected int year;
    protected String major;
    protected double gpa;
    protected List<String> roommatePreferences;
    protected List<String> previousInternships;

    /**
     * Calculates the connection strength between this student and another student based on parameters
     * @param other The other student with which the connection strength is calculated
     * @return The connection strength as integer
     */
    public abstract int calculateConnectionStrength(Student other);
}
