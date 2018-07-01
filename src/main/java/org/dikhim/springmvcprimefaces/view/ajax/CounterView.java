package org.dikhim.springmvcprimefaces.view.ajax;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class CounterView implements Serializable {

    private int number;

    public int getNumber() {
        return number;
    }

    public void increment() {
        System.out.println(String.format("number:%s",number));
        number++;
    }
}