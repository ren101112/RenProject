public class ExitTicket extends World {
//todo: make a method called go (dont forget your curly brackets and parenthesis)

    //todo: in go method make variable of type intiger called distance with random value
    //todo draw a line the length of distance

    public void go(){

        int distance;

        for(int x=0;x<4;x++){
            plane.isTrail=true;
            plane.setColor(100,100,100);
            //todo:


            distance=plane.random(1,100);

            plane.move(distance);
            plane.turn(90);


        }



    }











}
