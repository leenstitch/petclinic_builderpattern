/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petclinic;

/**
 *
 * @author leensandraheeq 
 */
public class BirdTreatmentPlanBuilder  implements TreatmentPlanBuilder{
    private TreatmentPlan plan;

    public BirdTreatmentPlanBuilder() {
        plan = new TreatmentPlan();
    }

    @Override
    public void setPetInfo(String name, String type, int age) {
        plan.setPetName(name);
        plan.setPetType(type);
        plan.setPetAge(age);
    }

    @Override
    public void addVaccinations() {
        plan.setVaccinations("Avian Influenza Vaccine, Newcastle Disease");
    }

    @Override
    public void addMedication() {
        plan.setMedication("Vitamin supplements, deworming drops");
    }

    @Override
    public void addDietPlan() {
        plan.setDietPlan("Seeds, fruits, occasional insects");
    }

    @Override
    public void addSurgery() {
        plan.setSurgery("Wing trimming (optional)");
    }

    @Override
    public void addFollowUp() {
        plan.setFollowUp("Monthly health check + feather inspection");
    }

    @Override
    public TreatmentPlan getPlan() {
        return plan;
    }
}
