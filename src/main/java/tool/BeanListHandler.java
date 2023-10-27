package tool;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BeanListHandler<T>{
    private Class<T> classType;
    public BeanListHandler(Class<T> classType) {
        this.classType=classType;
    }
    public ArrayList<T>  hander(ResultSet resultSet) throws Exception {
        ArrayList<T> list = new ArrayList<>();
        while(resultSet.next()){
            T obj= classType.getConstructor().newInstance();
            BeanInfo bi = Introspector.getBeanInfo(this.classType,Object.class);
            PropertyDescriptor[] pds = bi.getPropertyDescriptors();
            for(PropertyDescriptor pd:pds){
                Object val = resultSet.getObject(pd.getName());
                pd.getWriteMethod().invoke(obj, val);
            }
            list.add(obj);
        }
        return list;
    }

}
