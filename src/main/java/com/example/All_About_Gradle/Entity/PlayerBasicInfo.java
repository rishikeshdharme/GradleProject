package com.example.All_About_Gradle.Entity;

public class PlayerBasicInfo {

    private String playerName;
    private String Country;
    private String Speciality;

    public PlayerBasicInfo(String country, String playerName, String speciality) {
        Country = country;
        this.playerName = playerName;
        Speciality = speciality;
    }

    public PlayerBasicInfo() {
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    @Override
    public String toString() {
        return "PlayerBasicInfo{" +
                "Country='" + Country + '\'' +
                ", playerName='" + playerName + '\'' +
                ", Speciality='" + Speciality + '\'' +
                '}';
    }
}
