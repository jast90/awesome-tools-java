# awesome-pay
面向支付，多语言实现

## 特性
- 不依赖sdk
- 支付参数多种方式配置
- 集成微信支付、支付宝支付
- 多种HTTP 客户端实现

## 微信支付
### 境内普通商户 vs. 境内服务商
TODO 
### 境内普通商户
#### 支付产品接口
- [x] [统一下单](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_1)
- [x] [查询订单](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_2)
- [x] [关闭订单](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_3)
- [x] [申请退款](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_4)
- [x] [查询退款](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_5)
- [x] [下载交易账单-对账](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_6)
- [x] [下载资金账单](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_18&index=7)
- [x] [支付结果通知](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_7&index=8)
- [x] [交易保障](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_8&index=9)
- [x] [退款结果通知](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_16&index=10)
- [x] [拉取订单评价数据](https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_17&index=11)

#### 支付工具接口
##### 代金券或立减优惠
- [ ] [发放代金券](https://pay.weixin.qq.com/wiki/doc/api/tools/sp_coupon.php?chapter=12_3&index=4)
- [ ] [查询代金券批次](https://pay.weixin.qq.com/wiki/doc/api/tools/sp_coupon.php?chapter=12_4&index=5)
- [ ] [查询代金券信息](https://pay.weixin.qq.com/wiki/doc/api/tools/sp_coupon.php?chapter=12_5&index=6)

##### 现金红包
- [x] [发放红包（微信）](https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=13_4&index=3)
- [x] [发放裂变红包（微信）](https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=13_5&index=4)
- [x] [发放红包（小程序）](https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=18_2&index=3)
- [领取红包（小程序，网页调用小程序API）](https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=18_3&index=4)
- [x] [查询红包记录](https://pay.weixin.qq.com/wiki/doc/api/tools/cash_coupon.php?chapter=13_6&index=5)


##### 企业付款
- [x] [企业付款到零钱](https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=14_2)
- [x] [查询企业付款到零钱](https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=14_3)
- [x] [企业付款到银行卡](https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=24_2)
- [x] [查询企业付款银行卡API](https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=24_3)
- [x] [获取RSA加密公钥API](https://pay.weixin.qq.com/wiki/doc/api/tools/mch_pay.php?chapter=24_7&index=4)


##### 分账
- [x] [请求单次分账](https://pay.weixin.qq.com/wiki/doc/api/allocation.php?chapter=27_1&index=1)
- [x] [请求多次分账](https://pay.weixin.qq.com/wiki/doc/api/allocation.php?chapter=27_6&index=2)
- [x] [查询分账结果](https://pay.weixin.qq.com/wiki/doc/api/allocation.php?chapter=27_2&index=3)
- [x] [添加分账接收方](https://pay.weixin.qq.com/wiki/doc/api/allocation.php?chapter=27_3&index=4)
- [x] [删除分账接收方](https://pay.weixin.qq.com/wiki/doc/api/allocation.php?chapter=27_4&index=5)
- [x] [完结分账](https://pay.weixin.qq.com/wiki/doc/api/allocation.php?chapter=27_5&index=6)
- [x] [分账回退](https://pay.weixin.qq.com/wiki/doc/api/allocation.php?chapter=27_7&index=7)
- [x] [回退结果查询](https://pay.weixin.qq.com/wiki/doc/api/allocation.php?chapter=27_8&index=8)
-  [分账动账通知](https://pay.weixin.qq.com/wiki/doc/api/allocation.php?chapter=27_9&index=9) (通过回调地址获取)



### 境内服务商
#### 支付产品接口
#### 支付工具接口
#### 商户入驻

## 支付宝支付
- [x] [alipay.trade.precreate(统一收单线下交易预创建)-扫码支付](https://opendocs.alipay.com/apis/api_1/alipay.trade.precreate)
- [x] [alipay.trade.wap.pay(手机网站支付接口2.0)](https://opendocs.alipay.com/apis/api_1/alipay.trade.wap.pay#%E5%93%8D%E5%BA%94%E5%8F%82%E6%95%B0)
- [x] [alipay.trade.app.pay(app支付接口2.0)](https://opendocs.alipay.com/apis/api_1/alipay.trade.app.pay)
- [x] [alipay.trade.page.pay(统一收单下单并支付页面接口)-PC场景下单并支付](https://opendocs.alipay.com/apis/api_1/alipay.trade.page.pay)
- [x] [alipay.trade.create(统一收单交易创建接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.create)
- [x] [alipay.trade.query(统一收单线下交易查询)()](https://opendocs.alipay.com/apis/api_1/alipay.trade.query)
- [x] [alipay.trade.cancel(统一收单交易撤销接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.cancel)
- [x] [alipay.trade.close(统一收单交易关闭接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.close)
- [x] [alipay.trade.refund(统一收单交易退款接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.refund)
- [x] [alipay.trade.page.refund(统一收单退款页面接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.page.refund)
- [x] [alipay.trade.fastpay.refund.query(统一收单交易退款查询)](https://opendocs.alipay.com/apis/api_1/alipay.trade.fastpay.refund.query)
- [x] [alipay.trade.order.settle(统一收单交易结算接口)](https://opendocs.alipay.com/apis/api_1/alipay.trade.order.settle)
- [x] [alipay.data.bill.accountlog.query(支付宝商家账户账务明细查询-对账)](https://opendocs.alipay.com/apis/api_15/alipay.data.bill.accountlog.query)

## 银联支付

# 应用场景

- 扫码支付：通过支付宝或微信生成与支付订单，生成二维码码串
- 手机网站支付：
- app支付：
- 对账：商户可以通过交易账单接口下载历史交易清单。比如掉单、系统错误等导致商户侧和微信侧数据不一致，通过对账单核对后可校正支付状态。


# 参考
- [微信支付](https://pay.weixin.qq.com/wiki/doc/api/index.html)
- [支付宝支付](https://opendocs.alipay.com/open/00a0ut)
- [银联在线网关支付](https://open.unionpay.com/tjweb/acproduct/APIList?apiservId=448&acpAPIId=754&bussType=0)