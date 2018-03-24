package ca.ciccc.java.main;

import ca.ciccc.java.model.Model;

/**
 * Lab 1
 *
 * @author paulahara
 */
public class Main {

    /**
     * Will be used to call the {@link Model} class
     *
     * @param args
     */
    public static void main(String[] args) {
        String firstName = new String("Fulano"), lastName = new String("Silva");
        int height = 71;
        double weight = 154.324;
        Boolean canTravel = false, smokes = true;

        /* ========================================================== */

        /* Testing all constructors */
        Model model1 = new Model();
        Model model2 = new Model(firstName, lastName, height, weight, canTravel, smokes);
        Model model3 = new Model(firstName, lastName, height, weight);

        // Print model1 = empty constructor
        System.out.println("Model (First constructor):");
        model1.printDetails();

        // Print model2 = constructor with six parameters
        System.out.println("\nModel (Second constructor):");
        model2.printDetails();

        // Print model3 = constructor with four parameters
        System.out.println("\nModel (Third constructor):");
        model3.printDetails();

        /* ========================================================== */

        /* Testing all setters and getters - using correct values */
        model1.setFirstName("Beltrana");
        model1.setLastName("Siqueira");
        model1.setHeight(5, 10);
        model1.setWeight(65l);
        model1.setCanTravel(true);
        model1.setSmokes(false);

        // Print model1 after setting all variables
        System.out.println("\nModel (First constructor - All variables setted with valid values):");
        model1.printDetails();

        /* ========================================================== */

        /* Testing all setters and getters - using invalid values */
        /* The values will not change */
        model1.setFirstName("Be");
        model1.setLastName(null);
        model1.setHeight(15);
        model1.setWeight(400);

        // Print model1 after setting variables with invalid values
        System.out.println("\nModel (First constructor - All variables setted with invalid values):");
        model1.printDetails();

        /* ========================================================== */
        /* Testing all 'displayModelDetails' with and without parameter */
        System.out.println("\nPrinting details using imperial units: ");
        model2.displayModelDetails();

        System.out.println("\nPrinting details using metric units: ");
        model3.displayModelDetails(true);

        /* ========================================================== */

        /* Testing toString */
        System.out.println("\nToString:");
        System.out.println(model1.toString());
    }
}
