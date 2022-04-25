package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxCurrentVolume = 10;
    private int minCurrentVolume = 0;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public void nextCurrentRadioStation() {
        this.currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > maxRadioStation) {
            this.currentRadioStation = minRadioStation;
        }
    }

    public void prevCurrentRadioStation() {
        this.currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < minRadioStation) {
            this.currentRadioStation = maxRadioStation;
        }
    }

    public void stationInput(int stationInput) {
        if (stationInput < 0) {
            return;
        }
        if (stationInput > 9) {
            return;
        }
        this.currentRadioStation = stationInput;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void upCurrentVolume() {
        this.currentVolume = currentVolume + 1;
        if (currentVolume == maxCurrentVolume + 1) {
            this.currentVolume = maxCurrentVolume;
        }
    }

    public void downCurrentVolume() {
        this.currentVolume = currentVolume - 1;
        if (currentVolume == minCurrentVolume - 1) {
            this.currentVolume = minCurrentVolume;
        }
    }
}

