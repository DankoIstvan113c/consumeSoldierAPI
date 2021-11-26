package hu.consumeSoldierAPI.domain;

import java.util.Date;

public class Soldier {
    private int id;
    private String rank;
    private Date birth;
    private String weapon;
    private boolean alive;
    private int shotpeople;

    public Soldier() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getShotpeople() {
        return shotpeople;
    }

    public void setShotpeople(int shotpeople) {
        this.shotpeople = shotpeople;
    }
}
