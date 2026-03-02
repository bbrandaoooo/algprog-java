
public class RegraDecisao {
    public static void main(String[] args) {
        boolean premium = true;
        double compra = 200;
        double compraDesc;

        if (premium == true && compra >= 200) {
            compraDesc = compra - (compra * 0.15);
            System.out.println("Por ser cliente PREMIUM, seu produto que era: R$" + compra + " saiu por: R$" + compraDesc + " com 15% de desconto!");
        } else if (premium == false && compra >= 200) {
            compraDesc = compra - (compra * 0.05);
            System.out.println("Identificamos que voocê não é cliente PREMIUM, mas sua compra acima de R$200 ganhou 5% de desconto, ficando por: R$" + compraDesc);
        } else {
            System.out.println("Sua compra saiu por: R$" + compra);
        }
    }
}
