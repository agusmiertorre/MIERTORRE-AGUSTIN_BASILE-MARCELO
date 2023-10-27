package com.backend.parcial.dao.impl;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;

import java.awt.*;
import java.util.ArrayList;

public class OdontologoDaoMemo implements IDao<Odontologo> {

    private List<Odontologo> odontologoPersistido = new ArrayList<>();
    @Override
    public Odontologo registrar(Odontologo odontologo) {
        return null;
    }

    @Override
    public java.util.List<Odontologo> listarOdontologos() {
        return null;
    }
}
