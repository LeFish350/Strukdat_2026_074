public abstract class AlatSiber {
    private String ipTarget;

    public AlatSiber(String ipTarget) {
        this.ipTarget = ipTarget;
    }

    public String getIpTarget() {
        return ipTarget;
    }

    abstract void eksekusi();
}