package strings;

public class ConversaoDeStringEtoString {
    // Adaptado do livro Java Referencia completa 8ed
    // Sobreescrevendo toString()

    public static void main(String[] args) {
        Box b = new Box(4,4,4);
        System.out.println(b);
    }

}

class Box{

    double width;
    double height;
    double depth;

    public Box(final double width, final double height, final double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString(){
        return String.format("As dimensões são Largura: %.2f | Altura: %.2f " +
                "| Profundidade: %.2f",width,height,depth);
    }

}
