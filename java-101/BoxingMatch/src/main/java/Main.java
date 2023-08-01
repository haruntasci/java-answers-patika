import models.Fighter;
import models.Ring;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Fighter marc = new Fighter("Marc", 15, 100, 90, 0);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 0);
        int randomChance = random.nextInt(2);
        Ring r;
        if(randomChance==0){
            r = new Ring(marc, alex, 90, 100);
        }
        else{
            r = new Ring(alex, marc, 90, 100);
        }

        r.run();
    }
}