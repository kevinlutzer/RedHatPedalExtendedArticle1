package com.redhat.Bike.Service;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Configurable
public class BikeService {
    @Autowired
    BikeRepository bikeRepository;

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Bike> retrieveBikes() {
        return bikeRepository.findAll();
    }

    @Transactional
    public void postBikeAd(Bike bikeData) {
        entityManager.createNativeQuery("INSERT INTO bikes(name, model, price, warranty_status) VALUES (?,?,?,?)")
                .setParameter(1, bikeData.getName())
                .setParameter(2, bikeData.getModel())
                .setParameter(3, bikeData.getPrice())
                .setParameter(4, bikeData.getWarranty_status())
                .executeUpdate();
    }
}