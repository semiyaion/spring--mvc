package pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

/**
 * @Classname User
 * @Description TODO
 * @Date 2024/12/3 11:24
 * @Created by cxx
 */
@Data
/*name不为空和空字符串
 * password长度必须大于
 * age必须大于
 * emil必须是邮箱类型
 * birthday必须是过去时间*/
public class User {
    @NotBlank
    private String name;
    @Length(min = 6)
    private String password;
    @Min(1)
    private int age;
    @Email
    private String email;
    @Past
    private Date brithday;
}
