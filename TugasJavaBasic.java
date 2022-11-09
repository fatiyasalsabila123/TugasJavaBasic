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

        System.out.println("Silahkan Login Terlebih Dahulu !!!");

        System.out.println("Masukan Nama : ");
        nama = sc.nextLine();

        System.out.println("Masukan Password : ");
        pass = sc.nextLine();

        System.out.println("Masukan PIN : ");
        pin = sc.nextInt();


        if (nama.equals("Administrator") && pass.length() >= 5 && pin == 123456789) {
            System.out.println("Akses Diterima, Selamat Datang !!!");
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
                                int luas;
                                    int p, l, s;
                                    int alas, t;
                                    int r;
                                    do {
                                        System.out.println("1. Luas");

                                        System.out.println(
                                                "Silahkan Pilih Nomor : \n 1. Persegi Panjang \n 2. Persegi \n 3. Segitiga \n 4. Lingkaran \n 5. Exit");
                                        luas = sc.nextInt();

                                        System.out.println("Anda Memilih Nomor : " + luas);

                                        switch (luas) {
                                            case 1:
                                                System.out.println("Rumus Persegi Panjang p * l");
                                                System.out.println("Masukan Panjang Persegi Panjang : ");
                                                p = sc.nextInt();
                                                System.out.println("Masukan Lebar Persegi Panjang : ");
                                                l = sc.nextInt();
                                                System.out.println("Hasil " + (p * l) + " m²");
                                                break;
                                            case 2:
                                                System.out.println("Rumus Luas Persegi s * s ");
                                                System.out.println("Masukan Sisi Persegi");
                                                s = sc.nextInt();
                                               
                                                System.out.println("Hasil : " + (s * s) + " m²");
                                                break;
                                            case 3:
                                                System.out.println("Rumus Segitiga 1/2 * alas * tinggi");
                                                System.out.println("Masukan Alas Segitiga : ");
                                                alas = sc.nextInt();
                                                System.out.println("Masukan Tinggi Segitiga : ");
                                                t = sc.nextInt();
                                                System.out.println("Hasil : " + (1 * alas * t / 2) + " m² ");
                                                break;
                                            case 4:
                                                System.out.println("Rumus LUas Lingkaran L = pi * r * r");
                                                System.out.println("Masukan r Lingkaran : ");
                                                r = sc.nextInt();
                                                System.out.println("Masukan r Lingkaran : ");
                                                r = sc.nextInt();
                                                System.out.println("Hasil : " + (22 * r * r / 7) + " m²");
                                                break;
                                            default:
                                                break;
                                        }

                                    } while (luas < 5);
                                    break;

                                case 2:
                                    int volume;
                                    int panjang, lebar, tinggi, jari2;
                                    do {
                                        System.out.println("1. Volume");

                                        System.out.println(
                                                "Silahkan Pilih Nomor \n 1. Balok \n 2. Kubus \n 3. Bola \n 4. Exit");
                                        volume = sc.nextInt();
                                        System.out.print("Anda Memilih Nomor : " + volume);
                                        switch (volume) {
                                            case 1:
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
                                                System.out.println("Rumus Volume Kubus v = s * s ");
                                                System.out.println("Masukan Sisi Kubus : ");
                                                s = sc.nextInt();
                                                System.out.println("Hasil : " + (s * s) + "Liter");
                                                break;

                                            case 3:
                                                System.out.println("Rumus Volume Bola V = 4/3 22/7 * r³");
                                                System.out.println("Masukan Jari2 : ");
                                                jari2 = sc.nextInt();
                                                System.out.println(
                                                        "Hasil : " + (22 * jari2 * jari2 * jari2 / 7) + "Liter");
                                                break;

                                            default:
                                                break;
                                        }
                                    } while (volume < 4);
                                    break;

                            }

                        } while (volumeLuas < 3);
                        break;

                    case 2:
                        int konversi;
                        int c;
                        // reamur ke celsius
                        int R1;                        
                        // fahrenheit
                        int fahrenheit;
                       
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
                                                            far = sc.nextInt();
                                                            System.out.println(
                                                                    "Hasil :° F = " + (c * 9 + far / 5)
                                                                            + " °F");
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
                                                            System.out.println("Hasil :" + (5 * R1 / 4)+ " °C" );
                                                            break;

                                                        case 2:
                                                            System.out.println("Anda Memilih Reamur Ke Fahrenheit");
                                                            System.out.println(
                                                                    "Rumus Reamur Ke Fahrenheit :  °F = (9/4 x °R) +32");
                                                            System.out.println("Masukan Reamur : ");
                                                            R1 = sc.nextInt();
                                                            System.out.println(
                                                                    "Hasil :" + ( 9 * R1 + far / 4)+ " °F" );
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
                                                                    "Rumus Fahrenheit ke Celsius : C = 5/9 (F-32)");
                                                            System.out.print("Masukan Fahrenheit : ");
                                                            fahrenheit = sc.nextInt();
                                                            System.out.println(
                                                                    "Hasil : " + (5 * fahrenheit - far / 9) + " °C"
                                                                            );
                                                            break;
                                                        case 2:
                                                            System.out.println("Anda Memilih Fahrenheit ke Reamur");
                                                            System.out.println(
                                                                    "Rumus Fahrenheit ke Reamur :°F -32 * 4/9");
                                                            System.out.println("Masukan Fahrenheit : ");
                                                            fahrenheit = sc.nextInt();
                                                            System.out.println("Masukan Bilnangan : 32");
                                                            far = sc.nextInt();
                                                            System.out
                                                                    .println("Hasil : " + ( 4 * fahrenheit - far / 9)+ " °R");
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
                                    float meter2;
                                    do {
                                        System.out.println(
                                                " Silahkan Pilih : \n 1. Km = Kilo Meter \n 2. Hm = Hekto Meter \n 3. Dam = Deka Meter  \n 4. Dm = Desi Meter \n 5. Cm = Centi Meter \n 6. Mm = Mili Meter \n 7. Exit");
                                        meter = sc.nextInt();
                                        System.out.println("Anda Memilih Nomor " + meter);
                                        switch (meter) {
                                            case 1:
                                                System.out.println("Km = Kilo Meter");
                                                System.out.print("Masukan meter = ");
                                                meter2 = sc.nextInt();
                                                System.out.println("Hasil : " + (meter2 / 1000) + " Km =  Kilo Meter");
                                                break;
                                            case 2:
                                                System.out.println("Hm = Hekto Meter");
                                                System.out.print("Masukan meter : ");
                                                meter2 = sc.nextInt();
                                                System.out.println("Hasil : Hm = " + (meter2 / 100) + " Hm = Hekto Meter");
                                                break;
                                            case 3:
                                                System.out.println("Dam = Deka Meter");
                                                System.out.print("Masukan meter : ");
                                                meter2 = sc.nextInt();
                                                System.out.println("Hasil : Dam = " + (meter2 / 10) + " Dam = Deka Meter");
                                                break;
                                            case 4:
                                                System.out.println("Dm = Desi Meter");
                                                System.out.print("Masukan meter : ");
                                                meter2 = sc.nextInt();
                                                System.out.println("Hasil : Dm = " + (meter2 * 10) + " Dm = Desi Meter");
                                                break;
                                            case 5:
                                                System.out.println("Cm = Centi Meter");
                                                System.out.print("Masukan meter : ");
                                                meter2 = sc.nextInt();
                                                System.out.println("Hasil : Cm = " + (meter2 * 100) + " Cm = Centi Meter");
                                                break;
                                            case 6:
                                                System.out.println(" Mm = Mili Meter");
                                                System.out.print("Masukan meter : ");
                                                meter2 = sc.nextInt();
                                                System.out
                                                        .println("Hasil : Mm = " + (meter2 * 1000) + "  Mm = Mili Meter");
                                                break;

                                            default:
                                                break;
                                        }

                                    } while (meter < 7);
                                    break;
                                case 3:
                                    int berat;
                                    float gram;
                                    do {
                                        System.out.println(
                                                "Silahkan Pilih : \n 1. Kg = Kilogram \n 2. Hg(ons) = Hektogram \n 3. Dag = Dekagram \n 4. Dg = DesiGram \n 5. Cg = Sentigram \n 6. Mg = Miligram \n 7. Exit");
                                        berat = sc.nextInt();
                                        System.out.println("Anda Memilih Nomor : " + berat);
                                        switch (berat) {
                                            case 1:
                                                System.out.println("Kg = Kilogram");
                                                System.out.print("Masukan Gram : ");
                                                gram = sc.nextInt();
                                                System.out.println("Hasil : " + (gram / 1000) + " Kg = Kilogram");
                                                break;
                                            case 2:
                                                System.out.println("Hg(ons) = Hektogram");
                                                System.out.print("Masukan Gram : ");
                                                gram = sc.nextInt();
                                                System.out.println("Hasil : " + (gram / 100) + " Hg(ons) = Hektogram");
                                                break;
                                            case 3:
                                                System.out.println("Dag = Dekagram");
                                                System.out.print("Masukan Gram : ");
                                                gram = sc.nextInt();
                                                System.out.println("Hasil : " + (gram / 10) + " Dag = Dekagram");
                                                break;
                                            case 4:
                                                System.out.println(" Dg = DesiGram");
                                                System.out.print("Masukan Gram : ");
                                                gram = sc.nextInt();
                                                System.out.println("Hasil : " + (gram * 10) + "  Dg = DesiGram");
                                                break;
                                            case 5:
                                                System.out.println("Cg = Sentigram");
                                                System.out.print("Masukan Gram : ");
                                                gram = sc.nextInt();
                                                System.out.println("Hasil : " + (gram * 100) + " Cg = Sentigram");
                                                break;
                                            case 6:
                                                System.out.println("Mg = Miligram");
                                                System.out.print("Masukan Gram : ");
                                                gram = sc.nextInt();
                                                System.out.println("Hasil : " + (gram * 1000) + " Mg = Miligram");
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
                        System.out.println("Masukan Kode Rahasia ");
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
                                    String reverse;
                                        System.out.println("Reverse");
                                        sc.nextLine();
                                        System.out.print("Masukan Kalimat : ");
                                        reverse = sc.nextLine();
                                        List<String> list = Arrays.asList(reverse.split(" "));
                                        Collections.reverse(list);
                                        System.out.println(String.join(" ", list));
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
            System.out.println("Akses Ditolak ");
        }sc.close();
    }
}
