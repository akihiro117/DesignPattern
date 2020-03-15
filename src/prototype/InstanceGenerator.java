package prototype;

import java.util.HashMap;

/**
 * clone を作成するクラス。
 */
class InstanceGenerator {

    private HashMap<String, Base> instances = new HashMap<String, Base>();

    /**
     * clone したいインスタンスを登録する。
     */
    public void registerInstance(String key, Base target) {
        instances.put(key, target);
    }

    /**
     * clone を作成する。
     * 
     * @param key clone したいインスタンスの key。
     * @return 該当のインスタンの clone。
     */
    public Base generateClone(String key) {
        return instances.get(key).generateClone();
    }
}