package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldChangeStationTest() {
        assertEquals(0, radio.getCurrentStation());
        radio.setCurrentStation(5);

        int expectid = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expectid, actual);
    }

    @Test
    public void shouldSetStationUnderMinStationTest() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStationOverMaxStationTest() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationTest() {
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldOverMaxStationTest() {
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldPrevStationTest() {
        radio.setCurrentStation(5);
        radio.previousStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldBelowMinStationTest() {
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldChangeVolumeTest() {
        assertEquals(0, radio.getCurrentVolume());
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMoreMaxVolume() {
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }
    @Test
    public void shouldIncreaseVolumeTest() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldOverMaxVolumeTest() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolumeTest() {
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldBelowMinVolumeTest() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldBelowMoreMinVolumeTest() {
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
