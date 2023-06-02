package com.clement.polo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import java.lang.ref.PhantomReference;

/**
 * @Author Qinghan Huang
 * @Date 2023/6/2 16:52
 * @Desc
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement
public class User {
    private int id;
    private String name;
    private int age;
}
