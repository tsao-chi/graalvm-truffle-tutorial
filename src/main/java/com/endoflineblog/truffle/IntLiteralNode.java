package com.endoflineblog.truffle;

import com.oracle.truffle.api.frame.VirtualFrame;

public class IntLiteralNode extends EasyScriptExprNode {
    private final int value;

    public IntLiteralNode(int value) {
        this.value = value;
    }

    @Override
    public int executeInt(VirtualFrame frame) {
        return this.value;
    }
}
