package OOP.Generics;

record BaseballPlayer(String name, String position) {}

public class Main {
    public static void main(String[] args) {

        BaseballTeam philies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houstoun Astros");
        scoreResult(philies, 3, astros, 5);

        var harper = new BaseballPlayer( "B Harper", "Right Filder");
        var mash = new BaseballPlayer("B Mash", "Right Filder");
        philies.addTeamMember(harper);
        philies.addTeamMember(mash);
        philies.listTeamMembers();
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
