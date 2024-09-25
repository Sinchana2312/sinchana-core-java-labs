package com.deloitte.lab04.ex03;

abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(int id, String title, int numberOfCopies, int runtime) {
        super(id, title, numberOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " minutes";
    }
}
