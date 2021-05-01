package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {
    Nurse underTest = new Nurse("employeeNumber","name");
    Patient sickPatient = new Patient();

    @Test

    public void shouldIncreasePatientHealthFrom10to15(){
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(15, patientHealthLevel);
    }
    @Test

    public void decreaseTheBloodLevelOfAPatientFrom20To15WhenBloodIsDrawn() {
        underTest.drawBloodFromPatient(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);
    }

    @Test

    public void shouldReturnASalaryOf90K() {
        int salary = underTest.calculatePay();
        assertEquals(50000, salary);
    }
}
