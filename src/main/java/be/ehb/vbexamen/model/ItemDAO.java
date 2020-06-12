package be.ehb.vbexamen.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemDAO extends CrudRepository<Item, Integer> {

    public List<Item> findItemById(int id);
    public List<Item> findItemByCategorie(String categorie);

    

}
