package ru.netology.oopdesign;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RadioNumberBorderAndInsideBorder.csv")
    public void setRadioNumberBorderAndInsideBorder(int expected) {
        Radio radio = new Radio();

        radio.setCurrentRadioNumber(expected);
        int actual = radio.getCurrentRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RadioNumberOutsideBorder.csv")
    public void setRadioNumberOutsideBorder(int CurrentRadioNumber) {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(5);
        int expected = radio.getCurrentRadioNumber();

        radio.setCurrentRadioNumber(CurrentRadioNumber);
        int actual = radio.getCurrentRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/NextRadioNumber.csv")
    public void nextRadioNumberLeftBorderAndInsideBorder(int currentRadioNumber) {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(currentRadioNumber);
        int expected = radio.getCurrentRadioNumber() + 1;
        radio.nextRadioNumber();
        int actual = radio.getCurrentRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/PrevRadioNumber.csv")
    public void shouldPrevRadioNumberRightBorderAndInsideBorder(int currentRadioNumber) {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(currentRadioNumber);
        int expected = radio.getCurrentRadioNumber() - 1;
        radio.prevRadioNumber();
        int actual = radio.getCurrentRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioNumberRightBorder() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(9);
        int expected = 0;
        radio.nextRadioNumber();
        int actual = radio.getCurrentRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioNumberLeftBorder() {
        Radio radio = new Radio();
        radio.setCurrentRadioNumber(0);
        int expected = 9;
        radio.prevRadioNumber();
        int actual = radio.getCurrentRadioNumber();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/IncreaseSoundVolumeLeftBorderAndInsideBorder.csv")
    public void increaseSoundVolumeLeftBorderAndInsideBorder(int currentSoundVolume) {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(currentSoundVolume);
        int expected = currentSoundVolume + 1;
        radio.increaseSoundVolume();
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolumeRightBorder() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(100);
        int expected = 100;
        radio.increaseSoundVolume();
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DecreaseSoundVolumeRightBorderAndInsideBorder.csv")
    public void decreaseSoundVolumeRightBorderAndInsideBorder(int currentSoundVolume) {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(currentSoundVolume);
        int expected = radio.getCurrentSoundVolume() - 1;
        radio.decreaseSoundVolume();
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseSoundVolumeLeftBorder() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        int expected = radio.getCurrentSoundVolume();
        radio.decreaseSoundVolume();
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


}

