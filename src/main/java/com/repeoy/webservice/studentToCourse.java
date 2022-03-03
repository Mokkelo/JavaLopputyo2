package com.repeoy.webservice;

public class studentToCourse {
    private int kurssiID;
    private int opiskelijaID;

    public studentToCourse(int kurssiID, int opiskelijaID){
        this.kurssiID = kurssiID;
        this.opiskelijaID = opiskelijaID;
    }

    public int getKurssiID() {
        return kurssiID;
    }

    public int getOpiskelijaID() {
        return opiskelijaID;
    }
}
