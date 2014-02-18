package entity;

import entity.Userorder;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-02-18T16:35:55")
@StaticMetamodel(Bill.class)
public class Bill_ { 

    public static volatile SingularAttribute<Bill, Integer> id;
    public static volatile SingularAttribute<Bill, Boolean> isPaid;
    public static volatile SingularAttribute<Bill, Date> datePayment;
    public static volatile SingularAttribute<Bill, Userorder> userorderid;

}