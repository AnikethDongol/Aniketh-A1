import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentOne {
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Initialize health professionals
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. John Doe", "General Medicine", "Family Health");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Jane Smith", "General Medicine", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Emily Davis", "General Medicine", "Geriatrics");

        Dietitian dietitian1 = new Dietitian(4, "Mr. Michael Brown", "Nutrition and Dietetics", "Certified Dietitian");
        Dietitian dietitian2 = new Dietitian(5, "Ms. Sarah Wilson", "Nutrition and Dietetics", "Certified Dietitian");

        // Print details of health professionals
        printHealthProfessionals(gp1, gp2, gp3, dietitian1, dietitian2);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Appointment System Menu:");
            System.out.println("1. Create an appointment");
            System.out.println("2. Print existing appointments");
            System.out.println("3. Cancel an appointment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createAppointment(scanner, gp1, gp2, gp3, dietitian1, dietitian2);
                    break;
                case 2:
                    printExistingAppointments();
                    break;
                case 3:
                    cancelBooking(scanner);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("------------------------------");
        }
        scanner.close();
    }

    public static void printHealthProfessionals(HealthProfessional... professionals) {
        System.out.println("Available Health Professionals:");
        for (HealthProfessional professional : professionals) {
            professional.printDetails();
            System.out.println("------------------------------");
        }
    }

    public static void createAppointment(Scanner scanner, HealthProfessional... professionals) {
        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();
        System.out.print("Enter patient mobile: ");
        String patientMobile = scanner.nextLine();
        System.out.print("Enter preferred time slot (e.g., 08:00): ");
        String timeSlot = scanner.nextLine();

        System.out.println("Choose a doctor:");
        for (int i = 0; i < professionals.length; i++) {
            System.out.println((i + 1) + ". " + professionals[i].getName() + " (" + professionals[i].getSpecialty() + ")");
        }
        System.out.print("Enter your choice: ");
        int doctorChoice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (doctorChoice < 1 || doctorChoice > professionals.length) {
            System.out.println("Invalid choice. Appointment not created.");
            return;
        }

        HealthProfessional chosenDoctor = professionals[doctorChoice - 1];
        appointments.add(new Appointment(patientName, patientMobile, timeSlot, chosenDoctor));
        System.out.println("Appointment created successfully.");
    }

    public static void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    public static void cancelBooking(Scanner scanner) {
        System.out.print("Enter patient mobile to cancel appointment: ");
        String mobile = scanner.nextLine();

        Appointment appointmentToCancel = null;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(mobile)) {
                appointmentToCancel = appointment;
                break;
            }
        }

        if (appointmentToCancel != null) {
            appointments.remove(appointmentToCancel);
            System.out.println("Appointment canceled successfully.");
        } else {
            System.out.println("No appointment found with the given mobile number.");
        }
    }
}