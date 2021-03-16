package com.fwzhang.test.first.datatype;

import com.fwzhang.first.datatype.BaseTypeInterface;
import com.fwzhang.first.datatype.basetype.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName BaseTypeTest
 * @Description
 * @Author fwzhang
 * @Date 2021/3/2
 * @Version 1.0
 **/

public class BaseTypeTest {

    private static List<BaseTypeInterface> baseTypeInterfaceList = new ArrayList<>();

    static {
        baseTypeInterfaceList.add(new CharTypeHandler());
        baseTypeInterfaceList.add(new BooleanTypeHandler());
        baseTypeInterfaceList.add(new ByteTypeHandler());
        baseTypeInterfaceList.add(new DoubleTypeHandler());
        baseTypeInterfaceList.add(new FloatTypeHandler());
        baseTypeInterfaceList.add(new IntTypeHandler());
        baseTypeInterfaceList.add(new LongTypeHandler());
        baseTypeInterfaceList.add(new ShortTypeHandler());
    }

    public static void main(String[] args) {
        if (Objects.isNull(baseTypeInterfaceList) || baseTypeInterfaceList.size() == 0) {
            System.out.println("静态代码块使用错误");
        }
        // 输出类型描述
        System.out.println("输出类型描述");
        baseTypeInterfaceList.stream().map(BaseTypeInterface::typeDesc).forEach(System.out::println);
        // 输出默认值
        System.out.println("输出默认值");
        baseTypeInterfaceList.stream().map(baseType -> baseType.typeDesc().concat("   ") + baseType.defaultValue())
                .forEach(System.out::println);
        // 输出最大值和最小值，过滤不支持最大值的类型
        System.out.println("输出最大值和最小值");
        baseTypeInterfaceList.stream()
                .filter(BaseTypeInterface::supportMaxMinValue)
                .map(baseType -> baseType.typeDesc().concat("_____") + baseType.maxValue() + "_____" + baseType.minValue())
                .forEach(System.out::println);
    }
}
