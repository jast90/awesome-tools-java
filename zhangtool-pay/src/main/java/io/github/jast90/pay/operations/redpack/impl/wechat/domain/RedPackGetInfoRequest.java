package io.github.jast90.pay.operations.redpack.impl.wechat.domain;

import io.github.jast90.pay.domain.wechat.BaseWechatRequest;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")
public class RedPackGetInfoRequest extends BaseWechatRequest {
    private String mch_billno;
    private String bill_type;

    public String getMch_billno() {
        return mch_billno;
    }

    public void setMch_billno(String mch_billno) {
        this.mch_billno = mch_billno;
    }

    public String getBill_type() {
        return bill_type;
    }

    public void setBill_type(String bill_type) {
        this.bill_type = bill_type;
    }
}
