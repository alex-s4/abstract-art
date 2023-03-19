package abstractArtAssignment;

import java.util.*;

/**
 * Museum
 */
public class Museum{

    public static void main(String[] args) {

        ArrayList<Art> museum = new ArrayList<Art>();

        // Create 3 instances of Painting
        Painting painting1 = new Painting("Starry Starry Night", "Vencent Gang Gogh", "A moderately abstract landscape painting of an expressive night sky over a small hillside village", "oil on canvas");
        Painting painting2 = new Painting("Mona Liza", "Leonardo da Vinci", "The piece features a portrait of a seated woman set against an imaginary landscape", "oil on canvas");
        Painting painting3 = new Painting("Spoliarium", "Juan Luna", "Painting features the basement of the Roman Colosseum where the fallen and dying gladiators are dumped and devoid of their worldly possessions", "oil on poplar");
        
        // Create 2 instances of Sculpture
        Sculpture sculpture1 = new Sculpture("Statue of Liberty", "Frédéric Auguste Bartholdi", "The statue is a personification of liberty in the form of a woman. She holds a torch in her raised right hand and clutches a tablet in her left", "copper");
        Sculpture sculpture2 = new Sculpture("David", "Michelangelo", "The Statue of David embodies the city of Florence, symbolizing independence and strength in the perfect image of youthful beauty", "marble");

        // painting1.viewArt();
        // painting2.viewArt();
        // painting3.viewArt();

        // sculpture1.viewArt();
        // sculpture2.viewArt(); 
        
        // Ninja Bonus: store the paintings and sculptures inside of an ArrayList called museum
        museum.add(painting1);
        museum.add(painting2);
        museum.add(painting3);
        museum.add(sculpture1);
        museum.add(sculpture2);


        // Ninja Bonus: use the viewArt() method of all of the artworks in the museum in a random order
        Collections.shuffle(museum);
        for(int i=0; i<museum.size(); i++){
            museum.get(i).viewArt();
        }
    }
}