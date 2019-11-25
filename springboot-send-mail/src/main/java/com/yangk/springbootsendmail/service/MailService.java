package com.yangk.springbootsendmail.service;

import com.yangk.springbootsendmail.vo.MailVo;
import org.springframework.stereotype.Service;

/**
 * 邮件业务类 MailService
 */
@Service
public interface MailService {

    /**
     * @Description 发送邮件
     * @Author yangkun
     * @Date 2019/11/25
     * @Param [mailVo]
     * @Return
     **/
    MailVo sendMail(MailVo mailVo);

    /**
     * @Description 获取邮件发信人
     * @Author yangkun
     * @Date 2019/11/25
     * @Param []
     * @Return
     **/
    String getMailSendFrom();

}