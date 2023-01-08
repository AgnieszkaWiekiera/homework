package org.example;

public class CinemaSeat {

    final int number;
    final int row;
    boolean isTaken;


    public CinemaSeat(int number, int row, boolean isTaken) {
        this.number = number;
        this.row = row;
        this.isTaken = isTaken;
    }
}
