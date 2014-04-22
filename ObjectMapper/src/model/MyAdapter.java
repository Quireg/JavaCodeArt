package model;

import javax.xml.bind.annotation.adapters.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyAdapter {


    public List<Object> unmarshal(String v) throws Exception {
//        if(v == null){
//        return null;}
//        return new List<>(new ArrayList<>());
        return null;
    }


    public String marshal(List<Object> v) throws Exception {
        return null;
    }
}



//    @Override
//    public java.util.Date marshal(java.sql.Date sqlDate) throws Exception {
//        if(null == sqlDate) {
//            return null;
//        }
//        return new java.util.Date(sqlDate.getTime());
//    }
//
//    @Override
//    public java.sql.Date unmarshal(java.util.Date utilDate) throws Exception {
//        if(null == utilDate) {
//            return null;
//        }
//        return new java.sql.Date(utilDate.getTime());
//    }


