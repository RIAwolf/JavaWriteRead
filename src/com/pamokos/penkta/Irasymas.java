package com.pamokos.penkta;

import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by user on 5/26/2017.
 */
public class Irasymas {
    private String _failoVardas;
    private Scanner _sc;
    private FileWriter _out = null;

    public Irasymas() {
        _sc = new Scanner(System.in);
    }

    public void paklausimas() {
        System.out.println("Iveskite failo pavadinimą");
        _failoVardas = _sc.nextLine();

    }

    public void atidarytiFaila() {
        try {
            _out = new FileWriter(_failoVardas);
        } catch (Exception e) {

        }
    }

    public void irasymasIFaila() {
        System.out.println("Iveskite teksta ka rasysite i faila");
        System.out.println("parasius pabaiga irasymas bus nutrauktas");
        String tekstas = _sc.nextLine();
        while (!tekstas.equals("pabaiga")) {
            try {
                _out.write(tekstas);
                _out.write('\n');
            } catch (Exception e) {
            }
            tekstas = _sc.nextLine();
        }
        try {
            _out.close();
        } catch (Exception e) {
        }
    }
}

