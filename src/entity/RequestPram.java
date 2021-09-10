package entity;
/**
 * 请求参数**重点内容**
 */
public class RequestPram {
    //订单号
    private String orderNum;
    //缸号
    private String batchNum;
    //该缸号的具体生产进度
    private String node;
    public String getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }
    public String getBatchNum() {
        return batchNum;
    }
    public void setBatchNum(String batchNum) {
        this.batchNum = batchNum;
    }
    public String getNode() {
        return node;
    }
    public void setNode(String node) {
        this.node = node;
    }
    @Override
    public String toString() {
        return "RequestPram [orderNum=" + orderNum + ", batchNum=" + batchNum + ", node=" + node + "]";
    }
}