package org.acme.Bike.Service;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class BikeRepository implements PanacheRepository<Bike> {

    @Transactional
    public Bike postBikeAd(Bike bikeData) {
        persist(bikeData);
        return bikeData;
    }
    
}
