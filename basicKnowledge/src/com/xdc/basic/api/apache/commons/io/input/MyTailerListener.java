package com.xdc.basic.api.apache.commons.io.input;

import org.apache.commons.io.input.TailerListenerAdapter;

public class MyTailerListener extends TailerListenerAdapter
{
    public void handle(String line)
    {
        System.out.println(line);
    }
}