package org.fkit.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

// @XmlRootElement表示XML文档的根元素
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book implements Serializable {
    @XmlElement
    private Integer id;
    @XmlElement
    private String name;
    @XmlElement
    private String author;
}
