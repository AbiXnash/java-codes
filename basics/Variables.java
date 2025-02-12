public class Variables {
  public static void main(String[] args) {
    /*
     * NOTE:
     * VARIABLES:
     * -> a resuable container for a value,
     * -> it behaves as if it was the value it contains
     *
     * There are 2 steps
     * 1. Declaration
     * 2. Assignment
     *
     * Data types:
     * NOTE: PRIMITIVE
     * -> An object stored directly in memory --> (Stack)
     *
     * -------------
     * 1. int
     * 2. double
     * 3. char
     * 4. boolean
     *
     * NOTE: REFERENCE
     * -> points to the object in Stack --> (Heap)
     *
     * -------------
     * 1. string
     * 2. array
     * 3. object
     */
    int age = 20;
    String name = "Abinash";
    char initial = 'S';
    double cgpa = 7.52;
    boolean isPlaced = true;
    String[] interviewAttended = {
      "Amazon", "ViaSat", "Flynava", "Accenture", "FirstSource", "Rapyuta Robotics", "Mindgate"
    };

    System.out.println(
        "Hi! I'm "
            + name
            + " "
            + initial
            + ", "
            + age
            + " years old with a cgpa of "
            + cgpa
            + " and I'm placed("
            + isPlaced
            + ")");

    System.out.println("Companies attended: \n"); // \n => New Line
    for (String company : interviewAttended) { // for each loop to iterate over the array
      System.err.println(company);
    }

    if (isPlaced)
      System.out.println("I got placed in " + interviewAttended[interviewAttended.length - 1]);
    /*
     * printing the last
     * object in the array by
     * finding the array
     * length using length
     * method
     */
  }
}
