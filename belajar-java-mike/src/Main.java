import java.util.Scanner;

public class Main {
    public static void calc (int a, int b, String op){
        if (op.equals("+")) {
            System.out.println(a + b);
        } else if (op.equals("-")) {
            System.out.println(a - b);
        } else if (op.equals("x")) {
            System.out.println(a * b);
        } else if (op.equals(":")) {
            System.out.println(a / b);
        } else if (op.equals("%")) {
            System.out.println(a % b);
        } else {
            System.out.println("input tidak valid");

        }
    }
    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan a:");
//        int a = Integer.parseInt(scanner.nextLine());
//        System.out.print("Masukkan b:");
//        int b = Integer.parseInt(scanner.nextLine());
//
//        System.out.println(a+b);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        boolean kondisi=true;

        while (kondisi){


        System.out.print("Masukkan a:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan b:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.print("Masukkan Operator:");
        String op = scanner.nextLine();

        calc(a, b, op);


        System.out.print("lanjut");
        String tanya = scanner.nextLine();
        if (tanya.equals("ya")) {
            kondisi = true;
        } else {
            kondisi = false;
        }
    }


    scanner.close();























        //       String nama = "Muhammad Nasarul Amir";
//
        //      System.out.println(nama);
        //     System.out.println("Nama")
//     int a = 24;
//     int b =16;
//
//
//        System.out.println(a+b);
//        System.out.println(a-b);

        // Operator logika
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//        System.out.println(!false);
//        System.out.println(!true);

//        < > == <= >=

//        int a = 30;
//        int b = 31;
//
//        System.out.println(a<b);


        // Kondisi

//        int saldo = 2000;
//        int tarik = 1900;
//
//        if(tarik > 1000 && tarik <= saldo)
//        {
//            System.out.println("Saldo berhasil ditarik kena pajak 100%");}
//        else if (tarik <= saldo)
//        {System.out.println("saldo berhasil ditarik");}
//        else {

//      int cek = 1;
//      while (cek <= 10) {
//          System.out.println("looping");
//
//          cek = cek + 1;
//   //   }
//       for (int i = 1; i <= 10; i++){
//        System.out.println("looping" + i);}
//        Scanner scanner = new Scanner(System.in) ;
//        System.out.println("Masukkan nama anda");
//        String nama = scanner.nextLine();}
//
//        System.out.println("Halo, " + nama + "!");
//        if(nama == "lisa" ){
//            System.out.println("Apakabar!");
//    } else {
//        System.out.println("bayar hutang mu!");
//    }
//        scanner.close();





























    }
};
