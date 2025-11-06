public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("New_yorker.jpg");
        plane.showBackGround();

        for (int y = 0; y < 1000; y = y + 1) {
            for (int x = 0; x < 715; x = x + 1) {
                plane.teleport(x/1.2, y/1.2);
                //x<5 is a conditional statement
                //a conditional statement says-- if you do x, then you can do y
                //you either did or did not,and if you did not something else happens that y


                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                System.out.println("Ren: "+x);



                    plane.teleport( 1000-x,  y);
                    plane.setPixelColor(y/4, green , blue/10 );




                }


            }

        plane.pausetime=1/2;
        plane.trailWidth=5;



        plane.teleport(500,500);

        int dinosaur;
        dinosaur=plane.random(0,2);

        if (dinosaur==0){
            plane.house(100);

        }else{//one equals sign is an assignment--which is an action of a variable that we are giving value to--  and that is EXTREMEly diffferent from two equals signs
            //two equals signs represent are for asking a question, like a boolean-- it is asking if one value is the same as another value, another question is <=, is the value less that or equal to another value

            plane.circle(100);
        }


        }


    }
