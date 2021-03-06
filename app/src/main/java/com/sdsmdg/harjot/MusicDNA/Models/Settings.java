package com.sdsmdg.harjot.MusicDNA.Models;

import android.graphics.Color;

/**
 * Created by Harjot on 02-Aug-16.
 */
public class Settings {
    private int themeColor;
    private float minAudioStrength;

    public Settings() {
        this.themeColor = Color.BLACK;
        this.minAudioStrength = 0.40f;
    }

    public int getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(int themeColor) {
        this.themeColor = themeColor;
    }

    public float getMinAudioStrength() {
        return minAudioStrength;
    }

    public void setMinAudioStrength(float minAudioStrength) {
        this.minAudioStrength = minAudioStrength;
    }
}
