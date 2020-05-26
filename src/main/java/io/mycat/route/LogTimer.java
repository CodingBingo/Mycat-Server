package io.mycat.route;

/**
 * @author 鸣人
 * @version V1.0
 * @package io.mycat.route
 * @date 2020/5/26 22:39
 */
public class LogTimer {
    private String uuid;

    private long receiveSqlTime;

    private long sendToMysqlTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getReceiveSqlTime() {
        return receiveSqlTime;
    }

    public void setReceiveSqlTime(long receiveSqlTime) {
        this.receiveSqlTime = receiveSqlTime;
    }

    public long getSendToMysqlTime() {
        return sendToMysqlTime;
    }

    public void setSendToMysqlTime(long sendToMysqlTime) {
        this.sendToMysqlTime = sendToMysqlTime;
    }
}
