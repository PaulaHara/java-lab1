package ca.ciccc.java.model;

/**
 * Class ca.ciccc.java.model.Model which has the variables:
 * <ul>
 *   <li>String firstName,</li>
 *   <li>String lastName,</li>
 *   <li>int height,</li>
 *   <li>double weight,</li>
 *   <li>boolean canTravel,</li>
 *   <li>boolean smokes,</li>
 *   <li>static String occupation = "modeling".</li>
 *</ul>
 *
 * @author paulahara
 */
public class Model {
    private String firstName = new String();
    private String lastName = new String();
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;
    private static String occupation = "modeling";

    private static int INCHES_PER_FOOT = 12;
    private static float POUNDS_PER_KG = 2.2f;

    /**
     * Constructor without parameters
     */
    public Model(){

    }

    /**
     * Constructor with six parameters
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     * @param canTravel
     * @param smokes
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.setCanTravel(canTravel);
        this.setSmokes(smokes);
    }

    /**
     * Constructor with four parameters and that set canTravel as true and smokes as false
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     */
    public Model(String firstName, String lastName, int height, double weight){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.setCanTravel(true);
        this.setSmokes(false);
    }

    /**
     * Return the firstName
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set firstName
     *
     * @param firstName
     */
    public final void setFirstName(String firstName) {
        if(isValidName(firstName)) {
            this.firstName = firstName;
        }
    }

    /**
     * Return lastName
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set lastName
     *
     * @param lastName
     */
    public final void setLastName(String lastName) {
        if(isValidName(lastName)) {
            this.lastName = lastName;
        }
    }

    /**
     * Return height in inches
     *
     * @return height
     */
    public int getHeightInInches() {
        return height;
    }

    /**
     * Set height in inches
     *
     * @param inches
     */
    public final void setHeight(int inches) {
        if(inches >= 24 && inches <= 84) {
            this.height = inches;
        }
    }

    /**
     * Return weight in pounds
     *
     * @return weight
     */
    public double getWeightInPounds() {
        return weight;
    }

    /**
     * Set weight in pounds
     *
     * @param pounds
     */
    public final void setWeight(double pounds) {
        if(pounds >= 80 && pounds <= 280) {
            this.weight = pounds;
        }
    }

    /**
     * Return canTravel
     *
     * @return canTravel
     */
    public boolean getCanTravel() {
        return canTravel;
    }

    /**
     * Set canTravel
     *
     * @param canTravel
     */
    public final void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * Return smokes
     *
     * @return smokes
     */
    public boolean getSmokes() {
        return smokes;
    }

    /**
     * Set smokes
     *
     * @param smokes
     */
    public final void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Return occupation
     *
     * @return occupation
     */
    public static String getOccupation() {
        return occupation;
    }

    /**
     * Set occupation
     *
     * @param occupation
     */
    public final static void setOccupation(String occupation) {
        Model.occupation = occupation;
    }

    /**
     * Verify if the name passed is valid or not:
     * <ul>
     *     <li>Name can't be null,</li>
     *     <li>Need to have between 3 and 20 letters.</li>
     *</ul>
     *
     * @param name
     * @return true if the name is valid, <br>
     *         false if not
     */
    private boolean isValidName(String name){
        if((name != null) && (name.length() >= 3) && (name.length() <= 20)){
            return true;
        }
        return false;
    }

    /**
     * Return height in feet and inches
     *
     * @return heightInFeetAndInches
     */
    public String getHeightInFeetAndInches(){
        int feet, inches;
        String heightInFeetAndInches;

        feet = this.height / INCHES_PER_FOOT;
        inches = this.height % INCHES_PER_FOOT;

        heightInFeetAndInches = feet + " feet";
        if(inches > 0){
            if(inches == 1) {
                heightInFeetAndInches += " 1 inch";
            }else{
                heightInFeetAndInches += " " + inches + " inches";
            }
        }

        return heightInFeetAndInches;
    }

    /**
     * Convert weight from pound to kg and return it
     *
     * @return weight in kg
     */
    public long getWeightKg(){
        return Math.round(this.getWeightInPounds() / POUNDS_PER_KG);
    }

    /**
     * Receive weight in kg, convert to pounds and set weight
     *
     * @param kilograms
     */
    public final void setWeight(long kilograms){
        this.setWeight(kilograms * POUNDS_PER_KG);
    }

    /**
     * Receive height in feet and inches, convert to inches and set height
     *
     * @param feet
     * @param inches
     */
    public final void setHeight(int feet, int inches){
        this.setHeight(Math.round((feet*INCHES_PER_FOOT)+inches));
    }

    /**
     * Print all the details about the model
     */
    public void printDetails(){
        System.out.println("Name: " + this.getFirstName() + " " + getLastName());
        System.out.println("Height: " + this.getHeightInInches() + " inches");
        System.out.println("Weight: " + Math.round(this.getWeightInPounds()) + " pounds");

        if(this.getCanTravel()){
            System.out.println("Does travel ");
        }else{
            System.out.println("Does not travel ");
        }
        if(this.getSmokes()){
            System.out.println("Does smoke ");
        }else{
            System.out.println("Does not smoke ");
        }
    }

    @Override
    public String toString() {
        return "Model["+this.getFirstName()+", "+this.getLastName()+", "
                +this.getHeightInInches()+", "+this.getWeightInPounds()+", "
                +this.getCanTravel()+", "+this.getSmokes()+", "+Model.getOccupation()+"]";
    }
}
