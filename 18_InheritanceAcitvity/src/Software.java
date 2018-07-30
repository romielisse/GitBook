public class Software extends Product {
    private String version;

    public Software(){
        setCount(getCount()+1);
    }

    public Software(String version) {
        this.version = version;
        setCount(getCount()+1);
    }

    public Software(String code, String description, double price,
                    String version) {
        super(code, description, price);
        this.version = version;
        setCount(getCount()+1);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String toString(String string){
        switch(string.toLowerCase()){
            case "detail":
                return super.toString() + "Version: " + version + "\n";
            case "simple":
                return super.toString();
            default:
                return "Invalid string parameter";
        }
    }
}
