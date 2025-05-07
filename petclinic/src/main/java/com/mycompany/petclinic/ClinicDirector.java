/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petclinic;

/**
 *
 * @author leenandraheeq
 */
public class ClinicDirector {
     private TreatmentPlanBuilder builder;

    public ClinicDirector(TreatmentPlanBuilder builder) {
        this.builder = builder;
    }

    public void constructTreatmentPlan(String name, String type, int age) {
        builder.setPetInfo(name, type, age);
        builder.addVaccinations();
        builder.addMedication();
        builder.addDietPlan();
        builder.addSurgery();
        builder.addFollowUp(); 
       
        }
}
