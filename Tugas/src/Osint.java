public class Osint extends AlatSiber {
    
    public Osint(String ipTarget) {
        super(ipTarget); 
    }

    @Override
    void eksekusi() {
        System.out.println("Scanning target: " + getIpTarget());
        
    }
}