package com.fwzhang.first.datatype.reftype;

import com.fwzhang.first.datatype.RefTypeInterface;

/**
 * @ClassName StringTypeHandler
 * @Description
 * @Author fwzhang
 * @Date 2021/3/8
 * @Version 1.0
 **/

public class StringTypeHandler implements RefTypeInterface {
    // java9之前String使用char[]数组存储
    // java9之后String使用byte[]数组存储，增加了coder属性及COMPACT_STRINGS属性，减小了占用的空间
    // coder LATIN1 = 0 (ISO-8859-1)
    //       UTF16 = 1
    // java9之后String的很多常用方法中都增加了isLatin1()判断，用于判断coder是否为LATIN1
    // COMPACT_STRINGS && coder == LATIN1;
    // LATIN1 使用StringLatin1类中的方法
    // UTF16 使用StringUTF16类中的方法
    private final byte coder;

    static final boolean COMPACT_STRINGS;

    private final byte UTF16 = 1;
    private final byte LATIN1 = 0;

    static {
        COMPACT_STRINGS = true;
    }

    public StringTypeHandler(byte coder) {
        this.coder = coder;
    }

    public boolean isLatin1() {
        return COMPACT_STRINGS && coder == LATIN1;
    }
}
