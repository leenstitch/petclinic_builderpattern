/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petclinic;
/**
 *
 * @author leenandraheeq
 */
public interface TreatmentPlanBuilder {
    
    void setPetInfo(String name, String type, int age);
    void addVaccinations();
    void addMedication();
    void addDietPlan();
    void addSurgery();
    void addFollowUp();
    TreatmentPlan getPlan();
    
}
