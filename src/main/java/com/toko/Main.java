package com.toko;

import com.toko.dao.CrudDao;
import com.toko.dao.impl.PelangganDaoImpl;
import com.toko.domain.Pelanggan;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CrudDao<Pelanggan, Long> pelangganDao = new PelangganDaoImpl();

        List<Pelanggan> daftarPelanggan = pelangganDao.getAll();

        for (Pelanggan pelanggan : daftarPelanggan) {
            System.out.println(pelanggan);
        }

        daftarPelanggan.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Input Data Pelanggan Baru");
        System.out.println("=========================\n");

        System.out.print("Nama Pelanggan: ");
        String nama = scanner.nextLine();
        System.out.print("Alamat        : ");
        String alamat = scanner.nextLine();
        System.out.print("Email         : ");
        String email = scanner.nextLine();
        System.out.print("Telpon        : ");
        String telpon = scanner.nextLine();

        Pelanggan pelangganBaru = new Pelanggan();
        pelangganBaru.setNama(nama);
        pelangganBaru.setAlamat(alamat);
        pelangganBaru.setEmail(email);
        pelangganBaru.setTelpon(telpon);
        pelangganBaru = pelangganDao.insert(pelangganBaru);
    }
}
