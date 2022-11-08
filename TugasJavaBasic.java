import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class TugasJavaBasic {
    public static void main(String[] args) {
        String nama;
        String pass;
        int pin;
        int bangunan;
        Scanner sc = new Scanner(System.in);

        System.out.println("Silahkan Login Terlebih Dahulu");

        System.out.println("Masukan Nama : ");
        nama = sc.nextLine();

        System.out.println("Masukan Password : ");
        pass = sc.nextLine();

        System.out.println("Masukan PIN : ");
        pin = sc.nextInt();


        if (nama.equals("Administrator") && pass.length() >= 5 && pin == 123456789) {
            System.out.println("Akses Diterima, Selamat Datang");
            do {
                System.out.println(
                        "Silahkan Pilih Menu : \n 1. Bangun Ruang/Datar \n 2. Konversi \n 3. Secret Menu \n 4. Exit");

                System.out.println("Silahkan Pilih Nomor : ");
                bangunan = sc.nextInt();

                System.out.println("Nomor Yang Anda Pilih : " + bangunan);
                switch (bangunan) {
                    case 1:
                        int volumeLuas;
                        do {
                            System.out.println("Bagian Bangun Ruang/Datar : ");

                            System.out.println(
                                    " Silahkan pilih nomor \n 1.  Luas (Meter Kuadrat) \n 2. Volume (Liter) \n 3. Exit");
                            volumeLuas = sc.nextInt();

                            System.out.println("Anda Memilih Nomor : " + volumeLuas);
                            switch (volumeLuas) {
                                case 1:
                                    int p, l, s;
                                    int alas, t, segitiga = 1 / 2;
                                    int r;
                                    do {
                                        System.out.println("1. Luas");

                                        System.out.println(
                                                "Silahkan Pilih Nomor : \n 1. Persegi Panjang \n 2. Persegi \n 3. Segitiga \n 4. Lingkaran \n 5. Exit");
                                        volumeLuas = sc.nextInt();

                                        System.out.println("Anda Memilih Nomor : " + volumeLuas);

                                        switch (volumeLuas) {
                                            case 1:
                                                System.out.println("Soal 1");
                                                System.out.println("Rumus Persegi Panjang p * l");
                                                System.out.println("Masukan Panjang Persegi Panjang : ");
                                                p = sc.nextInt();
                                                System.out.println("Masukan Lebar Persegi Panjang : ");
                                                l = sc.nextInt();
                                                System.out.println("Hasil " + (p * l) + "cm³");
                                                break;
                                            case 2:
                                                System.out.println("Soal 2");
                                                System.out.println("Rumus Luas Persegi s * s ");
                                                System.out.println("Masukan Sisi Persegi");
                                                s = sc.nextInt();
                                                System.out.println("Masukan Sisi Persegi");
                                                s = sc.nextInt();
                                                System.out.println("Hasil : " + (s * s) + " cm³");
                                                break;
                                            case 3:
                                                System.out.println("Soal 3");
                                                System.out.println("Rumus Segitiga 1/2 * alas * tinggi");
                                                System.out.println("Masukan Alas Segitiga : ");
                                                alas = sc.nextInt();
                                                System.out.println("Masukan Tinggi Segitiga : ");
                                                t = sc.nextInt();
                                                System.out.println("Hasil : " + (1 * alas * t / 2) + " cm³ ");
                                                break;
                                            case 4:
                                                System.out.println("Soal 4");
                                                System.out.println("Rumus LUas Lingkaran L = pi * r * r");
                                                System.out.println("Masukan r Lingkaran : ");
                                                r = sc.nextInt();
                                                System.out.println("Masukan r Lingkaran : ");
                                                r = sc.nextInt();
                                                System.out.println("Hasil : " + (22 * r * r / 7) + " cm³");
                                                break;
                                            default:
                                                break;
                                        }

                                    } while (volumeLuas < 5);
                                    break;

                                default:
                                    System.out.println("Anda Berhasil Keluar");
                                    break;
                                case 2:
                                    int volume;
                                    int panjang, lebar, tinggi, sisi1, jari2;
                                    do {
                                        System.out.println("1. Volume");

                                        System.out.println(
                                                "Silahkan Pilih Nomor \n 1. Balok \n 2. Kubus \n 3. Bola \n 4. Exit");
                                        volume = sc.nextInt();
                                        System.out.print("Anda Memilih Nomor : " + volume);
                                        switch (volume) {
                                            case 1:
                                                System.out.println("Soal 1");
                                                System.out.println("Rumus Balok v = p * l * t");
                                                System.out.println("Masukan Panjang Balok : ");
                                                panjang = sc.nextInt();
                                                System.out.println("Masukan Lebar Balok : ");
                                                lebar = sc.nextInt();
                                                System.out.println("Masukan Tingi Balok : ");
                                                tinggi = sc.nextInt();
                                                System.out.println("Hasil : " + (panjang * lebar * tinggi) + "Liter");
                                                break;
                                            case 2:
                                                System.out.println(" Soal 2");
                                                System.out.println("Rumus Volume Kubus v = s * s ");
                                                System.out.println("Masukan Sisi Kubus : ");
                                                sisi1 = sc.nextInt();
                                                System.out.println("Masukan Sisi Kubus : ");
                                                sisi1 = sc.nextInt();
                                                System.out.println("Hasil : " + (sisi1 * sisi1) + "Liter");

                                            case 3:
                                                System.out.println("Soal 3");
                                                System.out.println("Rumus Volume Bola V = 4/3 * r³");
                                                System.out.println("Masukan Jari2 : ");
                                                jari2 = sc.nextInt();
                                                System.out.println("Masukan Jari2 : ");
                                                jari2 = sc.nextInt();
                                                System.out.println("Masukan Jari2 : ");
                                                jari2 = sc.nextInt();
                                                System.out.println(
                                                        "Hasil : " + (22 * jari2 * jari2 * jari2 / 7) + "Liter");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (volume < 3);
                                    break;

                            }

                        } while (volumeLuas < 3);
                        break;

                    case 2:
                        int konversi;
                        int c, bilangan = 32;
                        // reamur ke celsius
                        int R1, Reamur = 5 / 4;
                        // reamur ke fanhareit
                        int Re;
                        int f = 9 / 4;
                        int g = 32;
                        // fahrenheit
                        int fahrenheit;
                        int fa = 5 / 9;
                        int far = 32;
                        do {
                            System.out.println("2. Konversi");
                            System.out.println("Silahkan Pilih \n 1. Derajat \n 2. Panjang \n 3. Berat \n 4. Exit");
                            konversi = sc.nextInt();
                            System.out.println("Anda Memilih Nomor : " + konversi);
                            switch (konversi) {
                                case 1:
                                    do {
                                        System.out.println("1. Derajat");
                                        System.out.println(" 1. Celsius \n 2. Reamur \n 3. Fahrenheit  \n 4. Exit");
                                        konversi = sc.nextInt();
                                        System.out.println("Anda Memilih Nomor : " + konversi);
                                        switch (konversi) {
                                            case 1:

                                                do {
                                                    System.out.println("Celsius");
                                                    System.out.println(
                                                            "Silahkan Memilih :\n 1. Celsius Ke Reamur \n 2. Celsius Ke Fahrenheit  \n 3. Exit");
                                                    konversi = sc.nextInt();
                                                    System.out.println("Anda memilih Nomor : " + konversi);

                                                    switch (konversi) {
                                                        case 1:
                                                            System.out.println("1. Celsius Ke Reamur");
                                                            System.out
                                                                    .println("Rumus Celsius Ke Reamur : °R = 4/5 * °C");
                                                            System.out.println("Masukan celsius : ");
                                                            c = sc.nextInt();
                                                            System.out.println("Hasil : " + (4 * c / 5) + " °R");
                                                            break;
                                                        case 2:
                                                            System.out.println(
                                                                    "Rumus Celsius ke Fahrenheit   : T (° F) = T (° C) * 9/5 + 32");
                                                            System.out.println("Masukan Celsius : ");
                                                            c = sc.nextInt();
                                                            System.out.println("Tambahkan Bilangan : 32");
                                                            bilangan = sc.nextInt();
                                                            System.out.println(
                                                                    "Hasil : T (° F) = " + (c * 9 + bilangan / 5)
                                                                            + " ° F");
                                                            break;

                                                        default:
                                                            break;
                                                    }

                                                } while (konversi < 3);
                                                break;
                                            case 2:
                                                do {

                                                    System.out.println(
                                                            "Silahkan Memilih \n 1. Reamur Ke Celsius \n 2. Reamur Ke Fahrenheit \n 3. Exit");
                                                    konversi = sc.nextInt();
                                                    switch (konversi) {
                                                        case 1:
                                                            System.out.println("Rumus Reamur Ke Celsius : 5/4 x °R");
                                                            System.out.println("Masukan Reamur : ");
                                                            R1 = sc.nextInt();
                                                            System.out.println("Hasil :" + (5 * R1 / 4) + " °C");
                                                            break;

                                                        case 2:
                                                            System.out.println("Anda Memilih Reamur Ke Fahrenheit");
                                                            System.out.println(
                                                                    "Rumus Reamur Ke Fahrenheit : S(°F) = (S(°Ré) * 9/4) + 32");
                                                            System.out.println("Masukan Reamur : ");
                                                            Re = sc.nextInt();
                                                            System.out.println("Masukan Bilangan : 32");
                                                            System.out.println(
                                                                    "Hasil :" + (Re * 9 * bilangan / 4) + "°F");
                                                            break;

                                                        default:
                                                            break;
                                                    }

                                                } while (konversi < 3);
                                                break;
                                            case 3:
                                                do {
                                                    System.out.println(
                                                            "Silahkan Memilih : \n 1. Fahrenheit ke Celsius \n 2. Fahrenheit ke Reamur \n 3. Exit");
                                                    konversi = sc.nextInt();
                                                    switch (konversi) {
                                                        case 1:
                                                            System.out.println("Anda Memillih  Fahrenheit ke Celsius");
                                                            System.out.println(
                                                                    "Rumus Fahrenheit ke Celsius : T °C = 5/9 (T°F-32°)");
                                                            System.out.print("Masukan Fahrenheit : ");
                                                            fahrenheit = sc.nextInt();
                                                            System.out.println(
                                                                    "Hasil : T °C = " + (5 * fahrenheit - far / 9)
                                                                            + " °C");
                                                            break;
                                                        case 2:
                                                            System.out.println("Anda Memilih Fahrenheit ke Reamur");
                                                            System.out.println(
                                                                    "Rumus Fahrenheit ke Reamur : (°F + (-32)) x (9 / 4)");
                                                            System.out.println("Masukan Fahrenheit : ");
                                                            fahrenheit = sc.nextInt();
                                                            System.out.println("Masukan Bilnangan : 32");
                                                            far = sc.nextInt();
                                                            System.out
                                                                    .println("Hasil : " + (9 * fahrenheit - far / 4));
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                } while (konversi < 3);
                                                break;

                                        }
                                    } while (konversi < 4);
                                    break;
                                case 2:
                                    int meter;
                                    int meter1;
                                    float meter2;
                                    do {
                                        System.out.println(
                                                " Silahkan Pilih : \n 1. Km = Kilo Meter \n 2. Hm = Hekto Meter \n 3. Dam = Deka Meter  \n 4. Dm = Desi Meter \n 5. Cm = Centi Meter \n 6. Mm = Mili Meter \n 7. Exit");
                                        meter = sc.nextInt();
                                        System.out.println("Anda Memilih Nomor " + meter);
                                        switch (meter) {
                                            case 1:
                                                System.out.println("Km = Kilo Meter");
                                                System.out.print("Masukan = ");
                                                meter2 = sc.nextInt();
                                                System.out.println("Hasil : " + (meter2 / 10 / 10 / 10) + " Meter");
                                                break;
                                            case 2:
                                                System.out.println("Hm = Hekto Meter");
                                                System.out.print("Masukan : ");
                                                meter2 = sc.nextInt();
                                                System.out.println("Hasil : Hm = " + (meter2 / 10 / 10) + " Meter");
                                                break;
                                            case 3:
                                                System.out.println("Dam = Deka Meter");
                                                System.out.print("Masukan : ");
                                                meter2 = sc.nextInt();
                                                System.out.println("Hasil : Dam = " + (meter2 / 10) + " Meter");
                                                break;
                                            case 4:
                                                System.out.println("Dm = Desi Meter");
                                                System.out.print("Masukan : ");
                                                meter1 = sc.nextInt();
                                                System.out.println("Hasil : Dm = " + (meter1 * 10) + " Meter");
                                                break;
                                            case 5:
                                                System.out.println("Cm = Centi Meter");
                                                System.out.print("Masukan : ");
                                                meter1 = sc.nextInt();
                                                System.out.println("Hasil : Cm = " + (meter1 * 10 * 10) + " Meter");
                                                break;
                                            case 6:
                                                System.out.println(" Mm = Mili Meter");
                                                System.out.print("Masukan : ");
                                                meter1 = sc.nextInt();
                                                System.out
                                                        .println("Hasil : Mm = " + (meter1 * 10 * 10 * 10) + " Meter");
                                                break;

                                            default:
                                                break;
                                        }

                                    } while (meter < 7);
                                    break;
                                case 3:
                                    int berat;
                                    float gram;
                                    int gram1;
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1. Kg = Kilogram \n 2. Hg(ons) = Hektogram \n 3. Dag = Dekagram \n 4. Dg = DesiGram \n 5. Cg = Sentigram \n 6. Mg = Miligram \n 7. Exit");
                                        berat = sc.nextInt();
                                        System.out.println("Anda Memilih Nomor : " + berat);
                                        switch (berat) {
                                            case 1:
                                                System.out.println("Kg = Kilogram");
                                                System.out.print("Masukan : ");
                                                gram1 = sc.nextInt();
                                                System.out.println("Hasil : " + (gram1 * 10 * 10 * 10) + " Gram");
                                                break;
                                            case 2:
                                                System.out.println("Hg(ons) = Hektogram");
                                                System.out.print("Masukan : ");
                                                gram1 = sc.nextInt();
                                                System.out.println("Hasil : " + (gram1 * 10 * 10) + " Gram");
                                                break;
                                            case 3:
                                                System.out.println("Dag = Dekagram");
                                                System.out.print("Masukan : ");
                                                gram1 = sc.nextInt();
                                                System.out.println("Hasil : " + (gram1 * 10) + " Gram");
                                                break;
                                            case 4:
                                                System.out.println(" Dg = DesiGram");
                                                System.out.print("Masukan : ");
                                                gram = sc.nextInt();
                                                System.out.println("Hasil : " + (gram / 10) + " Gram");
                                                break;
                                            case 5:
                                                System.out.println("Cg = Sentigram");
                                                System.out.print("Masukan : ");
                                                gram = sc.nextInt();
                                                System.out.println("Hasil : " + (gram / 10 / 10) + " Gram");
                                                break;
                                            case 6:
                                                System.out.println("Mg = Miligram");
                                                System.out.print("Masukan : ");
                                                gram = sc.nextInt();
                                                System.out.println("Hasil : " + (gram / 10 / 10 / 10) + " Gram");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (berat < 7);
                                    break;
                            }
                        } while (konversi < 4);
                        break;
                    case 3:
                    int rahasia;
                        String angka;
                        System.out.println("Anda Hurus Input Terlebih Dahulu");
                        angka = sc.next();
                        if (angka.length() > 7 && angka.length() < 10) {
                            System.out.println("Selamat Datang VIP !!!");

                            do {
                                System.out.println("Silahkan Pilih Menu Rahasia");
                                System.out.println("1. Uppercase \n 2. Lowercase \n 3. Reverse \n 4. Exit");
                                rahasia = sc.nextInt();
                                System.out.println("Anda Memilih Nomor : " +
                                        rahasia);
                                switch (rahasia) {
                                    case 1:
                                        System.out.println("Uppercase");
                                        sc.nextLine();
                                        System.out.print("Masukan Kalimat : ");
                                        angka = sc.nextLine();
                                        System.out.println("Hasil : " + angka.toUpperCase());
                                        break;
                                    case 2:
                                        System.out.println("Lowercase");
                                        sc.nextLine();
                                        System.out.print("Masukan Kalimat : ");
                                        angka = sc.nextLine();
                                        System.out.println("Hasil : " + angka.toLowerCase());
                                        break;
                                    case 3:
                                        System.out.println("Reverse");
                                        sc.nextLine();
                                        System.out.print("Masukan Kalimat : ");
                                        angka = sc.nextLine();
                                        List<String> list = Arrays.asList(angka.split(""));
                                        Collections.reverse(list);
                                        System.out.println(String.join("", list));
                                        break;

                                    default:
                                        break;
                                }
                            } while (rahasia < 4);
                            System.out.println("Kembali Ke Menu Awal");
                            break;
                        } else {
                            System.out.println("Kembali Ke Menu Awal");
                        }

                }

            } while (bangunan < 4);
            System.out.println("Berhasil Keluar");
        } else {
            System.out.println("Sistem OFF harus Run Ulang");
        }sc.close();
    }
}
