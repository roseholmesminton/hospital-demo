package hospital;

public class Nurse {

    private String employeeNumber;
    private String name;

    public Nurse(String employeeNumber, String name) {

        this.employeeNumber = employeeNumber;
        this.name = name;
    }

    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }

    public void drawBloodFromPatient(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    public int calculatePay() {
        return 50000;
    }

}

