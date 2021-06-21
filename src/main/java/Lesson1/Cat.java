package Lesson1;

public class Cat implements Player{
    private final String name;
    private final int runLimit;
    private final int jumpLimit;
    private boolean play;

    public Cat(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.play = true;
    }


    @Override
    public void jump(Wall wall) {
        if(play) {
            if (jumpLimit >= wall.getHeight()) {
                System.out.println("Кот по кличке " + name + " перепрыгнул препятствие высотой " + wall.getHeight());
                return;
            }
            System.out.println("Кот по кличке " + name + " не перепрыгнул препятствие высотой " + wall.getHeight());
            play = false;

        }

    }

    @Override
    public boolean isPlay() {
        return play;
    }

    @Override
    public void run(Track track) {
        if(play) {
            if (runLimit >= track.getLength()) {
                System.out.println("Кот по кличке " + name + " пробежал трэк длиной " + track.getLength());
                return;
            }
            System.out.println("Кот по кличке " + name + " пробежал трэк длиной " + + track.getLength());
            play = false;

        }

    }

    @Override
    public String toString(){
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
