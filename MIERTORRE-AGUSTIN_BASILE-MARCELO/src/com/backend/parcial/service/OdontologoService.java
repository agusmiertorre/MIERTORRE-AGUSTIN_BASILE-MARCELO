package com.backend.parcial.service;

import com.backend.parcial.dao.IDao;
import com.backend.parcial.model.Odontologo;

import java.util.List;


public class OdontologoService {
        private IDao<Odontologo> odontologoIDao;


    public OdontologoService(IDao<Odontologo> odontologoIDaoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoIDao.registrar(odontologo);
    }

    public List<Odontologo> listarPacientes(){
        return odontologoIDao.listarOdontologos();
    }



}
