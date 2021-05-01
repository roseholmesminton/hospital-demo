package hospital;


public class Doctor {
    private String employeeNumber;
    private String name;
    private String specialty;

    public Doctor(String employeeNumber, String name, String specialty) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.specialty = specialty;
    }


    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);
    }

    public void drawBloodFromPatient(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    public int calculatePay() {
        return 90000;
    }
}
