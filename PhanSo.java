public class PhanSo{
    private int tuso;
    private int mauso;

    public PhanSo(int tu, int mau){
        tuso = tu;
        mauso = mau;
    }

    public void SetTuSo(int tu){
        tuso = tu;
    }

    public void SetMauSo(int mau){
        mauso = mau;
    }

    public void Xuat(){
        System.out.println("Phan so la: " + tuso + "/" + mauso);
    }

    public void NghichDao(){
        System.out.println("Phan so nghich dao la: " + mauso + "/" + tuso);
    }

    public void Tong(){
        int sum = tuso + mauso;
        System.out.println("Tong la: " + sum);
    }
}