package entity;

import entity.Bill;
import entity.OrderedProduct;
import entity.User;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-02-18T16:35:55")
@StaticMetamodel(Userorder.class)
public class Userorder_ { 

    public static volatile SingularAttribute<Userorder, Integer> id;
    public static volatile SingularAttribute<Userorder, BigDecimal> amount;
    public static volatile ListAttribute<Userorder, OrderedProduct> orderedProductList;
    public static volatile ListAttribute<Userorder, Bill> billList;
    public static volatile SingularAttribute<Userorder, Integer> confirmationNumber;
    public static volatile SingularAttribute<Userorder, User> userid;
    public static volatile SingularAttribute<Userorder, Date> dateCreated;

}