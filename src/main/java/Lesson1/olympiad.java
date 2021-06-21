package Lesson1;

class Olympiad {
    public static void main(String[] args) {
       Olympiad olympiad = new Olympiad();
       olympiad.play();
    }

    void play(){
        Player[] players = {
                new Human("Вася",5,5),
                new Human("Петя",7, 7),
                new Cat("Барсик",2,3),
                new Robot("Chappi2",10,10)
        };

        Barrier[] course = {
                new Track(5),
                new Wall(10),
                new Track(7),
                new Wall(9),
                new Wall(3)
        };

        for (Barrier barrier : course) {
            for (Player player : players) {
                barrier.overcome(player);
            }
        }

        for (Player player : players) {
            if (player.isPlay()) {
                System.out.println(player);
            }
            
        }

    }
}
