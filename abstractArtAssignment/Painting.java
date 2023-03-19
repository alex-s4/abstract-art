
package abstractArtAssignment;

/**
 * Painting
 */
public class Painting extends Art {

    String paintType;

    public Painting(String title, String author, String description, String paintType){
        super.title = title;
        super.author = author;
        super.description = description;
        this.paintType = paintType;
    }

    @Override
    public void viewArt() {
        System.out.println(String.format("You are viewing %s by %s.\nDescription: %s. It is made of %s.\n", super.title, super.author, super.description, this.paintType));
    }

    
}