/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.petclinic;

import java.util.Scanner;



/**
 *
 * @author leenandraheeq
 */
public class Petclinic {

    public static void main(String[] args) {
        // Build Dog's Plan
        Scanner n=new Scanner(System.in);
        System.out.println("enter the type");
        String type=n.nextLine();
        System.out.println("enter the name");
        String name=n.nextLine();
        System.out.println("enter the age");
       int age=n.nextInt();
        if(type.equals("cat")){
       //     CatTreatmentPlanBuilder NN=new CatTreatmentPlanBuilder(petName,petType,petAge,vaccinations,medication,dietPlan,surgery,followUp); 
        TreatmentPlanBuilder catBuilder = new CatTreatmentPlanBuilder();
        ClinicDirector catDirector = new ClinicDirector(catBuilder);
        catDirector.constructTreatmentPlan(name, "Cat", age);
        TreatmentPlan catPlan = catBuilder.getPlan();
        catPlan.showPlan();
        }
        else if(type.equals("dog")){
         TreatmentPlanBuilder dogBuilder = new DogTreatmentPlanBuilder();
        ClinicDirector dogDirector = new ClinicDirector(dogBuilder);
        dogDirector.constructTreatmentPlan(name, "Dog", age);
        TreatmentPlan dogPlan = dogBuilder.getPlan();
        dogPlan.showPlan();  
       }
         else if(type.equals("bird")){
   TreatmentPlanBuilder birdBuilder = new BirdTreatmentPlanBuilder();
ClinicDirector birdDirector = new ClinicDirector(birdBuilder);
birdDirector.constructTreatmentPlan(name, "Bird",age);
TreatmentPlan birdPlan = birdBuilder.getPlan();
birdPlan.showPlan(); 
}
        
        
      
    }
}