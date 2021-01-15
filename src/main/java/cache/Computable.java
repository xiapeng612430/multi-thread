package cache;

/**
 * @date 2021/01/15
 * @time 15:19
 */
public interface Computable<A, V> {

    V compute(A arg) throws Exception;
}
