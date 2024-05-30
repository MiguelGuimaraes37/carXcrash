package io.codeforall.bootcamp;

import io.codeforall.bootcamp.grid.GridType;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Game g = new Game(GridType.LANTERNA, 80, 25, 200);
        Game g = new Game(GridType.SIMPLE_GFX, 80, 25, 200);

        // Test

        g.init();
        g.start();

    }

}
