package com.dliriotech.backendtms.data;

import com.dliriotech.backendtms.tables.Equipos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class EquipoDaoImpl implements EquipoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Equipos> listarEquipos() {
        return entityManager.createQuery("SELECT p FROM Equipos p").getResultList();
    }
}
