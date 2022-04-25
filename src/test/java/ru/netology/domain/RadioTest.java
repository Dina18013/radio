package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void middleStandartSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void minStandartSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void maxStandartSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void invalidStandartSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void middleNonStandartSetCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 15;
        radio.setCurrentRadioStation(15);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void maxNonStandartSetCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 29;
        radio.setCurrentRadioStation(29);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void minNonStandartSetCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 0;
        radio.setCurrentRadioStation(0);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void largeNonStandartSetCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 0;
        radio.setCurrentRadioStation(30);
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void minStandartNextCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentRadioStation(0);
        radio.nextCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void maxStandartNextCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentRadioStation(9);
        radio.nextCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void middleStandartNextCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setCurrentRadioStation(4);
        radio.nextCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void maxNonStandartNextCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 0;
        radio.setCurrentRadioStation(29);
        radio.nextCurrentRadioStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void middleNonStandartNextCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 15;
        radio.setCurrentRadioStation(14);
        radio.nextCurrentRadioStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void minNonStandartNextCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 1;
        radio.setCurrentRadioStation(0);
        radio.nextCurrentRadioStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void maxStandartPrevCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setCurrentRadioStation(9);
        radio.prevCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void middleStandartPrevCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentRadioStation(5);
        radio.prevCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void minStandartPrevCurrentRadioStation() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentRadioStation(0);
        radio.prevCurrentRadioStation();
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void maxNonStandartPrevCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 28;
        radio.setCurrentRadioStation(29);
        radio.prevCurrentRadioStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void middleNonStandartPrevCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 14;
        radio.setCurrentRadioStation(15);
        radio.prevCurrentRadioStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void minNonStandartPrevCurrentRadioStation() {
        int sumRadioStation = 30;
        Radio radio = new Radio(sumRadioStation);
        int expected = 29;
        radio.setCurrentRadioStation(0);
        radio.prevCurrentRadioStation();
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void minUpCurrentVolume() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentVolume(0);
        radio.upCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void maxUpCurrentVolume() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(100);
        radio.upCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void middleUpCurrentVolume() {
        Radio radio = new Radio();
        int expected = 51;
        radio.setCurrentVolume(50);
        radio.upCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void upCurrentVolume() {
        Radio radio = new Radio();
        int expected = 2;
        radio.setCurrentVolume(1);
        radio.upCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void largeUpCurrentVolume() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(99);
        radio.upCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void invalidUpCurrentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(-1);
        radio.upCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void notRightUpCurrentVolume() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(101);
        radio.upCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void maxDownCurrentVolume() {
        Radio radio = new Radio();
        int expected = 99;
        radio.setCurrentVolume(100);
        radio.downCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void minDownCurrentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(0);
        radio.downCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void middleDownCurrentVolume() {
        Radio radio = new Radio();
        int expected = 49;
        radio.setCurrentVolume(50);
        radio.downCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void largeDownCurrentVolume() {
        Radio radio = new Radio();
        int expected = 98;
        radio.setCurrentVolume(99);
        radio.downCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void notRightDownCurrentVolume() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(101);
        radio.downCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
}



