package Archive;

import Post.Post;

import java.util.*;

public class Archive {
    List<Post> posts;
    Map<String, List<Double>> ModelPrice;
    //some cache can be added

    public Archive() {
        posts = new ArrayList<>();
        ModelPrice = new HashMap<>();
    }

    public void serialize(){
        //readFile?
    }

    public void deserialize(){
        //WritePosts
    }

    public void add(Post post){
        posts.add(post);
        addValue(post);
    }

    private void addValue(Post post){
        String key = post.getProduct().archiveString();
        if(!ModelPrice.containsKey(key)){
            ModelPrice.put(key,new ArrayList<>());
        }
         ModelPrice.get(key).add(post.getProduct().getPrice().getX());//we can concatenate to key current year
    }

    public Double getAveragePrice(String modelPrice){
        modelPrice = modelPrice.toLowerCase();
        if(ModelPrice.containsKey(modelPrice)){
            Double sum = 0.0;
            for(Double num : ModelPrice.get(modelPrice)){
                sum+=num;
            }
            return sum/ModelPrice.get(modelPrice).size();
        }
        return -1.0;
    }

}
