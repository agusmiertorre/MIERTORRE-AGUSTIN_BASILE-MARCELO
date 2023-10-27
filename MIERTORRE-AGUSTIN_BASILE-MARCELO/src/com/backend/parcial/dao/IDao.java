package com.backend.parcial.dao;

import com.backend.parcial.model.Odontologo;

import java.util.List;

public interface IDao <T> {

    T registrar(T t);
    List<Odontologo> listarOdontologos();


}
