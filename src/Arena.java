import java.util.ArrayList;
import java.util.List;

public class Arena {
    private final List<Gladiator> gladiatorList = new ArrayList<>();

    int roundCount = 1;

    public int getAliveGladiatorsCount(){
        return gladiatorList.size();
    }

    public void addGladiatorToArena(Gladiator gl){

        gladiatorList.add(gl);
        System.out.println("Гладіатор " + gl.name + " виходить на арену!");
    }

    public String getGlName(int index) {
        return gladiatorList.get(index).name;
    }


    public void round(){
        System.out.println("Раунд "+ roundCount + " починається. Залишилось "
            + getAliveGladiatorsCount() + " гладіаторів");
        roundCount ++;

        for (int i = 0; i < gladiatorList.size(); i++) {
            int otherGladiatorIndex = (int) (Math.random()*gladiatorList.size());
            if(otherGladiatorIndex != i) {
                gladiatorList.get(i).attack(gladiatorList.get(otherGladiatorIndex));
            }
        }
        List<Gladiator> deadGl = new ArrayList<Gladiator>();
        for (Gladiator gladiator : gladiatorList) {
            if (gladiator.hp <= 0) {
                deadGl.add(gladiator);
            }
        }
        gladiatorList.removeAll(deadGl);

    }



}
