package comm.offen.test;

import redis.clients.jedis.Jedis;

public class jedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.188.132",6379);
        /*String name = jedis.get("name");
        System.out.println(name);*/
        String set = jedis.set("username", "hunaiqiang");

        System.out.println(jedis.ping());


    }
}
