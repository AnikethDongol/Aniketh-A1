// GeneralPractitioner.java
public class GeneralPractitioner extends HealthProfessional {
    private String specialization;

    // Default constructor
    public GeneralPractitioner() {
        super();
        this.specialization = "";
    }

    // Constructor with parameters
    public GeneralPractitioner(int id, String name, String additionalInfo, String specialization) {
        super(id, name, additionalInfo);
        this.specialization = specialization;
    }

    // Method to print health professional details
    @Override
    public void printDetails() {
        System.out.println("The doctor details are:");
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}


