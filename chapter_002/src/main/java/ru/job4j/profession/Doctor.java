package ru.job4j.profession;

/**
 * Doctor class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class Doctor extends Profession {
    final String currentHospital;
    final boolean isRegistered;
    final boolean isHomeopath;
    final boolean acceptNewPatients;

    public Doctor(int yearsOfExperience, String university, String currentHospital, boolean isRegistered, boolean isHomeopath, boolean acceptNewPatients) {
        super(yearsOfExperience, university);
        this.currentHospital = currentHospital;
        this.isRegistered = isRegistered;
        this.isHomeopath = isHomeopath;
        this.acceptNewPatients = acceptNewPatients;
    }

    public final String conductCheckUp(Patient patient) {
        if (patient.importanceOfCheckUp() == 1) {
            return "Full checkup is required!";
        } else {
            return "Quick checkup is recommended!";
        }
    }

    public final void analyzeTestResults(TestResult testResult) {
        testResult.totalQtyOfCells();
    }

    public final String prescribeMedication(Patient patient, TestResult testResult) {
        if (testResult.totalQtyOfCells() < 2400000) {
            return patient.name + " take it easy, relax, and go with a flow!";
        } else {
            return patient.name + " please go for a healthy diet with no junk food, and do sport!";
        }
    }

    public final String developMedicalTreatment(Patient patient, TestResult testResult) {
        return this.prescribeMedication(patient, testResult);
    }

    public final String firstAidHelp(Patient patient, AcuteCare acuteCare) {
        if (acuteCare.performAcuteCare()) {
            return patient.name + " was successfully healed!";
        } else {
            return "Try harder!";
        }
    }

}
