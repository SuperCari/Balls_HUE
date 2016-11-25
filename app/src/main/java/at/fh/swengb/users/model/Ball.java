package at.fh.swengb.users.model;

import java.io.Serializable;

/**
 * Created by Carina on 25.11.2016.
 */

public class Ball implements Serializable {

    private String producer;
    private String color;
    private double size;
    private boolean jumps;

    public Ball(String producer, String color, double size, boolean jumps) {
        this.producer = producer;
        this.color = color;
        this.size = size;
        this.jumps = jumps;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public boolean isJumps() {
        return jumps;
    }

    public void setJumps(boolean jumps) {
        this.jumps = jumps;
    }
}
