package be.ehb.vbexamen.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String naam;
    private int prijsPerStuck;
    private int aantal;
    private String categorie;

    public Item(String naam, int prijsPerStuck, int aantal, String categorie) {
        this.naam = naam;
        this.prijsPerStuck = prijsPerStuck;
        this.aantal = aantal;
        this.categorie = categorie;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPrijsPerStuck() {
        return prijsPerStuck;
    }

    public void setPrijsPerStuck(int prijsPerStuck) {
        this.prijsPerStuck = prijsPerStuck;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
