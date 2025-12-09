public class RenProject extends World{

    public void go(){
        plane.pausetime=0;
        Buildings(100,430,60,170);
        Buildings(180,460,90,140);
        Buildings(190,370, 70,90);
        for (int p=0;p<1;p++) {
            plane.teleport(205, 370);
            plane.setColor(1, 1, 1);
            plane.startingAngle(-90);
            plane.isTrail = true;
            plane.trailWidth = 8;
            plane.move(30);
            plane.trailWidth = 3;
            plane.move(20);

            plane.teleport(240, 370);
            plane.setColor(1, 1, 1);
            plane.startingAngle(-90);
            plane.isTrail = true;
            plane.trailWidth = 8;
            plane.move(30);
            plane.teleport(245, 340);
            plane.trailWidth = 3;
            plane.move(20);
        }//I put the antenna into a loop that goes once so i can compress the code
        DomeBuilding(500,540,120,60);
        Buildings(300,460,100,140);
        Buildings(320,320,80,140);//these 3 are the sears tower
        Buildings(320,250,40,70);
        for(int k=0;k<1;k++) {
            plane.isTrail = true;
            plane.setColor(1, 1, 1);
            plane.teleport(330, 250);
            plane.startingAngle(-90);
            plane.trailWidth = 4;
            plane.move(72);
            plane.teleport(350, 250);
            plane.startingAngle(-90);
            plane.move(72);
        }//using a loop that goes once so I can compress the code
        plane.teleport(0,0);
        river();







    }
    public void river(){
        plane.isTrail = true;
        plane.trailWidth = 60;
        plane.setColor(20, 50, 180);   // deep blue

        plane.teleport(0, 650);
        plane.startingAngle(0);        // face right
        plane.move(800);

        // Lighter water highlight
        plane.trailWidth = 40;
        plane.setColor(80, 120, 255);  // lighter blue
        plane.teleport(0, 660);
        plane.startingAngle(0);
        plane.move(800);


    }

    public void Buildings(int x, int y, int width, int height) {//this is the method that can build a building

        plane.teleport(x, y); // move to the position that we set up top
        plane.startingAngle(90); // face upward
        plane.isTrail = true;
        plane.trailWidth=1;
        plane.setColor(1,1,1);

        // Draw the rectangular body of the building
        for (int structure = 0; structure < 2; structure++) {
            plane.move(height); // go up or down
            plane.turn(90);
            plane.move(width);  // go across the top or bottom
            plane.turn(90);
        }

        // i need an if statement so this draws a roof if the building is wide
        if (width > 50) {
            // Flat roof
            plane.move(5);
            plane.turn(90);
            plane.move(width);
            plane.turn(90);
        }


        // Add windows using a nested loop
        plane.teleport(x+5,y+10);

        for (int row = 1; row < width; row = row + 10) {
            for (int col = 1; col < height-10; col = col + 15) {
                plane.trailWidth=3;
                plane.isTrail=true;
                plane.teleport(x+row, y+col);// creates a grid of plane windows

                int windowcolor;
                windowcolor=plane.random(0,2);

                if(windowcolor==0) {//uses a variable to make a random color for each of the windows
                    plane.setColor(255, 230, 100);
                }else{
                    plane.setColor(120,120,150);

                }
                plane.startingAngle(0);
                plane.move(5);// actually draws the windows horizontally
                plane.isTrail=false;

                


            }

}}
    public void DomeBuilding(int x, int y, int width, int height) {
        plane.teleport(x, y);
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 1;
        plane.setColor(1, 1, 1);

        // Draw the rectangular body of the building
        for (int structure = 0; structure < 2; structure++) {
            plane.move(height);
            plane.turn(90);
            plane.move(width);
            plane.turn(90);
        }


        // Move to the center top of the building to start the dome
        plane.teleport(x + width/2, y + height);



        int domeRadius = 40;
        int center = x + width / 2;  // Center X of the building

          //creates layers of decreasing width on each side of the center
        for (int layer = 0; layer < domeRadius; layer++) {
            plane.teleport(center, y - layer);  // Start from center top, moving UP
            plane.startingAngle(0);  // Face right
            plane.isTrail = true;

            // Calculate how wide this layer should be using pythagorean theorum
            double layerWidth = Math.sqrt(domeRadius * domeRadius - layer * layer);

            // Draw right half of this horizontal layer

            plane.move(layerWidth);

            // Draw left half
            plane.teleport(center, y - layer);
            plane.startingAngle(180);  // Face left
            plane.move(layerWidth);
        }
        plane.teleport(center,y);
        plane.startingAngle(-90);
        plane.isTrail=true;
        plane.setColor(1,1,1);
        plane.trailWidth=2;
        plane.move(domeRadius);//fills in the wierd line that is in between the two halves of the dome

        plane.teleport(x+5,y+10);
        for (int row = 1; row < width; row = row + 10) {//I used the same code from the first method for the square building to make thw windows
            for (int col = 1; col < height-10; col = col + 15) {
                plane.trailWidth=3;
                plane.isTrail=true;
                plane.teleport(x+row, y+col);// creates a grid of plane windows

                int windowcolor;
                windowcolor=plane.random(0,2);

                if(windowcolor==0) {//uses a variable to make a random color for each of the windows
                    plane.setColor(255, 230, 100);//the if statement randomizes each color of the windows to two options
                }else{
                    plane.setColor(120,120,150);

                }
                plane.startingAngle(0);
                plane.move(5);// actually draws the windows horizontally
                plane.isTrail=false;




            }

        }}



        }















