package entity;
/**
 * εεΊεζ°
 */
public class ResponsePram {
    private String resultCode;
    private String desc;

    public ResponsePram() {
        super();
    }
    public ResponsePram( String desc,String resultCode) {
        super();
        this.desc = desc;
        this.resultCode = resultCode;

    }
    public String getResultCode() {
        return resultCode;
    }
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    @Override
    public String toString() {
        return "ResponsePrams [resultCode=" + resultCode + ", desc=" + desc + "]";
    }


}