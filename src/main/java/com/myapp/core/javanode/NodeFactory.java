package com.myapp.core.javanode;

import java.net.URL;

/**
 * Created by amit mahajan on 1/16/2017.
 */
public interface NodeFactory {
    public NodeUtils getInstance(URL nodeURL, String commandLine);
}
