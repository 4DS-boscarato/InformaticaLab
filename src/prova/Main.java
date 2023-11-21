package prova;

import org.apache.commons.validator.routines.EmailValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        EmailValidator eV = EmailValidator.getInstance();
        System.out.println(eV.isValid("andrea.boscarato@hotmail.com"));
    }
}

