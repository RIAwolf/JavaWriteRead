package com.pamokos.penkta;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Irasymas objektas = new Irasymas();

        objektas.paklausimas();
        objektas.irasymasIFaila();


        Skaitymas objektas2 = new Skaitymas();
        objektas2.paklausimas();
        objektas2.atidarytiFaila();
        objektas2.skaitymasIsFailo();

    }
}
