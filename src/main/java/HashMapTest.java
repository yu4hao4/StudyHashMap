import java.util.HashMap;

/**
 * @author 喻浩
 * @create 2019-11-21-23:48
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<String, String>();

//        System.out.println(1^1);

//        System.out.println(Integer.highestOneBit(15));
//        System.out.println(Integer.highestOneBit(15));

        int i = 10;
        System.out.println(10 >>> 1);
        i |= (i >>  1);
        i |= (i >>  2);
        i |= (i >>  4);
        i |= (i >>  8);
        i |= (i >> 16);
        System.out.println(i - (i >>> 1));
        System.out.println(10 << 1);

        //异或 相同为0 不相同为1
        System.out.println(1^0);
        
        //与 相同为1 不同为0
        
        //hashmap 初始化 2的立方  为了与运算（？）
    }
}
