package com.ISS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("ressource/instructions.asm"))){
            String line;


            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
