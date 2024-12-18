package Filter.midLevelFilters;

import Filter.lowLevelFilters.filter;

import java.util.List;

public class filterProcessor {

    public Boolean  processFilters(List<filter<Integer>> filters,int N){

        int M = filters.size();
        int R = 0;
        for(filter _filter: filters){
            R += _filter.executeFilter()?1:0;
            if(R >= N)return true;
        }
        return false;

    }

}
