package cn.xiaoyes.note.day0915;

import java.util.List;

public interface BaseDao<T> {

    boolean add(T t);

    List<T> selectAll();

}
