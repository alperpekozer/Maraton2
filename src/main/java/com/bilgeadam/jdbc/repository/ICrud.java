package com.bilgeadam.jdbc.repository;

import java.sql.SQLException;
import java.util.List;

public interface ICrud <T>{
    //gerekli metotlar yazılacak
    //ilgili claslara gönderilecek

    void getAll();
    void save(T t) throws SQLException;
    void update(T t);
    void delete(int t);
}
