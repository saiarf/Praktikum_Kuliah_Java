package com.tutorial;

public class Array_int_string {
    public static void main(String[] args) {
        int[] nilai;
        String[] siswa;

        nilai = new int[5];
        siswa = new String[3];
        
        nilai[0] = 23;
        nilai[1] = 50;
        nilai[2] = 34;
        nilai[3] = 78;
        nilai[4] = 90;
     
        System.out.println( nilai[0] );  
        System.out.println( nilai[1] );  
        System.out.println( nilai[2] );  
        System.out.println( nilai[3] );  
        System.out.println( nilai[4] );

        siswa[0] = "Ando";
        siswa[1] = "Ani";
        siswa[2] = "Arif";

        System.out.println("\n\n");
        System.out.println( siswa[0] );  
        System.out.println( siswa[1] );
        System.out.println( siswa[2] );
    }
}
