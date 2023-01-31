package com.bilgeadam.jdbc.service;

import com.bilgeadam.jdbc.DB.DB;
import com.bilgeadam.jdbc.entity.Calisan;
import com.bilgeadam.jdbc.repository.ICrud;

import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CalisanService implements ICrud<Calisan> {

    DB db = new DB();
    Calisan calisan;
    List<Object> ls = new ArrayList<>();


    @Override
    public void getAll() {

    }

    @Override
    public void save(Calisan calisan)  {
        try {
            PreparedStatement insertStatement = db.connection.prepareStatement(
                    "insert into Calisan(isim,yas,maas,departman,sirketid)" +
                            "values(?,?,?,?,?)");


            insertStatement.setString(1,calisan.getIsim());
            insertStatement.setInt(2,calisan.getYas());
            insertStatement.setInt(3,calisan.getMaas());
            insertStatement.setString(4,calisan.getDepartman());
            insertStatement.setInt(5,calisan.getCalisilanSirket().getSirketid());
            insertStatement.executeUpdate();
            System.out.println("Calisan is added");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Calisan calisan) {
            try {
                PreparedStatement list = db.connection.prepareStatement("select \"Calisanid\" from calisan");
                ResultSet rsList = list.executeQuery();
                while (rsList.next()) {
                    ls.add(rsList.getInt("Calisanid"));
                }
                if (ls.contains(calisan.getCalisanid())) {

                    PreparedStatement updateStatement = db.connection.prepareStatement(
                            "update calisan set \"isim\"=?, \"yas\"= ?, \"maas\"= ?, \"departman\"= ?, \"CalisilanSirket\"= ?," +
                                    "where \"Calisanid\" = ?");

                    updateStatement.setString(1, calisan.getIsim());
                    updateStatement.setInt(2, calisan.getYas());
                    updateStatement.setInt(3, calisan.getMaas());
                    updateStatement.setString(4, calisan.getDepartman());
                    updateStatement.setRef(5, (Ref) calisan.getCalisilanSirket());
                    updateStatement.executeUpdate();

                    System.out.println("Calisan is updated");
                    updateStatement.close();
                }else {
                    System.out.println("Product is not found");
                }
                db.connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);

            }
        }


    @Override
    public void delete(int Calisanid) {
        try {
            PreparedStatement list = db.connection.prepareStatement("SELECT * FROM calisan");
            ResultSet rsList = list.executeQuery();
            while (rsList.next()) {
                ls.add(rsList.getInt("Calisanid"));
            }
            if (ls.contains(Calisanid)) {
                PreparedStatement deleteStatement = db.connection.prepareStatement("DELETE FROM calisan WHERE Calisanid =?");
                deleteStatement.setInt(1, Calisanid);
                deleteStatement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
