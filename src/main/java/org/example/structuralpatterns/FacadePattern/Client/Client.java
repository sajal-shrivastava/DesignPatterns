package org.example.structuralpatterns.FacadePattern.Client;

import org.example.structuralpatterns.FacadePattern.FacadeLayer.HomeTheatreSystem;
import org.example.structuralpatterns.FacadePattern.SubClasses.DVDPlayer;
import org.example.structuralpatterns.FacadePattern.SubClasses.Projector;
import org.example.structuralpatterns.FacadePattern.SubClasses.SoundSystem;

public class Client {
    public static void main(String[] args) {
        HomeTheatreSystem homeTheatreSystem = new HomeTheatreSystem(new DVDPlayer(), new SoundSystem(), new Projector());
        System.out.println("Press On key and starting watching movie");
        homeTheatreSystem.turnOnTheatre();
        System.out.println("Press OFF key and turn off home theatre");
        homeTheatreSystem.turnOffTheatre();
    }
}
