/**
 * @author 喻浩
 * @create 2019-12-23-上午8:07
 */
public class Hash {
    public static int hash(int i){
        return ((i+2) << 2 % 8)^5;
    }

    public static void main(String[] args) {

        System.out.println(hash(2));
        System.out.println(hash(10));
        System.out.println(hash(11));
        System.out.println(hash(12));
        System.out.println(hash(15));
        
        "67".hashCode();
        
    }
}
