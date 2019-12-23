import static java.util.Objects.hash;

/**
 * @author 喻浩
 * @create 2019-12-23-上午8:21
 */
public class MyHashMap<K,V> {
    
    private Entry<K,V>[] table;
    private static final Integer CAPACITY=8;
    private int size = 0;
    
    public void put(K k,V v){
        //如果 tale 为 null 先初始化数组
        if (table == null){
            inflate();
        }
        
        //存 entry
        //先获取数组下标
        int hashCode = hash(k);
        int index = indexFor(hashCode);
        
        for (Entry<K,V> entry = table[index];entry!=null;entry=entry.next){
            //如果 key 相等，那么直接赋值，退出
            if (entry.key.equals(k)){
                entry.value = v;
                return;
            }
        }
        
        //添加进数组
        addEntry(k,v,index);
        
    }

    private void addEntry(K k,V v, int index) {
        Entry<K,V> newEntry = new Entry<>(k,v,table[index]);
        table[index] = newEntry;
        size++;
    }

    private int indexFor(int hashCode) {
        return hashCode % table.length;
    }

    private int hash(K k) {
        return k.hashCode();
    }

    /**
     * 初始化数组
     */
    private void inflate() {
        table = new Entry[CAPACITY];
    }

    public V get(K k){

        int hashCode = hash(k);
        int index = indexFor(hashCode);

        for (Entry<K,V> entry = table[index];entry!=null;entry=entry.next){
            //如果 key 相等，那么直接赋值，退出
            if (entry.key.equals(k)){
                return entry.value;
            }
        }
        return null;
    }
    
    
    class Entry<K,V> {
        public K key;
        public V value;
        public Entry<K,V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String,String> myHashMap = new MyHashMap<>();
        myHashMap.put("1","1v");
        myHashMap.put("1","2v");
        System.out.println(myHashMap.size);
        System.out.println(myHashMap.get("1"));
    }
}
