package kyu8;

public class RPS {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if (p1.equals("rock") && p2.equals("scissors") ||
                p1.equals("scissors") && p2.equals("paper") ||
                p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 wins!";
        } else {
            return "Player 2 wins!";
        }

//        return p1.equals(p2) ?
//                "Draw!" :
//                "Player " + (
//                        "scissorspaper paperrock rockscissors".contains(p1+p2)?1:2
//                ) + " won!";
    }
}
