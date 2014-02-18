package entity;

import entity.Product;
import entity.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-02-18T16:35:55")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Integer> id;
    public static volatile SingularAttribute<Comment, Product> productid;
    public static volatile SingularAttribute<Comment, Short> score;
    public static volatile SingularAttribute<Comment, User> userid;
    public static volatile SingularAttribute<Comment, String> comment;

}