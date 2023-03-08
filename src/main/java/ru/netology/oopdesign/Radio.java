package ru.netology.oopdesign;
public class Radio {

    public int currentRadioNumber;
    public int currentSoundVolume;

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public int getCurrentRadioNumber() {
        return currentRadioNumber;
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
        if (currentSoundVolume >= 100) {
            return;
        } else {
            currentSoundVolume = currentSoundVolume + 1;
        }
        }

    public void decreaseSoundVolume() {
        if (currentSoundVolume <= 0) {
            return;
        }
        currentSoundVolume = currentSoundVolume - 1;
    }



}
