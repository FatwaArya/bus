package com.company;

public class Mobil {
    private int Penumpang;
    private int maxPenumpang;

    public Mobil(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        Penumpang = 0;
    }

    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.Penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang melebihi kuota");

        } else {
            this.Penumpang = temp;
        }
    }

        public void getPenumpang(int password){
        if (password==24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }


}


    public void cetak() {
        System.out.println("Penumpang Sekarang adalah: " + Penumpang);
        System.out.println("Penumpang Maksium adalah: " + maxPenumpang);


    }
}