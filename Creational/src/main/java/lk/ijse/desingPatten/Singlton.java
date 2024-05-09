package lk.ijse.desingPatten;

import java.io.Serializable;

/**
 * @version: v0.0.1
 * @author: Navishka
 * @date: 5/9/2024
 */
public class Singlton implements Serializable {

    private static Singlton singlton = new Singlton();

    public static Singlton getInstance(){
//        if (singlton == null){
//            synchronized(Singlton.class){
//                if (singlton == null){
//                    singlton = new Singlton();//instance will be created at request time
//                }
//            }
//        }
        return singlton;
    }




}
