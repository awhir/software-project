package entity;

import entity.Comment;
import entity.Userorder;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-02-18T16:35:55")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> username;
    public static volatile ListAttribute<User, Userorder> userorderList;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Comment> commentList;

}