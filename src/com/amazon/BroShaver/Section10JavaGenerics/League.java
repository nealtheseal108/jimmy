package com.amazon.BroShaver.Section10JavaGenerics;

import java.util.ArrayList;

public class League <T extends Team> {
    private String leagueName;
    private ArrayList<T> teams;

    public League(String leagueName) {
        this.leagueName = leagueName;
        teams = new ArrayList<>();
    }

    public boolean add(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in this league.");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " was added to the " + this.leagueName + ".");
            return true;
        }
    }

    public ArrayList<T> showLeagueTable() {
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i; j < teams.size(); j++) {
                if (teams.get(i).ranking() < teams.get(j).ranking()) {
                    Team less = teams.get(j);
                    Team more = teams.get(i);
                    teams.set(j, (T) more);
                    teams.set(i, (T) less);
                }
            }
        }
        for (int i = 0; i < teams.size(); i++){
            System.out.println((i + 1) + ". " +teams.get(i).getName());
        }
        return teams;
    }
}
