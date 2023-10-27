package com.backend.parcial.service;

import com.backend.clase.dao.IDao;
import com.backend.clase.model.Medicamento;
import com.backend.parcial.model.Odontologo;

public class OdontologoService {
        private IDao<Odontologo> odontologoIDao;


    public MedicamentoService(IDao<Odontologo> odontologoIDaoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoIDao.registrar(odontologo);
    }

    public odontologo buscarMedicamentoPorId(int id) {
        return medicamentoIDao.buscarPorId(id);
    }


}
