package org.example.structuralpatterns.FacadePattern.FacadeLayer;

import org.example.structuralpatterns.FacadePattern.SubClasses.DVDPlayer;
import org.example.structuralpatterns.FacadePattern.SubClasses.Projector;
import org.example.structuralpatterns.FacadePattern.SubClasses.SoundSystem;

public class HomeTheatreSystem {
    DVDPlayer dvdPlayer;
    SoundSystem soundSystem;
    Projector projector;

    public HomeTheatreSystem(DVDPlayer dvdPlayer, SoundSystem soundSystem, Projector projector){
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.projector = projector;
    }

    public void turnOnTheatre(){
        this.dvdPlayer.on();
        this.projector.on();
        this.soundSystem.on();
        System.out.println("Home theatre is on");
    }

    public void turnOffTheatre(){
        this.dvdPlayer.off();
        this.projector.off();
        this.soundSystem.off();
        System.out.println("Home theatre is off");
    }
}
