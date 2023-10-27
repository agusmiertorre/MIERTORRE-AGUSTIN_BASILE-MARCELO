package com.backend.parcial.dao;

import com.backend.parcial.model.Odontologo;

import java.awt.*;

public interface IDao <T> {

    T registrar(T t);
    List<T> listarOdontologos();


}
