package mytest.pojo;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;

/**
 * @Classname User
 * @Description TODO
 * @Date 2024/12/2 18:27
 * @Created by cxx
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
}
