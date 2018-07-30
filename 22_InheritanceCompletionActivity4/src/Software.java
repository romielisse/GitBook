public final class Software extends Product {
    private String version;
    private String platform; //Linux, Mac or PC
    private String os;

    public Software(){
        setCount(getCount()+1);
    }

    public Software(String version) {
        this.version = version;
        setCount(getCount()+1);
    }

    public Software(String code, String description, double price, String
            version, String platform, String os) {
        super(code, description, price);
        this.version = version;
        this.platform = platform;
        this.os = os;
        setCount(getCount()+1);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString(){
        return super.toString() + "Version: " + version + "\n";
    }
}
