package com.corejava.oopsconcept.inheritance;


class bicycle{
    int gear;
    int speed;

   public bicycle(int gear, int speed){

        this.gear=gear;
        this.speed=speed;
    }

    public void applyBreak(int decrement){
       speed -=decrement;

    }

    public void speedUp(int increse){
       speed +=increse;
    }



}

class  MountainBike extends bicycle {

    public int seatHeight;


    public MountainBike(int gear, int speed, int startHight) {
        super(gear, speed);
        seatHeight = startHight;

    }

    public void setSeatHeight(int newVlaue) {

        this.seatHeight = newVlaue;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatHeight=" + seatHeight +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
    public  class InheritanceExample {

        public static void main(String[] args) {


            MountainBike m1 = new MountainBike(1, 60, 5);

            m1.speedUp(5);
            System.out.println(m1.toString());
        }
    }


