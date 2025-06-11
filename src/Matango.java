public class Matango {
    int hp;
    final int LEVEL = 10;
    char suffix;

    public void attack(Hero h){
            System.out.println("お化けキノコの攻撃！");
            int d = (int)(Math.random()*10+1);
            h.hp -= d;
            System.out.println(d + "ポイントのダメージをあたえた！");
    }

    public void run(){
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
    }
}
