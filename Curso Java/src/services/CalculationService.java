package services;

import java.util.List;

public class CalculationService {
    public static Integer max(List<Integer> list){
        
        if(list.isEmpty()) throw new IllegalStateException("List can't be empty");

        Integer max = list.get(0);
        for(Integer items : list){
            if(items.compareTo(max) > 0){
                max = items;
            }
        }
        
        return max;
    } 
}
