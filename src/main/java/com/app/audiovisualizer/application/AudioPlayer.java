package com.app.audiovisualizer.application;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;

public class AudioPlayer {
    private AudioInputStream audioInputStream;

    public AudioPlayer() {
        URL demoFile = getClass().getResource("demo.wav");

        try{
            audioInputStream = AudioSystem.getAudioInputStream(demoFile);

            Clip clip = AudioSystem.getClip();

            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);

            clip.start();
        } catch (Exception e){
            System.out.println("i am error");
        }

    }
}
