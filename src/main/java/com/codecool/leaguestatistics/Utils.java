package com.codecool.leaguestatistics;

import com.codecool.leaguestatistics.model.Team;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Provides repetitive methods or data.
 */
public class Utils {

    public static final int TEAM_SIZE = 11;

    /**
     * Gets a random value from range
     */
    public static int getRandomValue(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }



}
