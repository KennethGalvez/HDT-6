import java.util.HashMap;

public class Factory <E,F>{

  public HashMap<E,F> getStack(int resp){
    if(resp==1){
      return new HashMap<E,F>();

    }else if(resp==2){

    }else if(resp==3){

    }
    return null;
  }
}
