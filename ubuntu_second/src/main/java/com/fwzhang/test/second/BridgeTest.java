package com.fwzhang.test.second;

import com.fwzhang.second.bridge.natived.CommonKeyBoard;
import com.fwzhang.second.bridge.natived.CommonMouse;
import com.fwzhang.second.bridge.natived.MacComputer;
import com.fwzhang.second.bridge.natived.ThinkPadComputer;

/**
 * 桥接模式测试类
 */
public class BridgeTest {
    public static void main(String[] args) {
        CommonKeyBoard commonKeyBoard = new CommonKeyBoard();
        CommonMouse commonMouse = new CommonMouse();
        MacComputer macComputer = new MacComputer(commonKeyBoard, commonMouse);
        ThinkPadComputer thinkPadComputer = new ThinkPadComputer(commonKeyBoard, commonMouse);
        macComputer.computer();
        thinkPadComputer.computer();
    }
}
