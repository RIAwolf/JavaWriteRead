package com.pamokos.trecia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by user on 5/26/2017.
 */
public class Skaitymas {
    private String _failoVardas;
    private Scanner _sc;
    private FileReader _in = null;
    private BufferedReader _bufferis;

    public Skaitymas() {
        _sc = new Scanner(System.in);
    }

    public void paklausimas() {
        System.out.println("Iveskite failo pavadinimą");
        _failoVardas = _sc.nextLine();
    }

    public void atidarytiFaila() {
        try {
            _in = new FileReader(_failoVardas);
            _bufferis = new BufferedReader(_in);
        } catch (Exception e) {

        }
    }

    public void skaitymasIsFailo() {
        try {
            String eilute = _bufferis.readLine();
            while (eilute != null) {
                System.out.println(eilute);
                eilute = _bufferis.readLine();
            }
            _bufferis.close();
            _in.close();
        } catch (Exception e) {

        }
    }
}

