package com.company;

public class Bus {
    public int Penumpang;
    public int maxPenumpang;

    public int bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        return Penumpang = 0;
    }

    public void addPenumpang(int penumpang){
        int temp;
        temp = this.Penumpang+penumpang;
        if (temp>= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.Penumpang = temp;
        }
    }


    public void cetak() {
        System.out.println("Penumpang Sekarang adalah: " + Penumpang);
        System.out.println("Penumpang Maksium adlaah: " + maxPenumpang);

    }

}
