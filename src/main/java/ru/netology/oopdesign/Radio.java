package ru.netology.oopdesign;

public class Radio {

    private int currentRadioNumber; // текущий номер радиостанции
    private int currentSoundVolume; // текущая громкость радио

    private int numberOfRadioStations = 10;// количество радиостанций

    public Radio(int numberOfRadioStations) {
        if (numberOfRadioStations <= 0) {
            return;
        }
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public Radio() {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

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
        if (newCurrentRadioNumber > numberOfRadioStations - 1) {
            return;
        }
        currentRadioNumber = newCurrentRadioNumber;
    }

    public void nextRadioNumber() {
        if (currentRadioNumber >= numberOfRadioStations - 1) {
            setCurrentRadioNumber(0);
        } else {
            currentRadioNumber = currentRadioNumber + 1;
        }
    }

    public void prevRadioNumber() {
        if (currentRadioNumber < 1) {
            currentRadioNumber = numberOfRadioStations - 1;
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
