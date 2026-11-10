// Implementasi 1
public class TransferBank implements Pembayaran {
    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Transfer bank Rp " + jumlah + " berhasil.");
    }
}