public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail=true;
        plane.trailWidth=2;
//todo: make three rows of squares

        for (int y=0; y<75; y=y+25) {
            plane.teleport(500,y+250);
            plane.setColor(45,y*3,250);

            for (int x = 0; x <255; x = x + 20) {
                plane.pausetime = 1;

                plane.startingAngle(0);

                plane.setColor(170, 50, x);

                System.out.println("x: " + x);
                plane.square(20);
                plane.isTrail = false;
                plane.move(25);



                plane.isTrail = true;
            }

        }
    }
}
