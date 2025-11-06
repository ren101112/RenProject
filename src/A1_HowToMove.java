public class A1_HowToMove extends World {

    int width;
    int redcolor;
    int greencolor;
    int bluecolor;


    public void go() {//public means "I'm creating" and void means "a method" so a public void is basically saying that I am creating a method

        System.out.println("This message will be printed to the window below.");
        width=plane.random(0,10);
        redcolor=plane.random(1,255);
        bluecolor=plane.random(1,255);
        greencolor=plane.random(1,255);


       // plane.teleport(130,500);
        //plane.fillCircle(124);
        triangle(50);
        square(100);
        square(200);
        square(50);
        triangle(124);
        triangle(250);
        //todo: add  a parameter to triangle that controls how big the triangle is




    }// methods cannot go inside another method like this one
    public void square(int size){

        plane.setColor(redcolor,bluecolor,greencolor);
        plane.pausetime = 1;
        plane.startingAngle(90);//methods have parenthesis
        plane.isTrail = true;//a variable has an equals sign
        plane.move(size);
        redcolor=plane.random(1,255);
        bluecolor=plane.random(1,255);
        greencolor=plane.random(1,255);
        plane.setColor(redcolor,bluecolor,greencolor);
        plane.turn(90);

        plane.isTrail = true;
        plane.move(size);

        plane.turn(90);
        redcolor=plane.random(1,255);
        plane.setColor(redcolor,bluecolor,greencolor);
        plane.isTrail = true;
        plane.move(size);
        plane.turn(90);
        redcolor=plane.random(1,255);
        plane.setColor(redcolor,bluecolor,greencolor);

        plane.move(size);



    }
    public void triangle(int trianglesize){
//parameters are variables-- they are special types of variables that are defined inside the parenthesis of a method and they can only be used in the confines of the method
        plane.startingAngle(0);
        plane.isTrail=true;
        plane.trailWidth=width;
        plane.setColor(241,123,230);
        plane.move(trianglesize);
        plane.turn(120);
        plane.move(trianglesize);
        plane.turn(120);
        plane.move(trianglesize);


    }

}//you cannot make a method outside of the class i.e the last bracket

