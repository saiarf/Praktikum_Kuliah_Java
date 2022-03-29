package com.tutorial;
import java.util.ArrayList;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        //  Buat Objek dari ArrayList
        ArrayList arr_data = new ArrayList();
         
        //  Input jumlah Data yang di inginkan oleh User
        System.out.print("Input jumlah Data : ");   int jlh_data = new Scanner(System.in).nextInt();
         
        //  Input Data dan masukkan ke dalam objek ArrayList yang telah Anda buat
        for(int a = 0; a < jlh_data; a++){
            System.out.print("Masukkan Data ke-"+(a+1)+": ");
            arr_data.add(new Scanner(System.in).nextLine());
        }
         
        //  Tampilkan nilai yang di simpan di dalam ArrayList
        System.out.println("\nTampilkan Data yang di input");
        for(Object o : arr_data){
            System.out.println(o);
        }
         
        //  Masukkan Data yang akan dihapus
        System.out.print("\nInput Data yang akan dihapus : ");  String data_hapus = new Scanner(System.in).nextLine();
         
        //  Lakukan penghapusan Data di dalam ArrayList
        arr_data.remove(data_hapus);
         
        //  Tampilkan kembali nilai yang di simpan di dalam ArrayList
        System.out.println("\nTampilkan kembali Data yang ada di dalam ArrayList");
        for(Object o : arr_data)
            System.out.println(o);
    }
}
