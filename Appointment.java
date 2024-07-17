public class Appointment {
    private String patientName;
    private String patientMobile;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {
        this.patientName = "";
        this.patientMobile = "";
        this.preferredTimeSlot = "";
        this.selectedDoctor = null;
    }

    // Constructor with parameters
    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Getter for patientName
    public String getPatientName() {
        return patientName;
    }

    // Setter for patientName
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    // Getter for patientMobile
    public String getPatientMobile() {
        return patientMobile;
    }

    // Setter for patientMobile
    public void setPatientMobile(String patientMobile) {
        this.patientMobile = patientMobile;
    }

    // Getter for preferredTimeSlot
    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    // Setter for preferredTimeSlot
    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    // Getter for selectedDoctor
    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    // Setter for selectedDoctor
    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }

    // Method to print all instance variables
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Preferred Time Slot: " + preferredTimeSlot);
        System.out.println("Selected Doctor: ");
        selectedDoctor.printDetails();
    }

}
