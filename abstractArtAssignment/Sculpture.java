
package abstractArtAssignment;

/**
 * Sculpture
 */
public class Sculpture extends Art {

    String material;

    public Sculpture(String title, String author, String description, String material){
        super.title = title;
        super.author = author;
        super.description = description;
        this.material = material;
    }

    @Override
    public void viewArt() {
        System.out.println(String.format("You are viewing %s by %s.\nDescription: %s. It is made of %s.\n", super.title, super.author, super.description, this.material));
    }

    
}