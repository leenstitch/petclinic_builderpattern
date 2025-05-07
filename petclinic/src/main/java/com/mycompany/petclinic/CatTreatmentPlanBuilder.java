/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petclinic;

/**
 *
 * @author leenandraheeq
 */
public class CatTreatmentPlanBuilder implements TreatmentPlanBuilder {
     private TreatmentPlan plan;

    public CatTreatmentPlanBuilder() {
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
        plan.setVaccinations("Rabies, Feline Leukemia");
    }

     @Override
    public void addMedication() {
        plan.setMedication("Flea treatment and deworming");
    }
 @Override
    public void addDietPlan() {
        plan.setDietPlan("Grain-free dry food and wet food");
    }
 @Override
    public void addSurgery() {
        plan.setSurgery("Spaying (optional)");
    }
 @Override
    public void addFollowUp() {
        plan.setFollowUp("Quarterly vet visits");
    }
 @Override
    public TreatmentPlan getPlan() {
        return plan;
    }
}
