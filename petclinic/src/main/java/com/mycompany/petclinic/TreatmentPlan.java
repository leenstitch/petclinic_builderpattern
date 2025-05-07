/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petclinic;

/**
 *
 * @author leenandraheeq
 */
public class TreatmentPlan {
    private String petName;
    private String petType;
    private int petAge;
    private String vaccinations;
    private String medication;
    private String dietPlan;
    private String surgery;
    private String followUp;
    
    public void setPetName(String petName) { this.petName = petName; }
    public void setPetType(String petType) { this.petType = petType; }
    public void setPetAge(int petAge) { this.petAge = petAge; }
    public void setVaccinations(String vaccinations) { this.vaccinations = vaccinations; }
    public void setMedication(String medication) { this.medication = medication; }
    public void setDietPlan(String dietPlan) { this.dietPlan = dietPlan; }
    public void setSurgery(String surgery) { this.surgery = surgery; }
    public void setFollowUp(String followUp) { this.followUp = followUp; }

    public void showPlan() {
        System.out.println("Pet Treatment Plan:");
        System.out.println("Pet Name: " + petName);
        System.out.println("Pet Type: " + petType);
        System.out.println("Pet Age: " + petAge);
        System.out.println("Vaccinations: " + vaccinations);
        System.out.println("Medication: " + medication);
        System.out.println("Diet Plan: " + dietPlan);
        System.out.println("Surgery: " + surgery);
        System.out.println("Follow-up: " + followUp);
    }
}
