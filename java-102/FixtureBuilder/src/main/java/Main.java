import model.Fixture;
import service.FixtureGenerator;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FixtureGenerator<String> fixtureGenerator = new FixtureGenerator();
        List<String> teams = new LinkedList<String>();
        teams.add("Barcelona");
        teams.add("Real Madrid");
        teams.add("Ajax");
        teams.add("Manchester City");
        List<List<Fixture<String>>> rounds = fixtureGenerator.getFixtures(teams, true);
        for(int i=0; i<rounds.size(); i++){
            System.out.println("Round " + (i+1));
            List<Fixture<String>> round = rounds.get(i);
            for(Fixture<String> fixture: round){
                System.out.println(fixture.getHomeTeam() + " vs " + fixture.getAwayTeam());
            }
            System.out.println("");
        }
    }
}
