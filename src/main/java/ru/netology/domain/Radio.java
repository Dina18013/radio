package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;

    public Radio() {
    }

    public Radio(int sumStation) {
        this.maxRadioStation = sumStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void upCurrentVolume() {
        this.currentVolume = currentVolume + 1;
        if (currentVolume > maxCurrentVolume) {
            this.currentVolume = maxCurrentVolume;
        }
    }

    public void downCurrentVolume() {
        this.currentVolume = currentVolume - 1;
        if (currentVolume < minCurrentVolume) {
            this.currentVolume = minCurrentVolume;
        }
    }
}

