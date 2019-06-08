package synchronizedAndVolatile.synchronized_.innerClassTest.innerStaticClass;

import synchronizedAndVolatile.synchronized_.innerClassTest.innerStaticClass.PublicClass.PrivateClass;

/**
 * Created by xianpeng.xia
 * on 2019-06-08 19:46
 */
public class Run {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setUsername("usernameValue");
        publicClass.setPassword("passwordValue");
        System.out.println(publicClass.getUsername() + " " + publicClass.getPassword());

        PrivateClass privateClass = new PrivateClass();
        privateClass.setAge("ageValue");
        privateClass.setAddress("addressValue");
        System.out.println(privateClass.getAge() + " " + privateClass.getAddress());
    }
}
