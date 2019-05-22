package com.CoreTechnology.Chapter06;

import java.util.Comparator;

/**
 * @ClassName DesComparator
 * @Auther trappedBeast
 * @Date 2018/11/28 16:18
 * @Version 1.0
 * @Description TODO
 **/
public class DesComparator<T> implements Comparator<Employee> {


    @Override
    public int compare(Employee o1,Employee o2) {
        if(o1.getSalary()>o2.getSalary())
            return 1;
        if(o1.getSalary()<o2.getSalary())
            return -1;
        long thisBit=Double.doubleToLongBits(o1.getSalary());
        long otherBit=Double.doubleToLongBits(o1.getSalary());
        return (thisBit==otherBit?0:(thisBit>otherBit?1:-1));

    }





}
    