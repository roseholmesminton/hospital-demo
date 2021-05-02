package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {
    Hospital underTest = new Hospital();
    Doctor doctor = new Doctor("1","doctor name","specialty");
    Nurse nurse = new Nurse("2","nurse name",5);
    Janitor janitor = new Janitor("3", "janitor name","maternity ward", true);
@Test
    public void shouldBeAbleToHireOneDoctor(){
    underTest.hire(doctor);
   HospitalEmployee foundDoctor = underTest.findEmployee("1");
    assertEquals("doctor name", foundDoctor.getName());
}
@Test
    public void shouldBeAbleToHireADoctorNurseAndJanitor(){
        underTest.hire(doctor);
        underTest.hire(nurse);
        underTest.hire(janitor);
        HospitalEmployee foundDoctor = underTest.findEmployee("1");
        HospitalEmployee foundNurse = underTest.findEmployee("2");
        HospitalEmployee foundJanitor = underTest.findEmployee("3");
        assertEquals("doctor name", foundDoctor.getName());
        assertEquals("nurse name", foundNurse.getName());
        assertEquals("janitor name", foundJanitor.getName());
    }
}
