package com.dliriotech.backendtms.data;

import com.dliriotech.backendtms.tables.Neumaticos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class NeumaticoDaoImpl implements NeumaticoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Neumaticos> listarNeumaticos() {
        return entityManager.createQuery("SELECT p FROM Neumaticos p").getResultList();
    }
}
