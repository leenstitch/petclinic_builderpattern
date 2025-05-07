/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petclinic;

/**
 *
 * @author leenandraheeq
 */
public class DogTreatmentPlanBuilder implements TreatmentPlanBuilder {
    private TreatmentPlan plan;

    public DogTreatmentPlanBuilder() {
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
        plan.setVaccinations("Rabies, Distemper, Parvovirus");
    }

    @Override
    public void addMedication() {
        plan.setMedication("Deworming tablets");
    }

    @Override
    public void addDietPlan() {
        plan.setDietPlan("High-protein diet with supplements");
    }

    @Override
    public void addSurgery() {
        plan.setSurgery("Neutering (optional)");
    }

    
    @Override
    public void addFollowUp() {
        plan.setFollowUp("Monthly checkups for 6 months");
    }

    @Override
    public TreatmentPlan getPlan() {
        return plan;
    }
}
