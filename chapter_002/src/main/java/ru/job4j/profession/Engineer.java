package ru.job4j.profession;

/**
 * Engineer class.
 *
 * @author Sergey Dubouski.
 * @version 1.0.
 * @since 09.02.2017.
 */
public class Engineer extends Profession {
    final boolean isCertified;
    final String specialty;
    final String softwarePreference;

    public Engineer(int yearsOfExperience, String university, boolean isCertified, String specialty, String softwarePreference) {
        super(yearsOfExperience, university);
        this.isCertified = isCertified;
        this.specialty = specialty;
        this.softwarePreference = softwarePreference;
    }

    public final void developProduct(Requirements req) {
    }

    public final void createDrawing(Requirements req, Operations op) {
    }

    public final void conductTest(ProductSpec product) {
    }

    public final void analyzeData(ProductSpec product) {
    }

    public final void assessRisk(ProjectPlan pPlan, ActionPlan aPlan) {
    }

    public final void improveEfficiency(ManufacturingProcess mnfProcess) {
    }
}
