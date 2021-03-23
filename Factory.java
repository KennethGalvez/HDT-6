import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Factory <E,F>{

  public Map<E,F> getStack(int resp){
    if(resp==1){
      return new HashMap<E,F>();

    }else if(resp==2){
      return new TreeMap<E,F>();

    }else if(resp==3){
      return new LinkedHashMap<E,F>();
    }
    return null;
  }
}
