public class Main {
    public static void main(String[] args) {
        AlatSiber pelacak = new Osint("192.168.1.15");
        AlatSiber penguji = new Pentest("10.0.0.5", "<script>alert('HEHEHEHA')</script>");

        System.out.println("=== MEMULAI OPERASI ===");
        pelacak.eksekusi(); 
        System.out.println("-----------------------");
        penguji.eksekusi(); 
    }
}