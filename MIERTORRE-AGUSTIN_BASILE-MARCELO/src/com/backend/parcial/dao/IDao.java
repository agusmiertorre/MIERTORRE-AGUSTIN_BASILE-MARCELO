package com.backend.parcial.dao;

import com.backend.parcial.model.Odontologo;

public interface IDao <T> {

    T registrar(T t);
    T listarOdontologos(Odontologo odontologo);


}
