package org.acme.Bike.Service;

import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class BikeService {
    @Inject
    BikeRepository bikeRepository;

    @Transactional
    public List<Bike> retrieveBikes() {
        return bikeRepository.listAll(); 
    }

    public Bike postBikeAd(Bike bike) {
        return bikeRepository.postBikeAd(bike);
    }
}
