package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadiostationChose() {
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetRadioStationAboveMax(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(15);
        int expected = 0 ;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNotSetRadioStationBelowMin(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextRadioStation(){
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(13);
        radio.next();
        int expected = 14;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNotSetNextRadioStationAboveMax(){
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(19);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetPrevRadioStation(){
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void  shouldNotSetPrevRadioStationBelowMin(){
        Radio radio = new Radio(100);
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 99;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSetVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(102);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNotSetVolumeBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.increaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseVolumeAboveMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public  void shouldReduceVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNotReduceVolumeBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
}