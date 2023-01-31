package com.bilgeadam.jdbc.service;

import com.bilgeadam.jdbc.DB.DB;
import com.bilgeadam.jdbc.entity.Sirket;
import com.bilgeadam.jdbc.repository.ICrud;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class SirketService implements ICrud<Sirket> {

    DB db = new DB();
    Sirket sirket;
    List<Object> ls = new ArrayList<>();

    @Override
    public void getAll() {

    }

    @Override
    public void save(Sirket sirket)  {
        try{
            PreparedStatement insertStatement = db.connection.prepareStatement(
                    "insert into Sirket(Sirketid,sirketIsmi,sirketsahibi,unvani,faaliyetAlani,kurulusYili)" +
                            "values(?,?,?,?,?,?)");

            insertStatement.setInt(1,sirket.getSirketid());
            insertStatement.setString(2,sirket.getSirketIsmi());
            insertStatement.setString(3,sirket.getSirketsahibi());
            insertStatement.setString(4,sirket.getUnvani());
            insertStatement.setString(5,sirket.getFaaliyetAlani());
            insertStatement.setInt(6,sirket.getKurulusYili());
            insertStatement.executeUpdate();
            System.out.println("Sirket is added");
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Sirket sirket) {

    }

    @Override
    public void delete(int t) {

    }
}
