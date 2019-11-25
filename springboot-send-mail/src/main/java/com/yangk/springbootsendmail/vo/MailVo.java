package com.yangk.springbootsendmail.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.Date;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/11/25
 * @Version 1.0
 * @blame yangkun
 */
@Data
public class MailVo {

    private String id;//邮件id

    private String from;//邮件发送人

    private String to;//邮件接收人（多个邮箱则用逗号","隔开）

    private String subject;//邮件主题

    private String text;//邮件内容

    private Date sentDate;//发送时间

    private String cc;//抄送（多个邮箱则用逗号","隔开）

    private String bcc;//密送（多个邮箱则用逗号","隔开）

    private String status;//状态

    private String error;//报错信息

    @JsonIgnore
    private MultipartFile[] multipartFiles;//邮件附件

    @Override
    public String toString() {
        return "MailVo{" +
                "id='" + id + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                ", sentDate=" + sentDate +
                ", cc='" + cc + '\'' +
                ", bcc='" + bcc + '\'' +
                ", status='" + status + '\'' +
                ", error='" + error + '\'' +
                ", multipartFiles=" + Arrays.toString(multipartFiles) +
                '}';
    }
}
