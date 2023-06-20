package Model;

public class Categorie {

    private String categorie;
    private String description;

    public Categorie() {
    }

    public Categorie(String categorie, String description) {
        this.categorie = categorie;
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
