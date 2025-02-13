package Product.Utils;

import Filter.lowLevelFilters.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QParser {

    public List<expression> parse(String q){
        List<String> l = Arrays.stream(q.split("&")).map(String::trim).toList();
        List<List<String>> r = l.stream().map(e -> List.of(e.split(" "))).toList();
        List<expression> exl = new ArrayList<>();
        for(List<String> e : r){
            if(e.get(2).contains("'") || e.get(2).contains("\"")){
                String trim = e.get(2).replaceAll("'","").replaceAll("\"","");
                exl.add(new expressionBinaryString(e.get(0), e.get(1).charAt(0) , trim));
            }
            else {exl.add(new expressionBinaryDigit(e.get(0), e.get(1).charAt(0) , Double.parseDouble(e.get(2))));}
        }

        return exl;

    }
}
