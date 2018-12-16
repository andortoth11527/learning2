package com.company;

public class Main {

    public static void main(String[] args) {

        // 4. scrieti un array cu 10 int-uri. printati elementele care sunt pare
        // 5. scrieti un array cu 10 int-uri printati elementele care sunt impare

        //6. scrieti un array cu 5 string-uri. printati string-urile cu o lungime mai mare de 3 caractere.

        int[] vectorul = {19, 11, 123, 34, 55, 11, 56};

        int pare;

        for (int i = 0; i < vectorul.length; i++) {
            if (vectorul[i] % 2 == 0) {
                System.out.println("Urmatorul element din vector este par: " + vectorul[i]);
            }
        }
        System.out.println("*********************************");
        for (int j = 0; j < vectorul.length; j++) {
            if (vectorul[j] % 2 != 0) {
                System.out.println("Urmatorul vector este impar: " + vectorul[j]);
            }
        }
	// write your code here
    }
}
