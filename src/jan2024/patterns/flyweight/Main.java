package jan2024.patterns.flyweight;

public class Main {

    public static void main(String[] args) {
        Bullet bullet =new Bullet();
        bullet.setBulletNo("1");
        var fly = new FlyWheelBullet();
        fly.setCurve("10");
        fly.setRadius("20");

        bullet.setFlyWheelBullet(fly);
        System.out.println(bullet.getBulletNo());
        System.out.println(bullet.getFlyWheelBullet());

    }

}
