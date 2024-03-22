package case3;

public class MataKuliah {
    String kode;
    String namaMk;
    int nilaiAngka;
    String nilaiHuruf;

    MataKuliah(String kode, String namaMk, int nilaiAngka) {
        this.kode = kode;
        this.namaMk = namaMk;
        this.nilaiAngka = nilaiAngka;

        if (nilaiAngka >= 85) {
            this.nilaiHuruf = "A";
        } else if (nilaiAngka >= 70) {
            this.nilaiHuruf = "B";
        } else if (nilaiAngka >= 55) {
            this.nilaiHuruf = "C";
        } else if (nilaiAngka >= 40) {
            this.nilaiHuruf = "D";
        } else {
            this.nilaiHuruf = "E";
        }
    }
}