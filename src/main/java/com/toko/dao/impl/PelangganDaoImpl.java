package com.toko.dao.impl;

import com.toko.dao.PelangganDao;
import com.toko.domain.Pelanggan;
import com.toko.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PelangganDaoImpl implements PelangganDao {
    @Override
    public List<Pelanggan> getAll() {
        List<Pelanggan> daftarPelanggan = new ArrayList<>();
        try (Connection connection =
                     ConnectionManager.getInstance()
                             .getConnection()) {

            String query = """
                    SELECT id, nama, alamat, email, telpon
                    FROM pelanggan
                    ORDER BY id
                    """;

            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                long id = rs.getLong("id");
                String nama = rs.getString("nama");
                String alamat = rs.getString("alamat");
                String email = rs.getString("email");
                String telpon = rs.getString("telpon");

                Pelanggan pelanggan =
                        new Pelanggan(id, nama, alamat, email, telpon);
                daftarPelanggan.add(pelanggan);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return daftarPelanggan;
    }

    @Override
    public Pelanggan get(Long id) {
        return null;
    }

    @Override
    public Pelanggan insert(Pelanggan domain) {
        try (Connection connection =
                     ConnectionManager.getInstance().getConnection()) {

            String query = """
                    INSERT INTO pelanggan (nama, alamat, email, telpon)
                    VALUES (?, ?, ?, ?)
                    """;

            PreparedStatement stmt = connection.prepareStatement(query,
                    Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, domain.getNama());
            stmt.setString(2, domain.getAlamat());
            stmt.setString(3, domain.getEmail());
            stmt.setString(4, domain.getTelpon());
            int count = stmt.executeUpdate();
            System.out.println(count + " row inserted.");

            ResultSet keys = stmt.getGeneratedKeys();
            Long lastId = null;
            while (keys.next()) {
                lastId = keys.getLong(1);
            }
            domain.setId(lastId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return domain;
    }

    @Override
    public Pelanggan update(Pelanggan domain) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
