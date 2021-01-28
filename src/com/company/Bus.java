package com.company;

public class Bus {
    private double Penumpang;
    private double maxPenumpang;
    private double counter = 0;
    private double beratPenumpang;


    public  Bus(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        Penumpang = 0;
    }


    public void addPenumpang(double penumpang, double beratPenumpangKG){
        double temp;
        temp = this.Penumpang+penumpang;
        if (temp>= maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else {
            this.Penumpang = temp;
        }
        counter = counter + (beratPenumpangKG * penumpang);
    }
    public double getAverage() {
        double average;
        average =counter/this.Penumpang;
        System.out.println("Rata-Rata Berat Penumpang adalah: " +average);
        return average;
    }

    public void getPenumpang(double password){
        if (password==24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }

    public void cetak() {
        System.out.println("Penumpang Sekarang adalah : " + Penumpang);
        System.out.println("Penumpang Maksium adalah : " + maxPenumpang);

    }
}
