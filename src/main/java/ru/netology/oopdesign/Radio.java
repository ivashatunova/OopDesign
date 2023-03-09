package ru.netology.oopdesign;

public class Radio {

    private int currentRadioNumber;
    private int currentSoundVolume;

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 100) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void setCurrentRadioNumber(int newCurrentRadioNumber) {
        if (newCurrentRadioNumber < 0) {
            return;
        }
        if (newCurrentRadioNumber > 9) {
            return;
        }
        currentRadioNumber = newCurrentRadioNumber;
    }

    public void nextRadioNumber() {
        if (currentRadioNumber >= 9) {
            setCurrentRadioNumber(0);
        } else {
            currentRadioNumber = currentRadioNumber + 1;
        }
    }

    public void prevRadioNumber() {
        if (currentRadioNumber < 1) {
            currentRadioNumber = 9;
        } else {
            currentRadioNumber = currentRadioNumber - 1;
        }
    }

    public void increaseSoundVolume() {
        if (currentSoundVolume < 100) {
            currentSoundVolume = currentSoundVolume + 1;
        }
    }

    public void decreaseSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume = currentSoundVolume - 1;
        }
    }
}
