package com.amz.problems;

import com.amz.common.AbstractQuestion;
import com.amz.common.NodeR;

import java.util.HashMap;

public class IP_G_CopyListwithRandomPointer extends AbstractQuestion {
    public NodeR copyRandomList(NodeR head) {
        if (head == null) {
            return null;
        }
        HashMap<NodeR, NodeR> map = new HashMap<>();
        NodeR temp = head;
        while (temp != null) {
            map.put(temp, new NodeR(temp.val));
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            NodeR newNodeR = map.get(temp);
            newNodeR.next = map.get(temp.next);
            newNodeR.random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }

    @Override
    public void simulate() {
        // to be written
    }
}
