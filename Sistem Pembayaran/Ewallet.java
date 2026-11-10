// Implementasi 2
public class Ewallet implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran via E-Wallet Rp " + jumlah + " berhasil.");
    }
}