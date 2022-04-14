package com.codecool.leaguestatistics.model;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Provides all necessary statistics of played season.
 */
public class LeagueStatistics {

    /**
     * Gets all teams with highest points order, if points are equal next deciding parameter is sum of goals of the team.
     */
    public static List<Team> getAllTeamsSorted(List<Team> teams) {
        Comparator<Team> compareByPoints = Comparator
                .comparing(Team::getCurrentPoints, Comparator.reverseOrder())
                .thenComparing(team -> team.getPlayers()
                        .stream().mapToInt(Player::getGoals).sum(), Comparator.reverseOrder());
        teams = teams.stream().sorted(compareByPoints).collect(Collectors.toList());
        return teams;
    }

    /**
     * Gets all players from each team in one collection.
     */
    public static List<Player> getAllPlayers(List<Team> teams) {

        return teams.stream()
                .flatMap(team -> team.getPlayers().stream())
                .collect(Collectors.toList());
    }

    /**
     * Gets team with the longest name
     */
    public static Team getTeamWithTheLongestName(List<Team> teams) {
        return teams.stream()
                .sorted(Comparator.comparing(team -> team.getName().length()))
                .collect(Collectors.toList())
                .get(teams.size()-1);
    }

    /**
     * Gets top teams with least number of lost matches.
     * If the amount of lost matches is equal, next deciding parameter is team's current points value.
     * @param teamsNumber The number of Teams to select.
     * @return Collection of selected Teams.
     */
    public static List<Team> getTopTeamsWithLeastLoses(List<Team> teams, int teamsNumber) {
        Comparator<Team> compareByLoses = Comparator
                .comparing(Team::getLoses)
                .thenComparing(Team::getCurrentPoints, Comparator.reverseOrder());


        teams = teams.stream().sorted(compareByLoses).collect(Collectors.toList());
        return teams.subList(0, Math.min(teamsNumber, teams.size()));
    }

    /**
     * Gets a player with the biggest goals number from each team.
     */
    public static List<Player> getTopPlayersFromEachTeam(List<Team> teams) {
        List<Player> topPlayers = new ArrayList<>();
        teams.stream().forEach(team -> topPlayers.add(team.getBestPlayer()));
        return topPlayers;
    }

    /**
     * Gets all teams, where there are players with no scored goals.
     */
    public static List<Team> getTeamsWithPlayersWithoutGoals(List<Team> teams){
        throw new RuntimeException("getTeamsWithPlayersWithoutGoals method not implemented");
    }

    /**
     * Gets players with given or higher number of goals scored.
     * @param goals The minimal number of goals scored.
     * @return Collection of Players with given or higher number of goals scored.
     */
    public static List<Player> getPlayersWithAtLeastXGoals(List<Team> teams, int goals) {
        throw new RuntimeException("getPlayersWithAtLeastXGoals method not implemented");
    }

    /**
     * Gets the player with the highest skill rate for given Division.
     */
    public static Player getMostTalentedPlayerInDivision(List<Team> teams, Division division) {
        throw new RuntimeException("getMostTalentedPlayerInDivision method not implemented");
    }

    /**
     * OPTIONAL
     * Returns the division with greatest amount of points.
     * If there is more than one division with the same amount current points, then check the amounts of wins.
     */
    public static Division getStrongestDivision(List<Team> teams) {
        throw new RuntimeException("getStrongestDivision method not implemented");
    }
}
