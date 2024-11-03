/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;
 import java.util.Scanner;
/**
 *
 * @author user
 */
public class CekKepribadian {

    // Konstanta untuk warna
    public static final String RESET = "\033[0m";
    public static final String BG_MERAH = "\033[41m";  // Background merah
    public static final String BG_HIJAU = "\033[42m";  // Background hijau
    public static final String BG_KUNING = "\033[43m"; // Background kuning
    public static final String BG_BIRU = "\033[44m";   // Background biru
    public static final String BG_UNGU = "\033[45m";   // Background ungu
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menampilkan header
        System.out.println("\033[36mYUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU\033[0m\n");
        
        // Membuat garis pembatas atas
        System.out.println("╔════════════════════════════════════╗");
        
        // Menampilkan warna-warna dalam kotak dengan background solid
        // Membuat blok warna dengan spasi dan background color
        System.out.println("║     " + BG_MERAH + "            " + RESET + " MERAH          ║");
        System.out.println("║     " + BG_HIJAU + "            " + RESET + " HIJAU          ║");
        System.out.println("║     " + BG_KUNING + "            " + RESET + " KUNING         ║");
        System.out.println("║     " + BG_BIRU + "            " + RESET + " BIRU           ║");
        System.out.println("║     " + BG_UNGU + "            " + RESET + " UNGU           ║");
        
        // Membuat garis pembatas bawah
        System.out.println("╚════════════════════════════════════╝");
        
        // Input warna dan nama
        System.out.print("\nPILIH WARNA FAVORITMU : ");
        String warna = input.nextLine().toLowerCase();
        System.out.print("NAMA KAMU : ");
        String nama = input.nextLine();
        
        // Membuat box untuk hasil
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                HASIL TEST KEPRIBADIAN " + String.format("%-17s", nama.toUpperCase()) + "║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║  Warna Favoritmu adalah " + String.format("%-37s", warna.toUpperCase()) + "║");
        System.out.println("║                                                            ║");
        
        // Menampilkan hasil kepribadian berdasarkan warna
        switch (warna) {
            case "merah":
                printInBox("1. Periang,");
                printInBox("2. Pemberani,");
                printInBox("3. Berani mengambil risiko dalam setiap langkah,");
                printInBox("4. Menyukai tantangan,");
                printInBox("5. Kurang sabar,");
                printInBox("6. Dapat menahan marah namun jika sudah tahap puncak");
                printInBox("   toleransi, kemarahannya akan sulit dikontrol,");
                printInBox("7. Memiliki energi kehangatan dan cinta.");
                break;
                
            case "hijau":
                printInBox("1. Romantis,");
                printInBox("2. Menyukai hal yang berbau alami dan keindahan,");
                printInBox("3. Teguh pada prinsip,");
                printInBox("4. Menginginkan kesempurnaan,");
                printInBox("5. Mudah cemburu,");
                printInBox("6. Mudah merasa iri,");
                printInBox("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
                break;
                
            case "kuning":
                printInBox("1. Optimis,");
                printInBox("2. Suka bergaul,");
                printInBox("3. Periang,");
                printInBox("4. Senang menolong,");
                printInBox("5. Lincah dan aktif,");
                printInBox("6. Tidak suka meremehkan kekurangan orang lain,");
                printInBox("7. Loyal,");
                printInBox("8. Hangat,");
                printInBox("9. Meskipun karakternya optimis dan idealis,");
                printInBox("   seringkali goyah dan tidak stabil.");
                break;
                
            case "biru":
                printInBox("1. Menyenangkan,");
                printInBox("2. Bijaksana,");
                printInBox("3. Pembawaan diri tenang saat menghadapi masalah,");
                printInBox("4. Dinamis,");
                printInBox("5. Senang berbagi,");
                printInBox("6. Bersahabat,");
                printInBox("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                printInBox("8. Menyembunyikan perasaan karena karakternya yang");
                printInBox("   cenderung mencari jalan damai.");
                break;
                
            case "ungu":
                printInBox("1. Optimis,");
                printInBox("2. Tidak pernah ragu,");
                printInBox("3. Menurutnya pasangan yang ideal adalah yang memiliki");
                printInBox("   mental yang kuat,");
                printInBox("4. Memiliki ambisi yang besar,");
                printInBox("5. Memiliki empati yang besar,");
                printInBox("6. Memiliki sisi misterius sebab seringkali menutupi");
                printInBox("   perasaannya,");
                printInBox("7. Terkadang bersikap keras kepala dan angkuh.");
                break;
                
            default:
                printInBox("Warna yang anda masukkan tidak valid!");
                break;
        }
        
        // Menutup box hasil
        System.out.println("╚════════════════════════════════════════════════════════════╝");
        
        input.close();
    }
    
    // Method untuk mencetak teks dalam box
    private static void printInBox(String text) {
        System.out.println("║  " + String.format("%-58s", text) + "║");
    }
}