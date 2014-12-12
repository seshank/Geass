package com.ekl.geass.executionNodes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by seshank.koganti on 13/12/14.
 */
public abstract class Node {
    private List<Class<? extends Node>> childNodes = new LinkedList<Class<? extends Node>>();
    private Map<String, Object> attributes = new HashMap<String, Object>();

    public abstract boolean execute() throws Throwable;

    public void setChildNodes(List<Class<? extends Node>> childNodes) {
        if (childNodes != null) {
            this.childNodes.addAll(childNodes);
        }
    }
    public void addChildNode(Class<? extends  Node> childNode) {
        if (childNode != null) {
            this.childNodes.add(childNode);
        }
    }

    public void setAttributes(Map<String, Object> attributes) {
        if (attributes != null) {
            this.attributes.putAll(attributes);
        }
    }

    public void addAttribute(String name, Object value) {
        if (name != null && value != null) {
            this.attributes.put(name, value);
        }
    }

    public boolean executeChildNodes() throws Throwable {
        boolean success = true;
        for(Class<? extends Node> childNode : this.childNodes) {
            success = success ^ childNode.getDeclaredConstructor().newInstance().execute();
        }
        return success;
    }
}
