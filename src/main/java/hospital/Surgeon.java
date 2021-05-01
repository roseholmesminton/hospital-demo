package hospital;

public class Surgeon extends Doctor implements MedicalDuties {
    private boolean isOperating;

    public Surgeon(String employeeNumber, String name, String specialty, boolean isOperating) {
        super(employeeNumber, name, specialty);
        this.isOperating = isOperating;
    }

    @Override
    public int calculatePay() {
        return 120000;
    }

    @Override
    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(10);
    }

    @Override
    public void drawBloodFromPatient(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }
}
