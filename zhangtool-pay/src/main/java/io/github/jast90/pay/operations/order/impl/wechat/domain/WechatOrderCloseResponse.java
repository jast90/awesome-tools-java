package io.github.jast90.pay.operations.order.impl.wechat.domain;

import io.github.jast90.pay.domain.wechat.BaseWechatResponse;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class WechatOrderCloseResponse extends BaseWechatResponse {

    private String result_msg;

    public String getResult_msg() {
        return result_msg;
    }

    public void setResult_msg(String result_msg) {
        this.result_msg = result_msg;
    }

}
