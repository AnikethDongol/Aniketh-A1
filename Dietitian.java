// Dietitian.java
public class Dietitian extends HealthProfessional {
    private String certification;

    // Default constructor
    public Dietitian() {
        super();
        this.certification = "";
    }

    // Constructor with parameters
    public Dietitian(int id, String name, String additionalInfo, String certification) {
        super(id, name, additionalInfo);
        this.certification = certification;
    }

    // Method to print health professional details
    @Override
    public void printDetails() {
        System.out.println("The doctor details are:");
        super.printDetails();
        System.out.println("Certification: " + certification);
    }
}

