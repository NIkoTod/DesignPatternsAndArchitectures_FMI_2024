package Post;

import java.util.List;

import Notify.Notifier;
import Product.Product;



public class Post {

    String postID;
    String ownerId;
    Product product;
    Type type;
    List<String> comments;
    int rating;

    public Post(String ownerId, Product product, Type type, List<String> comments, int rating) {
        this.ownerId = ownerId;
        this.product = product;
        this.type = type;
        this.comments = comments;
        this.rating = rating;

        sendToNotifier(product.toString());

    }

    private void sendToNotifier(String data) {

        Notifier notifier = new Notifier();
        notifier.notify(data);

    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPostID() {
        return postID;
    }
    public void setPostID(String postID) {
        this.postID = postID;
    }



}
