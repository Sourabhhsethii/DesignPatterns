package com.dxsys.code.mosh.advance.genrics.problem;

public class User implements Comparable<User> {

    private int points;

    public  User(int points){
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // this < o 0 -> -1
        // this == 0  -> 0
        // this > 0   -> 1
        return points - other.points;
    }
}
