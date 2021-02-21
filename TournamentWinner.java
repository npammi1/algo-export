package com.luv2code;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {


    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        competitions.add(new ArrayList<String>(Arrays.asList("HTML", "C#")));
        competitions.add(new ArrayList<String>(Arrays.asList("C#", "Python")));
        competitions.add(new ArrayList<String>(Arrays.asList("Python", "HTML")));

        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

/*        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));

        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);*/

        System.out.println("Teams are : " + competitions);
        System.out.println("Teams are : " + results);

        String winner = tournamentWinner(competitions, results);
        if ((winner != null)) {
            System.out.println("Winner Team is : " + winner);
        } else {
            System.out.println("no winner and empty result");
        }
    }

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        // for output to record score by Team
        HashMap<String, Integer> score = new HashMap<>();
        Integer points = 3;
        String winnerTeam = null;

        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i);
            Integer result = results.get(i);

            //read each of the 2 teams in the array
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            System.out.println("Home team is : " + homeTeam + " Away Team is : " + awayTeam);


//            String winnerTeam = calculateScore( ,result);
            populateTeamMap(score, points, result, homeTeam, awayTeam);
        }

        System.out.println("score is : " + score);

//        if (score != null && winnerTeam == null) {
        winnerTeam = maxScoreCalculation(score, winnerTeam);
//        }

        if (winnerTeam != null) {
            System.out.println("Winner team is NULL");
        }

        return winnerTeam;
    }

    private static void populateTeamMap(HashMap<String, Integer> score, Integer points, Integer result, String homeTeam, String awayTeam) {
        if (result == 0) {
            if (score.containsKey(awayTeam)) {
                score.put(awayTeam, (score.get(awayTeam) + points));
                System.out.println("Away Team score is : " + score.get(awayTeam));
            } else {
                score.put(awayTeam, points);
                System.out.println("Away Team score is : " + score.get(awayTeam));
            }
        } else {
            if (score.containsKey(homeTeam)) {
                score.put(homeTeam, (score.get(homeTeam) + points));
                System.out.println("Home Team score is : " + score.get(homeTeam));
            } else {
                score.put(homeTeam, points);
                System.out.println("Home Team score is : " + score.get(homeTeam));
            }
        }
    }

    private static String maxScoreCalculation(HashMap<String, Integer> score, String winnerTeam) {
        Integer winnerScore = 0;
        int mapSize = score.size();
        System.out.println("mapzize is : " + mapSize);

        if (mapSize != 0) {
            for (Map.Entry<String, Integer> pair : score.entrySet()) {
                if (winnerScore < pair.getValue()) {
                    winnerScore = pair.getValue();
                    winnerTeam = pair.getKey();
                }
            }

/*            for (int i = 0; i < mapSize; i++) {
                if (winnerScore < score.get(i)) {
                    winnerScore = score.get(i);
                }
            }*/

        }

        return winnerTeam;


    }
}