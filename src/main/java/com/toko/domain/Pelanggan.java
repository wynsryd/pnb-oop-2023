package com.toko.domain;

public class Pelanggan {
    private Long id;
    private String nama;
    private String alamat;
    private String email;
    private String telpon;

    public Pelanggan() {
    }

    public Pelanggan(Long id, String nama, String alamat,
                     String email, String telpon) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.telpon = telpon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    @Override
    public String toString() {
        return "Pelanggan{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", email='" + email + '\'' +
                ", telpon='" + telpon + '\'' +
                '}';
    }
}
