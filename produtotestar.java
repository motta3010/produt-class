public class produtotestar {
    public static void main(String[] args) {
        produto p1 = new produto("caneta", "bic", 1.50f);

        System.out.println("Produto: "+ p1.nome);
        System.out.println("Marca: "+ p1.marca);
        System.out.println("Preço: "+ p1.valor);

        produto p2 = new produto("Lapis","Faber" , 2.5f);
        System.out.println("===================");
        System.out.println("Produto: "+ p2.nome);
        System.out.println("Marca: "+ p2.marca);
        System.out.println("Preço: "+ p2.valor);
    }
}
