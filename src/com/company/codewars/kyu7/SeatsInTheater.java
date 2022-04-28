package com.company.codewars.kyu7;

public class SeatsInTheater {
    public static void main(String[] args) {

    }
    public static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols - (col-1)) * (nRows - row);
    }
}
