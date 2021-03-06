package org.qunar.plugin.mybatis.bean;

import com.intellij.util.xml.DomElement;
import com.intellij.util.xml.GenericAttributeValue;

/**
 * dom element has required id attribute
 *
 * Author: jianyu.lin
 * Date: 16-11-29 Time: 下午8:00
 */
public interface IdDomElement<T> extends DomElement {

    @SuppressWarnings("EmptyMethod")
    GenericAttributeValue<T> getId();
}
