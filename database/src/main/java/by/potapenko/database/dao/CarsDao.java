package by.potapenko.database.dao;


import by.potapenko.database.entities.Car;

import java.sql.*;
import java.util.List;

public class CarsDao {
    private static final CarsDao INSTANCE = new CarsDao();

    private CarsDao() {
    }

    public static CarsDao getInstance() {
        return INSTANCE;
    }
}
