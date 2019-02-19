/*Jeremy Chan jsc126
  Lennox Wildman law136
  EECS 293 HW2
  Cache class 
*/
package parser;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.function.Function;

final class Cache<T,V>{
    private Map<T,V> cache = new HashMap<T,V>();

    /*@param T key : key for value
  @param Function<? super T, ? extends V> constructor>: 
      Constructor function for creating new object of type T
  @return value stored in cache, or new object created if not in cache*/
    V get(T key, Function<? super T, ? extends V> constructor){

        //null testing
        Objects.requireNonNull(key,"Key is null.");
        Objects.requireNonNull(constructor,"Constructor is null.");

        if(cache.containsKey(key)){
            return cache.get(key);
        }
        else{
            V obj = constructor.apply(key);
            cache.put(key, obj);
            return obj;
        }
    }
}
