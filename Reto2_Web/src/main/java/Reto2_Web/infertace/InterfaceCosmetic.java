package Reto2_Web.infertace;

import Reto2_Web.model.Cosmetic;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
/**
 *
 * @author JhonA
 */
public interface InterfaceCosmetic extends MongoRepository<Cosmetic, String> {
    public List<Cosmetic> findByPrice(double price);
    public List<Cosmetic> findByDescriptionContainingIgnoreCase(String description);
}
