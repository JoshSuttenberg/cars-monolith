package study.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class CarsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void addCar(Car car) {
        entityManager.persist(car);
    }

    public Car find(Long id) {
        return entityManager.find(Car.class, id);
    }
}
