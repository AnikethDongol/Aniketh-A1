public class HealthProfessional {
    private int id;
    private String name;
    private String additionalInfo; // Can be any relevant information like qualification, department, etc.

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.additionalInfo = "";
    }

    // Constructor with parameters
    public HealthProfessional(int id, String name, String additionalInfo) {
        this.id = id;
        this.name = name;
        this.additionalInfo = additionalInfo;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public void printDetails() {
    }

    public int getSpecialty() {
        return 0;
    }
}

